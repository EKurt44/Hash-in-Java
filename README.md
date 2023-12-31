# Hashing in Java

Java's Set and Map interfaces specify two very different collection types. A Set is just what it sounds like: a collection of distinct (non-equal) objects, with no other structure. A Map is, conceptually, also just what it sounds like: a mapping from a set of objects (the distinct keys) to a collection of objects (the values). Hashtable and HashMap both implement Map, HashSet implements Set, and they all use hash codes for keys/objects contained in the sets to improve performance.

# Hashtable and HashMap

Hashtable is a legacy class that almost always should be avoided in favor of HashMap. They do essentially the same thing, except most methods in Hashtable are synchronized, making individual method calls thread-safe.1 You have to provide your own synchronization or other thread safety mechanism if you are using multiple threads and HashMap.

The problem with Hashtable is that synchronizing each method call (which is a not-insignificant operation) is usually the wrong thing. Either you don't need synchronization at all or, from the point of the view of the application logic, you need to synchronize over transactions that span multiple method calls. Since it was impossible to simply remove the method-level synchronization from Hashtable without breaking existing code, the Collections framework authors needed to come up with a new class; hence HashMap. It's also a better name, since it becomes clear that it's a kind of Map.

Oh, if you do need method-level synchronization, you still shouldn't use Hashtable. Instead, you can call Collections.synchronizedMap() to turn any map into a synchronized one. Alternatively, you can use ConcurrentHashMap, which, according to the docs: "obeys the same functional specification as Hashtable" but has better performance and additional functionality (such as putIfAbsent()).

1 There are other differences (less significant, in my view) such as HashMap supporting null values and keys.

# HashSet

In terms of functionality, HashSet has nothing to do with HashMap. It happens to use a HashMap internally to implement the Set functionality. For some reason, the Collections framework developers thought it would be a good idea to make this internal implementation detail part of the public specification for the class. (This was an error, in my view.)

Reference : https://stackoverflow.com/a/47838951
