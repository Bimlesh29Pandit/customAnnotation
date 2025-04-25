package annotationUse;

public class Main {

	public static void main(String[] args) throws Exception {
		User user = new User();
		Validator.validatorStartWith(user);
		Validator.validatorNotNulll(user);
		Validator.validatorMin(user);
		System.out.println("Validation passed!");
		

	}

}
