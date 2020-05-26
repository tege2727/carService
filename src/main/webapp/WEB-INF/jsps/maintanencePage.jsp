<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ARAÇ BAKIM BİLGİLERİ SAYFASI</title>
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
 
 <h2>Lütfen Bakım Bilgilerini Giriniz: </h2>

<table>
<tr> <td>Plaka:                </td> <td>${saveCarWithCustomerDetails.licencePlate}    </td>        </tr>
<tr> <td>Marka:                </td> <td>${saveCarWithCustomerDetails.brand}           </td>        </tr>
<tr> <td>Model:                </td> <td>${saveCarWithCustomerDetails.model}           </td>        </tr>
<tr> <td>Yıl:                  </td> <td>${saveCarWithCustomerDetails.years}           </td>        </tr>
<tr> <td>Motor Tipi:           </td> <td>${saveCarWithCustomerDetails.enginType}       </td>        </tr>
<tr> <td>Service Periyodu:     </td> <td>${saveCarWithCustomerDetails.servicePeriod}   </td>        </tr>
<tr> <td>Şanzıman Tipi:        </td> <td>${saveCarWithCustomerDetails.transmissionType} </td>        </tr>
<tr> <td>Kaydedilen Oto ID     </td> <td>${saveCarWithCustomerDetails.id} </td>        </tr>
<tr> <td>Kaydedilen Oto ya Ait Müşteri ID     </td> <td>${saveCarWithCustomerDetails.customer.id} </td>        </tr>
</table>

<form action="saveMaintenance" method="get">
<table>
<tr> <td>İşlem Detayları:     </td>       <td><input type="text"   name="processDetails"   > </td>        </tr>
<tr> <td>İşlem KM :           </td>       <td><input type="text"   name="processKm"        > </td>        </tr>
<tr> <td>Açıklama:            </td>       <td><input type="text"   name="comments"         > </td>        </tr>
<tr> <td>Giriş:               </td>       <td><input type="submit" value="Kaydet">        </td>        </tr> 

</table>

<input type="hidden" name="carId"       value="${saveCarWithCustomerDetails.id}" />
<input type="hidden" name="customerId"  value="${saveCarWithCustomerDetails.customer.id}" />
</form>



</body>
</html>