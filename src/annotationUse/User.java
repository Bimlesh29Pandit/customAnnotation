package annotationUse;

import customeAnnotation.startWith;

public class User {
	@startWith(value = "Bim" , message = "Name must start with 'Bim'")
	private String name = "Bimlesh";

}
