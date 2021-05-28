package com.example.xmlparsing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@SpringBootApplication
public class XmlParsingApplication {
//
//    public static void main(String[] args) {
//        try{
//            File file = new File("src\\main\\resources\\offers.xml");
//            JAXBContext jaxbContext = JAXBContext.newInstance(Offers.class);
//
//            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//
//            Offers offers = (Offers) unmarshaller.unmarshal(file);
//
//            System.out.println(offers.getOffer());
//        }catch(Exception e){e.printStackTrace();}
//        SpringApplication.run(XmlParsingApplication.class, args);
//    }

}
