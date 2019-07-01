package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    //This initialized what we will test against
    private String coursePrefix;

    @Override
    public void initialize(CourseCode theCourseCode) {
        //coursePrefix is assigned the value of the @ annotation
        // in this example (value ="LUV"),
        coursePrefix = theCourseCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;

        if(theCode!=null){
            result = theCode.startsWith(coursePrefix);
        }else{
            //this is true because if its empty there is nothing to validate and the feild is not required.
            result=true;
        }
        return result;
    }
}
