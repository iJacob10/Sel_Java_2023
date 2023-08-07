import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Array list , String methods , Reverse a string, METHODS, Class level access with STATIC
public class _02_Java {

	public static void main(String args[]) {
		// ARRAYLIST
		ArrayList<String> arrLi = new ArrayList<String>();
		arrLi.add("Iylin"); // add, remove, contains, addAll, isEmpty, toArray-- UTIL package
		arrLi.add("Jacob");
		arrLi.add("Java");
		System.out.println("2nd value from Array List =" + arrLi.get(2)); // Java
		for (String val : arrLi) {
			System.out.println(val);
		}
		System.out.println("Array List validates - CONTAINS = " + arrLi.contains("Iylin"));
		String[] name = { "Jesus", "Mary", "Joseph" };
		List<String> arrList = Arrays.asList(name); // Converts array -> arrayList
		System.out.println(arrList.contains("Lord"));

		// STRING METHODS - string is an object , that represents sequence of characters
		// String literals - if value is same doesn't create new memory ,
		String s1 = "Iylin Jacob Bridgitine";
		String s2 = "Iylin JAcob";

		// String new Keyword - creates new memory for every string
		String s3 = new String("Iylin Jacob");
		String s4 = new String("Iylin Jacob");
		String[] s1Split = s1.split(" ");
		System.out.println(s1Split[0]);
		System.out.println("To print indiidual chars");
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		System.out.println("*****To print indiidual chars - REVERSE***");
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}

		// Methods

		_02_Java m = new _02_Java();
		System.out.println("\n" + m.meth1());
		System.out.println("\n Class level access with STATIC" + m.meth2());

	}

	public String meth1() {
		return "This is from the method";
	}

	public static String meth2() {
		return "This is from the method - Class level access with STATIC";
	}
}
