FROM ubuntu:noble

RUN apt-get -y update && apt-get -y install openjdk-21-jdk && apt-get -y clean

ADD memusage.java /

RUN javac memusage.java

