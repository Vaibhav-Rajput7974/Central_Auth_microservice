To ensure robust authentication and authorization across microservices, we have implemented two API gateways with different security approaches:

API Gateway with Spring Security:  run the api -gateway server 
This gateway utilizes Spring Security for authentication and authorization.
To run this server, simply execute the provided script.
API Gateway with Keycloak Server: run the api-gateway-keyclock 
Before running this server, ensure Keycloak Server is installed on your machine.
Create a realm and a client within Keycloak.
Replace the issuer-url in the application.yml file with the appropriate URL from your Keycloak realm.
Implement OAuth2-based authentication in the postman or similar tool.
Obtain a token for the user and include it in requests.
