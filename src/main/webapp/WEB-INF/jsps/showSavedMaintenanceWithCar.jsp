<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Araç Bakım Detayları</title>
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

<h2>Araç Bakım Detayları</h2>
<table>
<tr> <th>Plaka:                </th> <td>${car.licencePlate}    </td>        </tr>
<tr> <th>Marka:                </th> <td>${car.brand}           </td>        </tr>
<tr> <th>Model:                </th> <td>${car.model}           </td>        </tr>
<tr> <th>Yıl:                  </th> <td>${car.years}           </td>        </tr>
<tr> <th>Motor Tipi:           </th> <td>${car.enginType}       </td>        </tr>
<tr> <th>Service Periyodu:     </th> <td>${car.servicePeriod}   </td>        </tr>
<tr> <th>Şanzıman Tipi:        </th> <td>${car.transmissionType} </td>        </tr>
<tr> <th>Kaydedilen Oto ID     </th> <td>${car.id} </td>        </tr>
<tr> <th>Kaydedilen Oto Müşteri ID     </th> <td>${car.customer.id} </td>        </tr>
<tr><th colspan="2"><a href="saveNewMaintenanceWithCurrentWithCar?cartId=${car.id}">Yeni Bakım Kayıtı Girmek İçin Tıklayın</a></th></tr>
</table>

<pre>------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</pre>
<pre>------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</pre>
<pre>------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</pre>

<table>
<tr><th>İşlem Detayları</th> <th>Yorumlar  </th> <th>Bakım Km'si  </th> <th>Bakım Tarihi  </th> <th colspan="2">Açıklama  </th>    </tr>

<c:forEach items="${maintenanceByCar}" var="maintenance">
<tr><td>${maintenance.processDetails}</td> <td>${maintenance.comments}</td><td>${maintenance.processKm}</td><td>${maintenance.created}</td>
<td><a href="findMaintanenceById?maintenanceId=${maintenance.id}">Güncellemek İçin Tıklayın</a></td>
<td><a href="deleteMaintanenceById?maintenanceId=${maintenance.id}">Silmek İçin Tıklayın</a></td>

 </tr>
																																			   					
</c:forEach>
</table>

</body>
</html>