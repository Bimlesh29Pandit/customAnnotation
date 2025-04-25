package annotationUse;

import customeAnnotation.Min;
import customeAnnotation.notNull;
import customeAnnotation.startWith;

public class User {
	@startWith(value = "Bim" , message = "Name must start with 'Bim'")
	private String name = "Bimlesh";
	@notNull
	public  String address = "karnatka";
	@Min(value = 18 ,message = "Age shoud be geater than min age")
	int age =19;
}
