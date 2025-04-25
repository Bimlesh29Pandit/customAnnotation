package customeAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) //@Target({ElementType.METHOD, 
//ElementType.FIELD}) if you want to use as field level and method
//level and also u can add class level
@Retention(RetentionPolicy.RUNTIME)
public @interface startWith{
	String value();
	String message() default "Value does not start with requeired prefix";
}