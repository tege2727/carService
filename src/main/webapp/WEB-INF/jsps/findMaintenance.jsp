<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Araç Bakım Sorgula</title>
</head>
<body>

<%-- ${saveMaintenance.car.id}
${saveMaintenance.customer.id}
 --%>

<form action="findMaintenance" method="get"> 
<table>

<tr> <td>Şase Numarası:   </td>  <td><input type="text" name="chassisNumber">  </td>   </tr>
<tr> <td>Plaka Numarası:  </td>  <td><input type="text" name="licencePlate">   </td>  </tr>
<tr> <td> Gönder          </td>  <td><input type="submit" value="Gönder">   </td>  </tr>

</table>
</form>	


</body>
</html>