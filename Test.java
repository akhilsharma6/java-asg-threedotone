//Java Assignment 3.1
public class Test {
	static{
		print(10);
	}
	
	static void print(int x) {
		System.out.println (x);
		System.exit(0);
	}
}

/* This program when run will return an error during run-time.
   Although the most apt answer to available option is b. Will throw a NoSuchMethod error at runtime.
   but this is not true. It throws error: Main method not found in class Test.
*/