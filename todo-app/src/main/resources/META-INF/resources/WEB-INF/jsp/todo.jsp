<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
   <head>
      <link href="webjars/5.1.3/css/bootstrap.min.css" rel="stylesheet">
      <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css" rel="stylesheet">
      <title>New Todo Page</title>
   </head>
   <body>
   <div class="container">
         <h1>Enter Todo Details</h1>
         <form:form method="post" modelAttribute="todo">
            <fieldset class="mb-3">
               <form:label path="description">Description</form:label>
               <form:input type="text" path="description" required="required"/>
               <form:errors path="description"/>
            </fieldset>

            <fieldset class="mb-3">
               <form:label path="completeBy">Complete By</form:label>
               <form:input type="text" path="completeBy" required="required"/>
               <form:errors path="completeBy"/>
            </fieldset>

            <form:input type="hidden" path="id"/>
            <form:input type="hidden" path="completed"/>
            <input type="submit" class="btn btn-success"/>
         </form:form>
      </div>
      <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
      <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
      <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
      <script type="text/javascript">
         $('#completeBy').datepicker({
            format: 'yyyy-mm-dd'
         });
      </script>
   </body>
</html>