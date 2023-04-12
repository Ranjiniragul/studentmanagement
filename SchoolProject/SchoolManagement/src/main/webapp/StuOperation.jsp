<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddStudent</title>
<style>
form{
font-size:20px;
border-radius:15px;
margin:15px;
padding:20px;

}
#table{

border:2px solid red;
border-radius:5px;
line-height:1.8em;
margin:-350px -8px;

}
input{
font-size:20px;
text-align:center;
}
#center{
margin-left: 350px;
  margin-right: auto;




}
select{
font-size:20px;
width:250px
}
img{

width:500px;
margin-left:1000px;

}
</style>
</head>
<body>
<img src="https://www.brookings.edu/wp-content/uploads/2021/08/CUE_ed-tech_ADB-blog.jpg" alt="This is sclManagement Info website"/>
<form action="addstudent.jsp" method="post">
<table id="table">

<tr>
<td>Student Id</td>
<td><input type="text" name="sid" required pattern="[0-9]{4}"/></td>
</tr>

<tr>
<td>Student Name</td>
<td><input type="text" name="stuname"></td>
</tr>

<tr>
<td>Class</td>
<td>
<select name="group">
<option value="">......Select......</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
</select>
</td>
</tr>


<tr>
<td>Section</td>
<td>
<select name="section">
<option value="">......Select......</option>
<option value="A">A</option>
<option value="B">B</option>
<option value="C">C</option>
<option value="D">D</option>
<option value="E">E</option>
</select>
</td>
</tr>

<tr>
<td>Year</td>
<td>
<select name="year">
<option value="">.....Select.......</option>
<option value="2011">2011</option>
<option value="2012">2012</option>
<option value="2013">2013</option>
<option value="2014">2014</option>
<option value="2015">2015</option>
<option value="2016">2016</option>
<option value="2017">2017</option>
<option value="2018">2018</option>
<option value="2019">2019</option>
<option value="2020">2020</option>
<option value="2021">2021</option>
<option value="2022">2022</option>
<option value="2023">2023</option>
</select>
</td>
</tr>

<tr>
<td>Number</td>
<td><input type="tel" name="number" pattern="[0-9]{10}"></td>
</tr>
<tr>
<td>Email</td>
<td><input type="email" name="email"></td>
</tr>

<tr>
<td>Gender</td>
<td><input type="radio" name="gender" value="Male">Male</td>
<td><input type="radio" name="gender" value="Female">Female</td>
</tr>


<tr>
<td><input type="submit" value="Add Student" id="center"></td>
</tr>
</table>
</form>

<form action="updatestudent.jsp" method="post">
<input type="submit" value="Edit Student Information">
</form>

<form action="deletestudent.jsp" method="post">
<input type="submit" value="Delete Student">
</form>

<form action="getallstudent.jsp" >
<input type="submit" value="Get All Students Details">
</form>





</body>
</html>