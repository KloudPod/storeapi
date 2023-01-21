
# Store API

A Springboot Web API, that demonstrates a sample REST API.
It has documentation available in OpenAPI 3. It can accessed at http://localhost:8080/swagger-ui/index.html

This application is Dockerized for the interest of deploying it in ECR.

Inorder for you to deploy it in a local machine follow the following docker commands as listed below.

## Run Locally

Clone the project

```bash
  git clone git@github.com:KloudPod/storeapi.git
```

Go to the project directory

```bash
  cd storeapi
```

Build Docker Image on local

```bash
  docker build -t kloudpod/javaapp .
```

Run the Image as a container

```bash
  docker run -d -p 8080:8080 -e JAVA_OPTS=-Dserver.port=8080 kloudpod/javaapp
```


## Authors

- [@vmathew](https://github.com/vmathew)

