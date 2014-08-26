/**
 * 
 */
package com.pyramid.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@PyramidListAnnotation
public @interface PyramidListAnnotation {

	boolean serializable() default false;
}
