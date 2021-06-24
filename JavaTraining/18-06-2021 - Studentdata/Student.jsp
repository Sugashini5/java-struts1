<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" %>
    <%@page import="java.util.List" %>
    <%@page import="com.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="student.do" method="post">
   <table>
       <tr>
          <th>Sno</th>
          <td><input type="text" name="SNO"></td>
        </tr>
        <tr>
          <th>Sid</th>
          <td><input type="text" name="SID"></td>
        </tr>
       <tr>
          <th>Name</th>
          <td><input type="text" name="NAME"></td>
        </tr>
        <tr>
          <td><input type="submit" value="Store student Data" class="btn btn-primary"></td>
        </tr>
       
   </table>
   <table class="table table-hover">
      <thead>
           <tr>
                <th>Sno</th>
                <th>Sid</th>
                <th>Name</th>
            </tr>
      </thead>
       <tbody>
   
   <%
       List<Student> list=(List<Student>) request.getAttribute("studentlist");
       for(Student x:list)
       {
   %>
      <tr>
       <td> <%=x.getSno()%></td>
       <td> <%=x.getSid()%></td>
       <td> <%=x.getName()%></td>
       </tr>
       <%} %>
   </tbody>
   </table>
</form>
<body>

</body>
</html>