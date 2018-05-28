https://github.com/in28minutes/

Zuul for API Gateway.
Instead of making a microservice to call other MS directly,all the calls go through API gateway.API gateway provide some common
features like authentication,service calls are logged. one of the best feature using APIG is analytics.

Netflix provides API gateway in ZUUL.

-> Any service request need to go through API Gateay must follow tye below URI structure

#Zuul uses Appname in the URL  to talk to Eureka and find the URL of the service.

http://localhost:{zuul server port}/{application_name}/{application uri}

http://localhost:8765/currency-exchange-service/currency-exchange/from/{from}/to/{to}

#Sample url / output from Zuul when invoke currency conversion that goes through API Gate

URI : http://localhost:8100/currency-convertor-feign/from/EUR/to/INR/quantity/45

2018-05-24 10:08:19.772  INFO 1332 --- [nio-8765-exec-4] c.l.n.ZuulLoggingFilter                  :
 The request is  -> org.springframework.cloud.netflix.zuul.filters.pre.Servlet30RequestWrapper@20b3d761
  request uri -> /currency-exchange-service/currency-exchange/from/EUR/to/INR.


------------------------
