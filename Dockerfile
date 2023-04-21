FROM openjdk:8

RUN mkdir /usr/myapp

COPY target/backend-base-1.0-SNAPSHOT.jar /usr/myapp

WORKDIR /usr/myapp

ENTRYPOINT ["java", "-jar", "-Xmx512m", "backend-base-1.0-SNAPSHOT.jar", ">/home/lpb/code/backend-base/log/backend-base-java.log 2>&1"]

CMD [">", "/home/lpb/code/backend-base/log/backend-base.log"]
