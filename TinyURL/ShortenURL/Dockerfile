FROM tomcat:10.1-jdk17-corretto

# Change Tomcat's default port from 8080 to 9091
RUN sed -i 's/port="8080"/port="9091"/g' /usr/local/tomcat/conf/server.xml

COPY build/libs/ShortenURL-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 9091

# The default CMD ("catalina.sh run") is already in the base image