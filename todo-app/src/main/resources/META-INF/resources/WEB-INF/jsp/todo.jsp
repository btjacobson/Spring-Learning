<%@ include file="common/header.jspf"%>

<html>
   <head>
      <title>New Todo Page</title>
   </head>
   <body>
      <%@ include file="common/navigation.jspf"%>
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
      <%@ include file="common/footer.jspf"%>
      <script type="text/javascript">
         $('#completeBy').datepicker({
            format: 'yyyy-mm-dd'
         });
      </script>
   </body>
</html>