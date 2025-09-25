FROM ubuntu:latest
LABEL authors="quang"

ENTRYPOINT ["top", "-b"]