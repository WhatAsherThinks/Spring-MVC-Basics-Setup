<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>
The customer is confirmed: ${customer.firstName} ${customer.lastName}
<br><br>
Free Passes: ${customer.freePasses}
<br><br>
Course Code: ${customer.courseCode}
<br><br>
Postal Code: ${customer.postalCode}
</body>
</html>