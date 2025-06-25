<%@ include file="common/header.jspf"%>

<html>
   <head>
      <title>Todos Page</title>
   </head>
   <body>
      <%@ include file="common/navigation.jspf"%>
      <div class="container">
         <h1>Your ToDos</h1>
         <table class="table">
            <thead>
               <tr>
                  <th>Description</th>
                  <th>Target Date</th>
                  <th>Completed?</th>
                  <th></th>
                  <th></th>
               </tr>
            </thead>
            <tbody>
               <c:forEach items="${todos}" var="todo">
                  <tr>
                     <td>${todo.description}</td>
                     <td>${todo.completeBy}</td>
                     <td>${todo.completed}</td>
                     <td>
                        <a href="update-todo?id=${todo.id}" class="btn btn-success">
                           Update
                        </a>
                     </td>
                     <td>
                        <a href="delete-todo?id=${todo.id}" class="btn btn-warning">
                           Delete
                        </a>
                     </td>
                  </tr>
               </c:forEach>
            </tbody>
         </table>
         <a href="add-todo" class="btn btn-success">Add Todo</a>
      </div>
   </body>
</html>