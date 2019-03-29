# Java-basics-recap
A strong foundation is what makes progress easier and higher goals achievable

# basicstreams package
- BasicStream.java contains an example of a basic stream using lambda to add the values of a list. <understanded>
- WildCards.java contains an example of an unbound Wildcard. You can see that creating it with any type of object works fine but adding to it is not possible.
- UpperBounds.java the idea of using an upper bound on a wild card allows you to tell the compiler what type youre expecting and also allows you to provide elements that are that type of subclasses of that type.
Also, you can use all the methods available of that upper bounded class. 
Example : 
List<? extends Number>
in the method, you can use all methods in Number class also List class

# Tips:
- When using a new class, check the API documentation to get familiarised with the methods it contains