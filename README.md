# DesignPrinciples
Implemented a different types of Bird classes to define SOLID principles
Five Types of birds -Pigeon,Sparrow,Crow,Ostrich,Penguin

Single Responsibility Principle implemented in such a way Bird abstract class will have only common attributes and methods alone .All bird types will extend bird class
and they bird type class have specific bird type method implementations
Open/Close can be implemented as we can create new bird with ease of extensibility and maintanability by creating new class for Bird
Liskov Substitution principle implemented -Penguin and ostrich cannot fly ,so we didnt implement flyable interface 
Interface Segregration -Birds which can fly can implement flyable interface and those whoo cannot fly no need to implement them.
Dependency Inversion-No 2 direct concrete classes dependent on each other.Sparrow and Crow will fly in same ways.So to achieve this we have created a new class Commonfly 
which implementins Flyable Interface and so fly methods of Sparrow and Crow can override and implement fly method from coomonfly
Sparrow class dependent on commomfly class through flyable interface
