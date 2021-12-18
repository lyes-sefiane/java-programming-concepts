# Behavioral Design Patterns

## Chain of Responsibility Pattern

-  Creates a chain of receiver objects for a request. Decouples sender and receiver of a request based on type of request.

<h3> When to Use It ? </h3>

- When you want to decouple a request sender and receiver.
- Multiple objects, determined at runtime, are candidates to handle a request.
- When you don't want to specify handlers explicitly in your code.


## Command Pattern

- Encapsulates commands (method calls) in objects allowing to issue requests without knowing the requested operation or the requesting object.

<h3> When to Use It ? </h3>

- You want to support undo/redo operations.
- You want queueing or logging requests to be performed at different times.


## Interpreter Pattern

- Defines a grammatical representation for a language and provides an interpreter to deal with this grammar.

<h3> When to Use It ? </h3>

- You want to create custom regular expressions
- You want to create a compiler
- You want to create language translator
- You want to create SQL Parser


## Iterator Pattern

- Provides you a way to access the items in a collection without exposing its underlying representation (list, stack, tree, etc.).

<h3> When to Use It ? </h3>

- You want to access elements of a collection without exposing the internal structure of elements.


## Mediator Pattern

- Defines an object that encapsulates how a set of objects interact.

<h3> When to Use It ? </h3>

- You want to reduce communication complexity between multiple objects or classes.


## Memento Pattern

-  Lets you save and restore the previous state of an object without revealing the details of its implementation.

<h3> When to Use It ? </h3>

- You want to save state and restore it later, without violating encapsulation. 

## Observer Pattern

-  Notifies automatically the observers when any state changes.

<h3> When to Use It ? </h3>

- You have several objects which are dependent on another object and are required to perform an action when the state of that object changes.
- An object needs to notify others without knowing who they are or how many there are.

## State Pattern

-  Allows objects to change their behavior based on the current state.

<h3> When to Use It ? </h3>

- You want to avoid a large if/else blocks or switch statements.
- You have an object that behaves differently depending on its current state.

## Strategy Pattern

-  Enables selecting an algorithm at runtime. 

<h3> When to Use It ? </h3>

- You want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.

## Template Method Pattern

-  Allows you to defines a skeleton of an algorithm in a base class and let subclasses override the steps without changing the overall algorithm's structure. 

<h3> When to Use It ? </h3>

- You have two or more implementations of a similar algorithm.
- You want to implement the common parts of an algorithm once.
- You have classes that duplicates the same code.

## Visitor Pattern

-  Provides a way of separating an algorithm from an object structure on which it operates. 

<h3> When to Use It ? </h3>

- You have similar operations to be performed on objects of different types. 
- You have to define a new operation without changing the classes of the elements in the composite.