<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
   <head>
      <title>Todos Page</title>
   </head>
   <body>
      <h1> Your ToDos</h1>
      <table>
         <thead>
            <tr>
               <th>ID</th>
               <th>Description</th>
               <th>Target Date</th>
               <th>Completed?</th>
               <th></th>
            </tr>
         </thead>
         <tbody>
            <c:forEach items="${todos}" var="todo">
               <tr>
                  <td>${todo.id}</td>
                  <td>${todo.description}</td>
                  <td>${todo.completeBy}</td>
                  <td>${todo.completed}</td>
                  <td>
                     <a href="delete-todo?id=${todo.id}">
                        DELETE
                     </a>
                  </td>
               </tr>
            </c:forEach>
         </tbody>
      </table>
      <a href="add-todo">Add Todo</a>
   </body>
</html>