package blah;

import validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;

    //add validation for last name
    @NotNull(message = "is required")
    @Size(min = 1, message="is required")
    private String lastName;

    //add validation for range of free passes
    @NotNull(message = "is required")
    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value=10, message = "must be less than or equal to ten")
    private Integer freePasses;

    @CourseCode
    private String courseCode;

    //add validation rule for postal code
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 char/digits")
    private String postalCode;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
