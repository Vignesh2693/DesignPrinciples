# SOLID DesignPrinciples
Implemented a different types of Bird classes to define SOLID principles
Five Types of birds -Pigeon,Sparrow,Crow,Ostrich,Penguin

i)Single Responsibility Principle implemented in such a way Bird abstract class will have only common attributes and methods alone .All bird type chikd classes will extend parent bird class . The bird type child classes will have specific bird type method implementations

ii)Open/Close can be implemented as we can create new bird with ease of extensibility and maintanability by creating new class for Bird

iii)Liskov Substitution principle implemented -Penguin and ostrich cannot fly ,so we didnt implement flyable interface 

iv)Interface Segregration -Birds which can fly can implement flyable interface and those whoo cannot fly no need to implement them.

v)Dependency Inversion-No 2 direct concrete classes dependent on each other.Sparrow and Crow will fly in same ways.So to achieve this we have created a new class Commonfly which implementins Flyable Interface and so fly methods of Sparrow and Crow can override and implement fly method from coomonfly
Sparrow class dependent on commomfly class through flyable interface
