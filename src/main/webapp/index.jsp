<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dil's Calculator</title>
</head>
<body>

	<h1>Calculator</h1>
	
	<form action="Calculate" method="post">
	
		Number1: <input type="number" name="number1" /><br />
		Number2: <input type="number" name="number2" /><br /><br />
		
		Operation:  
		<select name="operation">  
		<option>Addition</option>  
		<option>Subtraction</option>  
		<option>Multiplication</option>
		<option>Division</option> 
		</select>
		<br /><br />
		
		<input type="submit" value="Calculate">
	</form>

</body>
</html>