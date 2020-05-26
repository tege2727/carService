package com.karadayi.kodstar.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.karadayi.kodstar.entities.Maintenance;




@Component
public class PDFGenerator {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(PDFGenerator.class);
	
	
	public void GenerateItenary(Maintenance maintenance,String filePath){
		
      Document document = new Document();
		
		try {
			
			PdfWriter.getInstance(document, new FileOutputStream(filePath));
			
			document.open();
			
			document.add(generateTable(maintenance));
			
			document.close();
			
			LOGGER.info("You are now in GenerateItenary() method.Trying to produce PDF document!!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	private PdfPTable generateTable(Maintenance maintenance) {
		
		PdfPTable table = new PdfPTable(2);
		
		 PdfPCell cell;
		 
		 
		 cell=new PdfPCell(new Phrase("KODSTAR CAR SERVICE BAKIM DETAYLARI"));
		 cell.setColspan(2);
		 table.addCell(cell);
		 
		 table.addCell("Araç Plaka No");
		 table.addCell(maintenance.getCar().getLicencePlate());
		 
		 table.addCell("Araç Sase No");
		 table.addCell(maintenance.getCar().getChassisNumber());
		 
		 table.addCell("Araç Marka");
		 table.addCell(maintenance.getCar().getBrand());
		 
		 table.addCell("Araç Model");
		 table.addCell(maintenance.getCar().getModel());
		 
		 table.addCell("Araç Model Yılı");
		 table.addCell(maintenance.getCar().getYears());
		 	 
		 
		 table.addCell("Serviste Yapılan İşlem");
		 table.addCell(maintenance.getProcessDetails());
		 
		 table.addCell("Yapılan KM");
		 table.addCell(maintenance.getProcessKm());
		 
		 table.addCell("Yorumlar");
		 table.addCell(maintenance.getComments());
		
		 cell=new PdfPCell(new Phrase("SAYIN "+maintenance.getCustomer().getFirstName()+" "+maintenance.getCustomer().getLastName()+",BIZI TERCIH ETTGINIZ ICIN TEŞEKKÜR EDERIZ."));
		 cell.setColspan(2);
		 table.addCell(cell);
		
		 return table;
	}

}
