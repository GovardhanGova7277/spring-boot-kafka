# Spring Boot Kafka Producer-Consumer Demo

This project demonstrates asynchronous communication using Apache Kafka with Spring Boot. It implements the producer-consumer pattern by exposing REST APIs to publish messages and consuming them in real time.

## Overview

The application allows clients to send both plain text and JSON messages to Kafka topics. Producers publish messages to Kafka, and consumers listen to those topics and process the data asynchronously.

## Key Features

- REST APIs for publishing messages  
- Support for both string and JSON payloads  
- Kafka producers and consumers integration  
- Automatic topic creation on application startup  
- Clear separation of controller, service, and configuration layers  

## Architecture Flow

### Plain Text Message Flow
1. Client sends a request with a message  
2. Controller receives the request  
3. Producer sends the message to Kafka topic `messages`  
4. Consumer listens to the topic and processes the message  

### JSON Message Flow
1. Client sends a POST request with JSON data  
2. Request is mapped to a User object  
3. Producer sends the object to Kafka topic `messages_json`  
4. Consumer listens and processes the message  

## API Endpoints

### Health Check
`GET /hello?name=YourName`

### Publish Plain Text Message
`GET /api/v1/kafka/publish?message=hello`

### Publish JSON Message
`POST /api/v1/kafka/publish-json`  
Content-Type: `application/json`

```json
{
  "id": 1,
  "firstName": "John",
  "lastName": "Doe"
}
