# Spark hello world with kubernetes

A simple hello world using Apache Spark

### Minikube Setup
Install and run [Minikube](https://kubernetes.io/docs/setup/minikube/):

#### Start the cluster:
```sh
$ minikube start --driver=docker --cpus=4 --memory=8096
$ minikube dashboard
```

#### Build the Docker image:

```sh
$ eval $(minikube docker-env)
$ docker build -t spark -f ./docker/Dockerfile ./docker
```

#### Create the deployments and services:
```sh
$ kubectl create -f ./kubernetes/spark-master-deployment.yaml
$ kubectl create -f ./kubernetes/spark-master-service.yaml
$ kubectl create -f ./kubernetes/spark-worker-deployment.yaml
$ minikube addons enable ingress
$ kubectl apply -f ./kubernetes/minikube-ingress.yaml
```
#### Verifying the Setup
Run below command to verify that both spark master and spark worker deployments are started.
```sh
$ kubectl get po
```
Please note that exact name of the pod will differ from machine to machine.

Once we verified the pods, verify the service using below command
```sh
$ kubectl describe svc spark-master
```

#### Access the Spark UI:
```sh
$ kubectl port-forward spark-master-6d58cf7f4c-jkzxh 8080:8080
```

#### stop the cluster:
```sh
$ minikube stop
```
