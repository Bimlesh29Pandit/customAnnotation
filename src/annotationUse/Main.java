package annotationUse;

public class Main {

	public static void main(String[] args) throws Exception {
		User user = new User();
		Validator.validator(user);
		System.out.println("Validation passed!");
		

	}

}
