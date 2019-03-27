# Spring Boot with Angular

Overview

## Description

## Demo

## Features

- feature:1
- feature:2

## Requirement

## Usage

### Build Angular CLI Docker image

- `$ vim Dockerfile`

```
FROM node:10.15-stretch

RUN npm install -g @angular/cli@7.3.6

WORKDIR /app
```

```
$ docker build -t angular:7.3.6 .
```

### Run Angular App from Docker image

- `$ vim docker-compose.yml`

```
version: "3"
services:
  client:
    image: angular:7.3.6
    build: .
    command: bash -c "npm install && ng serve --host 0.0.0.0"
    volumes:
      - ./angularclient:/app
      - /app/node_modules/
    ports:
      - "4200:4200"
```

```
$ docker-compose up
```

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/44f0f4de510b4f2b918fad3c91e0845104092bff/LICENSE)

## Author

[shinyay](https://github.com/shinyay)