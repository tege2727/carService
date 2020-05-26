<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>ARAÇ BAKIM BİLGİLERİ</title>
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
<h2>ARAÇ BAKIM BİLGİLERİ</h2>

<table>
<c:forEach items="${cars}" var="car">

<tr><td>Şase No:         </td><td>${car.chassisNumber}</td></tr>
<tr><td>Plaka No:        </td><td>${car.licencePlate}</td></tr>
<tr><td>Servis Periyodu  </td><td>${car.servicePeriod}</td></tr>
<tr><td>Marka            </td><td>${car.brand}</td></tr>
<tr><td>Model            </td><td>${car.model}</td></tr>
<tr><td>Yıl              </td><td>${car.years}</td></tr>
<tr><td>Motor Tipi:      </td><td>${car.enginType}</td></tr>
<tr><td>Şanzıman Tipi:   </td><td>${car.transmissionType}</td></tr>
<tr><td colspan="2"><a href="showMaintenance?cartId=${car.id}"> Bakım Bilgileri İçin Tıklayın</a></td></tr>
<tr><td colspan="2"><a href="saveNewMaintenanceWithCurrentWithCar?cartId=${car.id}">Yeni Bakım Kayıtı Girmek İçin Tıklayın</a></td></tr>

</c:forEach>
</table>
</body>
</html>