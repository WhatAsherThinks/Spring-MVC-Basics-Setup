<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
    <title>Student Registration Form</title>
</head>

<body>
    <form:form action="processForm" modelAttribute="student">
        Firs name: <form:input path="firstName"/>
        <br><br>
        Last name: <form:input path="lastName"/>
        <br><br>
        Country:
        <form:select path="country">
            <form:options items="${student.countryOptions}"/>
        </form:select>
        <br><br>
        Favorite Language:
        <form:radiobuttons path="favoriteLanguage" items="${student.languageOptions}"/>
        <br><br>
        Operating Systems:
        Linux <form:checkbox path="operatingSystems" value="Linux"/>
        Mac OS<form:checkbox path="operatingSystems" value="MacOS"/>
        MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>
        <br><br>
        <input type="submit" value="Submit"/>
    </form:form>

</body>
</html>