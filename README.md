# Ignite-Microservice-Sessions

Session - 1
 Spring Boot + Spring Cloud (Configuration Server) : 
 1. Build a microservice(Customer)
 2. Build a Configuration Server based microservice(Config-Server)
 3. Host the configurations of microservices(Customer) on Configuration Server(Config-Server)
 
 Execution Plan:
  1. Start config-server with "mvn spring-boot:run"
  2. Start Customer microservice "mvn spring-boot:run"
  3. Access the sample request "localhost:9090/customer/welcome"
