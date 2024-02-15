To ensure robust authentication and authorization across microservices, we have implemented two API gateways with different security approaches:

1 - API Gateway with Spring Security:  run the api -gateway server 
This gateway utilizes Spring Security for authentication and authorization.
To run this server, simply execute.

2 - API Gateway with Keycloak Server: run the api-gateway-keyclock 
1.Before running this server, ensure Keycloak Server is installed on your machine.
2.Create a realm and a client within Keycloak.
3.Replace the issuer-url in the application.yml file with the appropriate URL from your Keycloak realm.
4.Implement OAuth2-based authentication in the postman or similar tool.
5.Obtain a token for the user and include it in requests.
