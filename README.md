DesignPatternsExample
=====================

This project delivers the implementation of a number of design patterns which  are listed in this Readme.  
Each pattern is implemented in its own package within an Eclipse project.  
The implementation includes one or more unit tests that demonstrate the pattern’s implementation.  
The unit tests are implemented using the JUnit framework.

Design Patterns  
=====================

Creational Patterns 

1. Singleton Pattern : Implements an simple example of the Singleton Pattern.  
2. Factory Pattern: Implemenst a factory that implements a number of DAO 
service interfaces e.g. CustomerDAO, ItemDAO, TransactionDAO, etc.  
3. Abstract Factory Pattern: Implements a virtual factory that implements the 
same collection of DAO services interfaces, but for multiple 
implementations e.g. MySQL, Oracle, and SqlServer.  
4. Builder Pattern: Implements a builder for a complex object requiring 
several assembly steps before the object is finished.   

Behavioral Patterns  

5. Observer Pattern: Implement an Observable that allows Observers to be 
added and removed. The Observable implementation will support notifying 
multiple Observers.  
6. Visitor Pattern: Transverses a tree and return a value derived from each of 
the tree’s nodes e.g. average, min, max, etc.  

Structural Patterns  

7. Façade Pattern: Implements a façade services that access two or more 
DAOs e.g. a CustomerManagement service that CRUDs Customers and 
associated Addresses. The façade  provide / implement cohesive 
service methods. The DAOs are a mock meaning they do not  
store information in a DBMS but  maintain information in an in-memory 
Map.  
8. Proxy Pattern: Implements a distributed client proxy to a 
distributed service.  

Concurrency Patterns  

9. Object Pool Pattern: Implements a simple object pool. The pool is thread safe and utilize a max size 
parameter. As with any pool implementation, it should be possible to 
return and reuse objects. A thread that attempts to retrieve from an empty 
(fully occupied) pool  blocks or receive null.  

Architecture Patterns  

10. Pipes and Filters: a socket / network based solution that 
communicates between multiple processes. Each filter is  an active object which relies on 
blocking input pipes to control their execution. Pipes are memory 
based.  
Note: Unix (and OS X?) provides a OS construct named FIFO. These are 
special files that can be opened, written to, and read from as normal files. 
However they act as pipes in that data written to a FIFO will be retained 
until a second process read from the pipe. Unfortunately, Windows does 
not offer a service with the same flexibility
