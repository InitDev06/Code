import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.util.HashMap;
import java.util.Map;

/**
 * @author benja
 */
public class Code {

	// Main Method to Execute.
	public static void main(String[] args) {
		// Create an arraylist of String.
		List<String> languagesList = new ArrayList<>();
		languagesList.add("Java");
		languagesList.add("JavaScript");
		languagesList.add("C#");
		languagesList.add("C++");
		languagesList.add("Python");
		for (String string : languagesList) {
			// Print each element of the list.
			System.out.println("[x] " + string);
		}

		// Create a string.
		String string = " String:Example ";
		// Trim the string.
		string = string.trim();
		// Print the string.
		System.out.println("[x] " + string);
		// Separate the string.
		String[] split = string.split(":", 2);

		// Get the first part of the string.
		String firstPart = split[0];
		// Get the second part of the string.
		String secondPart = split[1];

		// The first part of the string is equals to "String"?
		if (firstPart.equals("String")) {
			// Yes!
			System.out.println("[x] This is the first part of the string.");
		} else {
			// Not is.
			System.out.println("[x] Could not found the first part of the string.");
		}

		// The second part of the string is equals to "Example"?
		if (secondPart.equals("Example")) {
			// There is!
			System.out.println("[x] This is the second part of the string.");
		} else {
			// Not is.
			System.out.println("[x] Could not found the second part of the string.");
		}

		// Get the java version of system.
		String java = System.getProperty("java.version");
		java = java.split("_")[0].substring(0, 3);
		double javaVersion = Double.parseDouble(java);
		// The java version of system is higher to 1.8?
		if (javaVersion > 1.8) {
			// Yes.
			System.out.println("[x] Are you using a Java Version higher to 8!");
		} else {
			// No, the version is 1.8
			System.out.print("[x] Are you using Java Version 8!");
		}

		// Print the name of system.
		System.out.println("[x] " + System.getProperty("os.name"));
		// Print the version of system.
		System.out.println("[x] " + System.getProperty("os.version"));

		// Create a string.
		String test = "{#Sound} a";
		// Substring the string from the two char to the six char.
		test = test.substring(2, 6);
		// Print the string.
		System.out.println("[x] " + test);

		// Create a HashMap.
		Map<UUID, String> uuidMap = new HashMap<>();
		// Create a random UUID (Universal Unique Identifier).
		UUID uuid = UUID.randomUUID();
		// Put the uuid into map.
		uuidMap.put(uuid, uuid.toString());

		// Getting the uuid and print.
		System.out.println("[x] " + uuidMap.get(uuid));
	}
}
