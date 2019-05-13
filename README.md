TODO
- continue course

# Java-basics-recap
A strong foundation is what makes progress easier and higher goals achievable

# basicstreams package
- BasicStream.java contains an example of a basic stream using lambda to add the values of a list. <understanded>
- WildCards.java contains an example of an unbound Wildcard. You can see that creating it with any type of object works fine but adding to it is not possible.
- UpperBoundWildcards.java <? extends Number>the idea of using an upper bound on a wild card allows you to tell the compiler what type youre expecting and also allows you to provide elements that are that type of subclasses of that type.
Also, you can use all the methods available of that upper bounded class. 
Example : 
List<? extends Number>
in the method, you can use all methods in Number class also List class
- comparatorexample package <? super Number> For example comparator. You are allowed to compare Numbers, but also superclass of Number like Object

# New IO
- Paths class has 2 methods .get(String) where you specify a path
- Files.createFiles (Paths.get("sub1", "sub2","sub3","myfile.txt")) will create myfile.txt at sub1/sub2/sub3
- Files.createDirectories(Paths.get("sub1", "sub2","sub3")); will create sub1/sub2/sub3 folders
- boolean deleted = Files.deleteIfExists(Paths.get("sub1", "sub2","sub3","myfile.txt")); deletes myfile.txt at sub1/sub2/sub3
- Path dataFile = sourceDir.resolve("file.txt"); adds file.txt at the path

# Exceptions
- Unchecked exceptions are the ones that are descendants of RuntimeException class. 
- Unchecked exception means that it does not require a try catch block
- Checked exceptions require a try/catch block or throws
- Exceptions get printed on standard error while output is on standard out. System.err.println()
- Multiple catch block was added in java 7  catch(ExceptionNoFound1 | ExceptionFoundNot2 e)


# Threads
- Executor are the highest level. you Provide threads and it caches starts/stops them

# Callable interface in order to set up a series of threads to execute that return something at a later date

# Default methods allow you to put a method in an existing interface and provide an implementation

# Tips:
- When using a new class, check the API documentation to get familiarised with the methods it contains

## Private, Default, Protected

- Private anywhere inside the top level curly braces( even in subclasses)
- Protected anywhere in the same package and from any sub-class that's accessing its own type
- public
- default in same package

```
package a;
class Parent
  protected x; //can be used anywhere in Parent
  
package b;
  class Child extends Parent
  this.x; yes
  
  do stuff(Parent p)
    p.x; doesnt work
 ```
 
 ### When overriding, chaning visibility to something smaller (form public to private) it won't work. Protected is less visible than Default
 
TOLEARN: Java swing
 - interface making in java
