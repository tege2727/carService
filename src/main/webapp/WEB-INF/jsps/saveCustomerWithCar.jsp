<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yeni Müşteri</title>

<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 5px;
  text-align: left;    
}
</style>

</head>
<body>

<h2>Lütfen Müşteri Bilgilerini Giriniz: </h2>

<form action="saveCustomerWithCar" method="post">
<table>
<tr><td>Adı:    </td> <td><input type="text" name="firstName">     </td>     </tr>
<tr><td>Soyadı: </td> <td><input type="text" name="lastName">    </td>     </tr>
<tr><td>Telefon:</td> <td><input type="text" name="phone">     </td>     </tr>
<tr><td>Email:  </td> <td><input type="text" name="email">     </td>     </tr>
<tr><td>Adres:  </td> <td><input type="text" name="adress">     </td>     </tr>


<tr><td>Marka:        </td>   <td><input type="text" name="brand">      </td>     </tr>
<tr><td>Model:        </td>   <td><input type="text" name="model">     </td>     </tr>
<tr><td>Yıl:          </td>   <td><input type="text" name="years">     </td>     </tr>
<tr><td>Motor Tipi :  </td>   <td><input type="text" name="enginType">     </td>     </tr>
<tr><td>Şanzuman Tipi </td>   <td><input type="text" name="transmissionType">     </td>     </tr>
<tr><td>Plaka No:     </td>   <td><input type="text" name="licencePlate">     </td>     </tr>
<tr><td>Şase no:      </td>   <td><input type="text" name="chassisNumber">     </td>     </tr>
<tr><td>Service Periyodu  </td> <td><input type="text" name="servicePeriod">     </td>     </tr>
<tr><td>                 </td> <td><input type="submit" value="KAYDET">     </td>     </tr>





</table>


</form>


</body>
</html>