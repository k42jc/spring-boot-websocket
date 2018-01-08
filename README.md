# spring-boot-websocket
Spring-boot websocket server demo,includes connect,client message send,sever message send.see:[Getting started Spring Boot Websocket](https://spring.io/guides/gs/messaging-stomp-websocket/)

# spring-boot websocket示例项目
通过Spring-boot创建websocket服务，搭配socketJS实现客户端/服务端实时消息推送

## 演示步骤

* git clone git@github.com:k42jc/spring-boot-websocket.git
* cd spring-boot-websocket
* mvn spring-boot:run
* open http://localhost:8811,click connect,once connect success input your name and send
* try POST http://localhost:8811/message/send with application/json data: {"data":"test data"},will see server send smg to client
