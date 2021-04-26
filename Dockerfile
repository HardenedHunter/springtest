FROM openjdk:15

RUN mkdir -p /apps
COPY /target/springdeploytest-0.0.1-SNAPSHOT.jar /apps/app.jar
COPY /entrypoint.sh /apps/entrypoint.sh

RUN chmod +x /apps/entrypoint.sh
CMD ["/apps/entrypoint.sh"]