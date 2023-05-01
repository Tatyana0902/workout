FROM node:16
#RUN mkdir -p /app
WORKDIR /usr/src/app
COPY package*.json ./
COPY HelloWorld.js ./
RUN npm --verbose install --force
EXPOSE 3000
ENTRYPOINT ["node","--inspect","HelloWorld.js", "--verbose"]
