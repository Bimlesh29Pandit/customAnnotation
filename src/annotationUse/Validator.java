package annotationUse;

import java.lang.reflect.Field;

import customeAnnotation.Min;
import customeAnnotation.notNull;
import customeAnnotation.startWith;

public class Validator {
	
	public static void validatorStartWith(Object obj) throws Exception{
		
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
	
	public static void validatorNotNulll(Object obj) throws Exception{
		
		for(Field field: obj.getClass().getDeclaredFields()) {
			
			field.setAccessible(true);
			
			if(field.isAnnotationPresent(notNull.class)) {
				
				 Object value = field.get(obj);
				 if(value == null) {
					 notNull notNull = field.getAnnotation(notNull.class);
					 throw new Exception(notNull.message());
				 }
			}
		}
	}
		public static void validatorMin(Object obj) throws Exception{
			
			for(Field field: obj.getClass().getDeclaredFields()) {
				
				field.setAccessible(true);
				
				if(field.isAnnotationPresent(Min.class)) {
					int age = (int) field.get(obj);
					Min min = field.getAnnotation(Min.class);
					
					if(age< min.value()) {
						throw new Exception(min.message());
					}
				}
			}
		}
		
	

}
