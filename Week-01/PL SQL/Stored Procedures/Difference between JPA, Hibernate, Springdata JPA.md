### Difference Between JPA ,Hibernate  and Spring Data JPA:



##### JPA:

&#x09;JPA (Java Persistence API) is a specification that defines standard APIs and annotations for mapping Java objects to database tables. It does not provide an implementation.



##### Hibernate:

&#x09;Hibernate is an ORM framework that implements the JPA specification and performs the actual database operations.



##### Spring Data JPA:

&#x09;Spring Data JPA is a Spring module that works on top of Hibernate and reduces boilerplate code by providing built-in repository methods.



##### Comparison:



|Hibernate|Spring Data JPA|
|-|-|
|Open Session|Automatic|
|Begin Transaction|@Transactional|
|Save Object|save()|
|Commit Transaction|Automatic|
|Close Session|Automatic|
|Exception Handling|Handled by Spring|

&#x09;



##### Conclusion: 



&#x09;JPA is the specification, Hibernate is the implementation of JPA, and Spring Data JPA is a Spring framework module that uses Hibernate to simplify database access and reduce boilerplate code.

