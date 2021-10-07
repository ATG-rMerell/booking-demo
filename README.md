# ATG Booking Service

## A Laundry Room Booking System
Imagine there's a house with 20 households, they share 2 laundry rooms. The rooms are bookable
between 8-20 every day in three fixed time slots.
Write a backend service that allows the individuals in the house to book a laundry time for any
laundry room.
#### The service should:
- Book (an available) laundry time
- List booked times
- Allow cancellations

## Tech stack
- Spring boot
- Java
- H2 in memory DB
- Jpa (for easy DB access)
### Swagger endpoint localhost
http://localhost:8081/swagger-ui/



### Help Section
 The service consists of three layers:
 * Controller layer (the "way in". Here we expose rest endpoints for others to call.)
 * Service layer (middle layer, here we usually keep all business logic, and rules)
 * Repository layer (database integration, for simplicity we use JPA here for easy db scripting)

These layer communicate though dependency injected beans [link](https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring#field-based-dependency-injection). For example, by injecting the service layer into the Controller layer, the Controller layer can then use the public methods within the service layer. See example in the BookingController.class

In the **Controller layer**, to be able to book a time, there is a need to input some data fields. For example which laundry room, which time slot and more, to be able to input multiple fields in the same request we use  [@RequestBody](https://www.baeldung.com/spring-request-response-body#@requestbody)

We also might use a [@PathVariable](https://www.baeldung.com/spring-pathvariable#a-simple-mapping) if we simply want to pass an ID through the request.

For the **Repository section** we use a library called [JPA](https://spring.io/guides/gs/accessing-data-jpa/)
