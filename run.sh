#!/bin/bash
# git stash save
# git pull
mvn clean package -DskipTests=true
docker stop backend-base
docker rm backend-base
docker image rm backend-base:v1.0.0
docker build . -f Dockerfile -t diet-recommend:v1.0.0
docker run -d --name backend-base -p 8085:8888 backend-base:v1.0.0 > /home/lpb/code/backend-base/log/backend.log 2>&1
