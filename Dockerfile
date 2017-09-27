FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/graphql-layer-poc.jar /graphql-layer-poc/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/graphql-layer-poc/app.jar"]
