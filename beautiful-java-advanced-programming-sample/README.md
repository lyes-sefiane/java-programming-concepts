# Beautiful Advanced Java Programming

## Case Study / Class Diagram

![alt text](https://raw.githubusercontent.com/lsefiane/beautiful-java-programming-sample/master/beautiful-java-advanced-programming-sample/src/main/resources/image/Design.PNG)

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

**7.2 <T> Instantiation**

Example

```
public class MyClass<T> {

	public MyClass(){
		new T(); // <-- No
	}

} 
```

## Advanced Data Structures

**1. Collection Framework in Java** 

[Image Source](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)

![alt text](https://raw.githubusercontent.com/lsefiane/beautiful-java-programming-sample/master/beautiful-java-advanced-programming-sample/src/main/resources/image/collection-framework-hierarchy-in-java.jpg)

**2. List** 

- An ordered collection, also known as a sequence.

**2.1 Performance : Linked List vs Array List**

**2.1.1 Search**

- ArrayList search is fast O(1) compared to LinkedList O(n) :  
  - ArrayList maintains index for its elements as it uses an array to store them. 
  - LinkedList uses a double Linked List which requires the traversal through all the elements for searching one. 

**2.1.2 Deletion**

- LinkedList remove operation gives O(1) performance while ArrayList gives variable performance: O(n) in worst case (first element) and O(1) in best case (last element).
  -  ArrayList : If any element is removed from the array, all the bits are shifted in memory.
  - LinkedList : Uses a doubly linked list, so no bit shifting is required in memory.
  
**2.1.3 Insertion**

- LinkedList add method gives O(1) performance while ArrayList gives O(n).

**2.2 ArraList and LinkedList Usage**

- Frequent insertion and deletion operations ->  LinkedList is a best choice.
- More search operations -> ArrayList  is a best choice.

**2. Queue** 

- Holds elements about to be processed in FIFO(First In First Out) order.
- The most common classes are the PriorityQueue and LinkedList. 

**3. Map**

- An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value. 

**3.1. HashMap**

- Makes no guarantees as to the order.

**3.2. LinkedHashMap**

- Same as HashMap with the ability of maintaining an order of elements inserted into it.

## Input and Output (I/O)

- Buffered Reader

```
BufferedReader reader = Files.newBufferedReader(pathToFile);

reader.lines().collect("Collectors.toList());
```

- Using try-with-resources

```
try(BufferedReader reader =  Files.newBufferedReader(pathToFile);) {

	reader.lines().collect(Collectors.toList());
	
}
```


## Files and Directories

**1. File I/O (Featuring NIO.2)** 

- File or Directory Verification

```
Files.exists(path_to_file_directory)
```

- File Creation

```
Files.create(path_to_file_name)
```

- File Copy

```
Files.copy(path_to_file_name_source, path_to_file_name_destination);
```

- File Deletion

```
Files.deleteIfExists(path_to_file_name)
```








































