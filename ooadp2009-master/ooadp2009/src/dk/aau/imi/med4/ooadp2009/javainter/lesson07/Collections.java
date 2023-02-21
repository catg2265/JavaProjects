package dk.aau.imi.med4.ooadp2009.javainter.lesson07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * This class introduces the Collection interface and some useful
 * implementations of it, HashSet, TreeSet and ArrayList.
 */
public class Collections {
	public static void main(String[] args) {
		// Let's make some Point objects
		Point p1 = new Point(0, 0);
		Point p2 = new Point(1, 1);
		Point p3 = new Point(1, 0);
		Point p4 = new Point(0, 1);
		Point p5 = new Point(0, 0);

		/*
		 * The java.util.Collection interface defines a container that the user
		 * can add objects to and remove objects from. The user can also
		 * determine the number of items in a Collection and create an array
		 * that contains all the elements in the collection.
		 * 
		 * The Collection interface's add() method is used to add new items to a
		 * collection.
		 * 
		 * The Collection interface's remove() method is used to remove items
		 * from a collection.
		 * 
		 * The Collection interface's size is determined using the size()
		 * method.
		 * 
		 * The elements in a Collection can all be put into an array using the
		 * toArray() method.
		 */

		/*
		 * Because the Collection interface is an interface, it cannot be
		 * instantiated. So to demonstrate the use of its methods, we have to
		 * create an instance of a class that implements the Collection
		 * interface. A commonly used example of such a class is the ArrayList
		 * class which is the Java Collection's answer to a normal array. An
		 * ArrayList is cheap to create and fast for random access. It is
		 * expensive to add to or remove items from the beginning of a large
		 * ArrayList, but, on average, adding elements to and removing elements 
		 * from an ArrayList is fast.
		 */

		ArrayList<Point> a = new ArrayList<Point>();

		/*
		 * ArrayList implements the Collection interface, so we can declare a
		 * Collection variable and set it to refer to the ArrayList that we've
		 * just created.
		 */

		Collection<Point> c = a;

		/*
		 * As mentioned above, a Collection has an add() method that can be used
		 * to add elements to it.
		 */

		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
		c.add(p5);

		/*
		 * Like every Java object, a Collection can be printed out. Note that,
		 * because ArrayList is unsorted, the Points are printed out in the
		 * order they were added to the list.
		 */

		System.out.println(c);

		/*
		 * Now let's remove p5 from the Collection c and print out the
		 * Collection again.
		 */

		c.remove(p5); //The first element for which p.equals(p5) is true
		System.out.println(c);

		/*
		 * remove() actually removes from the Collection the first element that
		 * is equal to the argument of the remove() method. It uses the
		 * equals(Object) method to determine whether two objects are equal. The
		 * equals() method has been overridden in the Point class so that two
		 * Points are equal if and only if their co-ordinate values are equal.
		 * Note that only the first occurrence of (0.0,0.0) is removed - p5
		 * itself is actually still present in c.
		 */

		/*
		 * The following shows that, according to the equals() method defined in
		 * Point, p1 and p5 are "equal", even though they do not refer to
		 * exactly the same object.
		 */
		System.out.println("p5.equals(p1) returns " + p5.equals(p1));

		/*
		 * However, if we use the "==" operator, this only returns true if the
		 * two variable refer to exactly the same object (as opposed to two
		 * different objects with the same state).
		 */
		System.out.println("p5 == p1 returns " + (p1 == p5));
		System.out.println("p1 == p1 returns " + (p1 == p1));

		/*
		 * We determine the size of a Collection by calling its size() method.
		 */
		System.out.println("The size of c is " + c.size());

		/*
		 * We can create an array of Objects from c using the toArray() method.
		 */

		Object[] objectArray = c.toArray();

		/*
		 * Let's print out the Points in objectArray.
		 */
		for (int i = 0; i < objectArray.length; i++)
			System.out.println(objectArray[i]);

		/*
		 * Let's put p1 back into c at the end.
		 */

		c.add(p1);
		System.out.println(c + " has a size of " + c.size());

		/*
		 * Sometimes we want a collection to be a set of objects, rather than
		 * a list. What's the difference? No two elements of a set can be equal,
		 * whereas two or more elements in a List can be equal.
		 * 
		 * In the Java Collections framework, we have an interface called Set
		 * which defines the behaviour of a set. A commonly-used implementation
		 * of the Set interface is HashSet.
		 * 
		 * Adding elements to and removing elements from a HashSet is very fast.
		 * It is also very fast (average constant time) to check whether a HashSet
		 * contains an item.
		 * 
		 * However, you cannot guarantee that the elements in a HashSet are in
		 * any particular order. This is different from the ArrayList where we
		 * know that the order of the elements is the order that we put them in
		 * the list.
		 * 
		 * The HashSet is a hash table, which is a special type of array. When we
		 * put an element into a hash table, we decide on the slot in the hash table 
		 * into which to put the new element by running a function on the new
		 * element that returns an integer that we use as the index of the slot
		 * in the hash table where we'll place the new element.
		 * 
		 * This means we have to define a hash function for the class of objects
		 * that will be contained in the HashSet. Java provides a default hash
		 * function, but we should usually try to define our own.
		 * 
		 */

		HashSet<Point> h = new HashSet<Point>();

		/*
		 * Let's put the elements from c into h using an Iterator. An Iterator
		 * object is owned by any Collection object. It is an object that has
		 * various methods (e.g., hasNext() and next()) that help us to iterate
		 * over a Collection.
		 */
		Point p = null;
		for (Iterator<Point> i = a.iterator(); i.hasNext();) {
			p = i.next();
			h.add(p);
		}
		System.out.println("The HashSet, h, contains " + h);

		/*
		 * If you want a set in which all the elements are in a guaranteed
		 * order, then you can use a TreeSet. TreeSet uses the
		 * equals() method to determine if two elements are equal and refuses
		 * to add the new element if it is equal to one that is already in the
		 * set.
		 * 
		 * To store an object in a TreeSet, it must implement the Comparable<E>
		 * interface. This means that you have to define a compareTo() method in
		 * the class definition of the element class. This has been done in the
		 * Point class.
		 * 
		 * Let's first remind ourselves what the ArrayList, a, contains:
		 */
		System.out.println("a contains " + a);

		/*
		 * Note that a contains two elements that are the same, (0,0), and the
		 * elements are simply in the order in which they were added to the
		 * ArrayList. Let's now make a set from this list in which the Points
		 * are in lexicographical order. Let's use an enhanced for loop for this
		 * instead of an Iterator.
		 */

		TreeSet<Point> t = new TreeSet<Point>();
		for(Point q : a) t.add(q);
		System.out.println("The TreeSet, t, contains "+ t);
	}
}
