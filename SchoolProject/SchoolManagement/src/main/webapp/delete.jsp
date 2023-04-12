<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Student</title>
<style>
input{
font-size:20px;
border:2px solid red;
}
#center{
margin-left:580px;

}
</style>
</head>
<body>
<form action="deletestudent.jsp" method="post" id="center">
<h1>Enter Student Id</h1>
<td><input type="text" name="sid"></td>
<td><input type="submit" value="Enter" id="delete"></td>
<script type="text/javascript">
var cen=document.getElementById("delete");
cen.addEventListener("click",function(){
	window.alert("Student is Deleted Successfully");
});

</script>


</form>

</body>
</html>