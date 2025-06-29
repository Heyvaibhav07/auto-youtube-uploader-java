
import React, { useState } from 'react';
import axios from 'axios';

function App() {
  const [text, setText] = useState('');
  const [imagePath, setImagePath] = useState('');
  const [videoPath, setVideoPath] = useState('');

  const generateVideo = async () => {
    const response = await axios.post("http://localhost:8080/api/generate", {
      text,
      imagePath,
      outputPath: "output.mp4"
    });
    setVideoPath(response.data.outputPath);
  };

  return (
    <div style={{ padding: "2rem" }}>
      <h1>🎬 Auto YouTube Channel Generator</h1>
      <input type="text" placeholder="Text" onChange={(e) => setText(e.target.value)} /><br/>
      <input type="text" placeholder="Image Path" onChange={(e) => setImagePath(e.target.value)} /><br/>
      <button onClick={generateVideo}>Generate Video</button>
      <p>{videoPath && `Video saved to: ${videoPath}`}</p>
    </div>
  );
}

export default App;
