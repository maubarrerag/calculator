FROM java:8
ADD calculator.jar app.jar
ADD wrapper.sh wrapper.sh
RUN bash -c 'touch /app.jar'
RUN bash -c 'chmod a+x wrapper.sh'
ENTRYPOINT ["/bin/bash", "/wrapper.sh"]