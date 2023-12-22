FROM ubuntu:latest
LABEL authors="daniklean"

ENTRYPOINT ["top", "-b"]