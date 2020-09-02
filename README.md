# zuul-eureka-poc
This POC consists in three modules.
* Eureka: Standard Eureka Registry set up
* Simple Service: a simple web service, with @EnableDiscoveryClient to be picked up by eureka and in it's application.properties, eureka.instance.metadata-map.routes: /pricing/** 
  This change will allow Zuul instance to get a grip of the service's routes.
 * Zuul instance: An standard Zuul set up, with the exception that we extend DiscoveryClientRouteLocator, to populate the available routes with whatever routes the services
 exposed in the metadata-map.routes.
