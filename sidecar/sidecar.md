# Prerequisites 
## Start minikube
```zsh
minikube start
```

## Run minikube dashboard
```zsh
minikube dashboard
```

# Build Main & Side Car Project
## Go to the folder structure and run the following command
```zsh
mvn clean package
```

## Steps

### Step 1: Point Docker to Minikube's Docker daemon
```zsh
eval $(minikube docker-env)
```
### Step 2: Build Main & Side Docker file

```zsh
docker build -t main-image:latest .

```

```zsh

docker build -t side-image:latest .
```

### Step 3: Setup Side Car pom.xml file
```

```



