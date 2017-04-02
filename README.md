Simple project to help setup application using spring-boot,apache-cxf rest, spring-boot-jpa, spring-boot-integration-test, jbehave bdd's with serenity reports and gatling performance tests

Running the application :
        
    mvn spring-boot:run

by default application runs on port 8080 (you can change port by updating port info @/src/main/resources/application.yml)
 
swagger url available at : `http://localhost:8080/services/api/api-docs?url=/services/api/swagger.json`

To run Jbehave test cases: `mvn -Dtest=JBehaveStories integration-test`
  
To run gatling:     `mvn gatling:test`    
