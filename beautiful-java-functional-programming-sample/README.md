# Beautiful Java Functional Programming

## Functional Programming Concepts

- Immutability
- Pure Functions
- Functions as First-Class

**1. Immutability**

- Immutability means unable to change. Variable state cannot change once it has been initialized.

```
final int x = 5;
```

**2. Pure Functions**

A function is a pure function if :

- The execution of the function has no side effects.
- Always return the same output given the same input

Example :

```
int add(int x, int y){
	return x + y;
}
```


**3. Functions as First-Class**

Functions are treated like any other variable. It can be : 

- Passed as an argument to other functions.
- Returned by another function.
- Assigned as a value to a variable.

Example :

```
Calculator<Integer, Integer> add = (a,b) -> a + b;
```

## Functions as First-Class : Deep Dive

**1. Function Interface**

```
interface Function<T, R> {}

  <T> the type of the input to the function
  <R> the type of the result of the function
```
Consists on 4 methods :

**1.1 apply()**

```
R apply(T t);
```

**1.2 andThen()**

```
default <V> Function<T, V> andThen(Function<? super R, ? extends V> after)
```

**1.3 compose()**

```
default <V> Function<V, R> compose(Function<? super V, ? extends T> before)
```

**1.4 identity()**

```
static <T> Function<T, T> identity()
```

**2. Lambda Expressions**

- Short block of code which takes in parameters and returns a value, usually passed as parameters to a function.

Syntax 

```
parameter -> expression

(parameter1, parameter2) -> expression

(parameter1, parameter2) -> { code block }

```

**3. Closures**

- Class functions with bounded variables.

Syntax 

```
(argument_list) -> {func_body}
```

**4. Higher Order Functions**

- Function that either takes one or more function as an argument or returns the function as a result.

```
BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> getList() {}
```