docker build -t kloudpod/javaapp .
docker run -p 8080:8080 -e JAVA_OPTS=-Dserver.port=8080 kloudpod/javaapp