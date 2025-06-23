FROM openjdk:17-slim

WORKDIR /app

RUN apt-get update && apt-get install -y unzip curl

RUN curl -L -o source.zip https://github.com/ague1/docker-messanger/archive/refs/heads/main.zip && \
    unzip source.zip && \
    mv docker-messanger-main/Main.java . && \
    rm -rf source.zip docker-messanger-main

RUN javac Main.java

ENTRYPOINT ["java", "Main"]