FROM platten/alpine-oracle-jre8-docker

WORKDIR /

MKDIR lib
COPY target/dependency/lib/ lib

CMD java -jar stack-service-web-0.0.1-SNAPSHOT-exec.jar