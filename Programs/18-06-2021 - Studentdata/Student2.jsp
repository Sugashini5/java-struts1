<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" ></script>
<body>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="alert alert-info">
   <h3>Number of requests made in this session ::${sessionScope.count}</h3>
   <h3>Number of requests made since server start ::${applicationScope.count}</h3>


          <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <th>SNO</th>
                <th>SID</th>
                <th>NAME</th>
            </tr>
      </thead>
       <tbody> 
      <c:forEach items="${studentlist}" var="x">
       <tr>
                <td> ${x.SNO} </td>
                <td> ${x.SID} </td>
                <td> ${x.NAME}</td>
       </tr>
   </c:forEach>
</tbody>
</table>
</div>
</body>
</html>