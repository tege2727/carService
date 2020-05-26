<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Araç Detay Sayfası</title>
</head>
<body>
<h2>Lütfen Müşteri Araç Bilgilerini Giriniz: </h2><br>

<form action="/saveCustomerCar" method="get"> 
<table>
<tr> <td>Marka:         </td>   <td><input type="text" name="brand">             </td>   </tr>
<tr> <td>Model:         </td>   <td><input type="text" name="model">             </td>   </tr>
<tr> <td>Yılı:          </td>   <td><input type="text" name="years">             </td>   </tr>
<tr> <td>Motor Tipi     </td>   <td><input type="text" name="enginType">         </td>   </tr>
<tr> <td>Şanzıman Tipi: </td>   <td><input type="text" name="transmissionType">  </td>   </tr>
<tr> <td>Servis Aralığı:</td>   <td><input type="text" name="servicePeriod">     </td>   </tr>

<tr> <td>Şase Numarası:   </td>  <td><input type="text" name="chassisNumber">  </td>   </tr>
<tr> <td>Plaka Numarası:  </td>  <td><input type="text" name="licencePlate">   </td>  </tr>

<tr> <td>Müşteri Adı:     </td>   <td><input type="text" name="firstName">  </td>   </tr>
<tr> <td>Müşteri Soyadı:  </td>   <td><input type="text" name="lastName">   </td>    </tr>
<tr> <td>Email:           </td>   <td><input type="text" name="email">      </td>   </tr>
<tr> <td>Telefon Numarası:</td>   <td><input type="text" name="phone">      </td>   </tr>




</table>
</form>	
</body>
</html>