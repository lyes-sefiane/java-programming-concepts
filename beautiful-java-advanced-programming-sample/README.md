# Beautiful Advanced Java Programming

## Case Study / Class Diagram

![alt text](https://github.com/lsefiane/beautiful-java-programming-sample/blob/master/beautiful-java-advanced-programming-sample/src/main/resources/image/Design.PNG)

## Generics

- Generics means parameterized types.

**1. Generic Class**

Syntax

```
class name<T1, T2, ..., Tn> { /* ... */ }
```

Example

```
public class Device<T> { }

	<T> the device type
```

**2. Generic Interface**

Syntax

```
interface name<T1, T2, ..., Tn> { /* ... */ }
```

Example

```
public interface Comparable<T> { }

	<T> the type of objects that this object may be compared to
```

**3. Generic attribute**

Syntax

```
T t
```

Example

```
public class Pair<K, V> {

    public final K key;
    public final V value;
    
}
```


**4. Generic Method**

Syntax

```
T name(T1 param1,..., Tn paramN) {}
```

Example

```
default V putIfAbsent(K key, V value) {
   V v = get(key);
   if (v == null) {
       v = put(key, value);
    }

     return v;
}
```


**5. Generic Naming Convention**

- The most commonly used type parameter names are:

```
E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
```

**6. Generics with Wildcards**

- Wildcard represents an unknown type -> (?).

Example

```
Pair<String,?> pair
```

**6.1 Unbounded wildcard parameterized type**

- A generic type where all type arguments are the unbounded wildcard "?” without any restriction on type variables.

Example

```
List<?> list = new ArrayList<>();  
```

**6.2 Bounded wildcard parameterized type**

- Bounded wildcards put some restrictions over possible types.



**6.2.1 Upper bounded wildcards**

- Upper bound wildcard uses "extends" keyword.

Example

```
List<? extends T> list = new ArrayList<>();  
```


**6.2.2 Lower bounded wildcards**

- Lower bound wildcard uses "super" keyword.

Example

```
List<? super T> list = new ArrayList<>();  
```

**7 What is not allowed to do with Generics ?**

**7.1 Static field type**

Example

```
private static T t; // <-- No  
```

**7.2 <T> instantiation**

Example

```
public class MyClass<T> {

	public MyClass(){
		new T(); // <-- No
	}

} 
```
