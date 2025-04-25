package annotationUse;

import java.lang.reflect.Field;

import customeAnnotation.startWith;

public class Validator {
	
	public static void validator(Object obj) throws Exception{
		
		for(Field field: obj.getClass().getDeclaredFields()) {
			
			if(field.isAnnotationPresent(startWith.class)) {
				field.setAccessible(true);
				
				startWith annotation = field.getAnnotation(startWith.class);
				String value = (String) field.get(obj);
				
				if(!value.startsWith(annotation.value())) {
					throw new Exception(annotation.message());
				}
			
				
			}
			
		}
	}

}
