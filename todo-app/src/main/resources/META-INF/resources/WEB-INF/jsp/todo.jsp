<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
   <head>
      <title>New Todo Page</title>
   </head>
   <body>
      <h1>Enter Todo Details</h1>
      <form:form method="post" modelAttribute="todo">
         Description: <form:input type="text" path="description" required="required"/>
         <form:errors path="description"/>
         <form:input type="hidden" path="id"/>
         <form:input type="hidden" path="completed"/>
         <input type="submit"/>
      </form:form>
   </body>
</html>