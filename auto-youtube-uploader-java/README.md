
# 🎥 Auto YouTube Channel Generator

**Upload. Schedule. Generate. Automate.**  
A full-stack Java + Spring Boot + React project to automate your YouTube channel with video generation and scheduling.

---

## 📦 Features
- Upload videos to YouTube via API
- Schedule uploads automatically
- Generate videos using FFmpeg
- Frontend + backend + Docker ready

## 🔧 Tech Stack
- Java 17 + Spring Boot
- React.js
- FFmpeg
- Docker & Docker Compose
- YouTube Data API v3

---

## 🚀 How to Use

### 1. Clone the Repository
```bash
git clone https://github.com/Heyvaibhav07/auto-youtube-uploader-java.git
cd auto-youtube-uploader-java
```

### 2. Add `client_secrets.json` to `backend/`

### 3. Build the backend
```bash
cd backend
./mvnw install
```

### 4. Install frontend dependencies
```bash
cd ../frontend
npm install
```

### 5. Run the full stack with Docker
```bash
docker-compose up --build
```

---

## 📁 Project Structure

```
auto-youtube-uploader-java/
├── backend/
│   ├── src/main/java/com/vaibhav/youtubeauto/
│   │   ├── ScheduledUploader.java
│   │   ├── VideoGenerator.java
├── frontend/
│   └── src/App.js
├── Dockerfile
├── docker-compose.yml
├── README.md
```

---

## 📸 Preview

![UI Screenshot](https://user-images.githubusercontent.com/yourid/your-ui-preview.png)

## 🔒 License

MIT License © 2025 Vaibhav R
