package com.karadayi.kodstar.util;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.karadayi.kodstar.util.EmailUtil;

@Component
@Transactional
public class EmailUtil {
	
	
	 @Value("${com.karadayi.kodstar.email.body}")
     private String EMAIL_BODY;

     @Value("${com.karadayi.kodstar.email.subject}")
     private String EMAIL_SUBJECT;
     
     
     private static final Logger LOGGER=LoggerFactory.getLogger(EmailUtil.class);
	  
     @Autowired 
     private JavaMailSender sender;
     
     
     public void sendMaintenance(String toAddress,String filePath){
   	  LOGGER.info("Inside sendMaintenance()");
   	  
   		  MimeMessage message = sender.createMimeMessage();
   		  
   		  try {
   		  
   			  MimeMessageHelper messageHelper = new MimeMessageHelper(message,true);
   			  messageHelper.setTo(toAddress);
   			  messageHelper.setSubject(EMAIL_SUBJECT);
   			  messageHelper.setText(EMAIL_BODY);
   			  messageHelper.addAttachment("Maintenance", new File(filePath));
   			  
   			  sender.send(message);
   		  
   		  } 
   		  catch (MessagingException e) 
   		  { // TODO Auto-generated catch block
   			  LOGGER.error("Exception inside sendMaintenance() "+e);
   		  }
   		  
     }
     
	
	
	

}
