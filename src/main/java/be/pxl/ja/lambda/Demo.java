package be.pxl.ja.lambda;

public class Demo {

	public static void main(String[] args) {
		// StringConverter upperCaseConverter = (original) ->  original.toUpperCase();
		StringConverter upperCaseConverter = String::toUpperCase; // kortere versie van bovenstaande
		System.out.println(upperCaseConverter.convert("LuchtHavenPerSOneeL"));
		StringConverter reverseConverter = (original) -> {
			StringBuilder builder = new StringBuilder(original);
			return builder.reverse().toString();
		};
		System.out.println(reverseConverter.convert("LuchtHavenPerSOneeL"));
	}
}
