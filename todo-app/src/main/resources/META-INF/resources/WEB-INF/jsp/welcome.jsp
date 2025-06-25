<%@ include file="common/header.jspf"%>

<html>
   <head>
      <title>Welcome Page</title>
   </head>
   <body>
      <div class="container">
         Welcome ${name}!
      </div>
      <div>
         <a href="list-todos">Manage your todos</a>
      </div>
      <%@ include file="common/footer.jspf"%>
   </body>
</html>