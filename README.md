# Design Patterns - Java

### Factory
A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object 
but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the 
instance of the class.

The Factory Method Pattern is also known as Virtual Constructor.

##### Advantage of Factory Design Pattern
* Factory Method Pattern allows the sub-classes to choose the type of objects to create.
* It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code. That means 
the code interacts solely with the resultant interface or abstract class, so that it will work with any classes that 
implement that interface or that extends that abstract class.

##### Usage of Factory Design Pattern
* When a class doesn't know what sub-classes will be required to create
* When a class wants that its sub-classes specify the objects to be created.
* When the parent classes choose the creation of objects to its sub-classes.

### Abstract Factory
Abstract Factory Pattern says that just define an interface or abstract class for creating families of related 
(or dependent) objects but without specifying their concrete sub-classes.That means Abstract Factory lets a class 
returns a factory of classes. So, this is the reason that Abstract Factory Pattern is one level higher than the 
Factory Pattern.

An Abstract Factory Pattern is also known as Kit.

##### Advantage of Abstract Factory Pattern
* Abstract Factory Pattern isolates the client code from concrete (implementation) classes.
* It eases the exchanging of object families.
* It promotes consistency among objects.
##### Usage of Abstract Factory Pattern
* When the system needs to be independent of how its object are created, composed, and represented.
* When the family of related objects has to be used together, then this constraint needs to be enforced.
* When you want to provide a library of objects that does not show implementations and only reveals interfaces.
* When the system needs to be configured with one of a multiple family of objects.

### Singleton
Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational 
pattern as this pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only single 
object gets created. This class provides a way to access its only object which can be accessed directly without need 
to instantiate the object of the class.

### Builder
Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design 
pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

A Builder class builds the final object step by step. This builder is independent of other objects.

##### Advantage of Builder Design Pattern
The main advantages of Builder Pattern are as follows:

* It provides clear separation between the construction and representation of an object.
* It provides better control over construction process.
* It supports to change the internal representation of objects.

### Information Source
Information and ocding example taken from [here](https://www.javatpoint.com/design-patterns-in-java) and 
[here](https://www.tutorialspoint.com/design_pattern/index.htm)
