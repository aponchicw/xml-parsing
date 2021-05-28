package com.example.xmlparsing;


import com.sun.xml.txw2.Document;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.Element;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("/home/altyn/Desktop/spring/xml-parsing/src/main/resources/kaspi.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(KaspiCatalog.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            KaspiCatalog catalog = (KaspiCatalog) unmarshaller.unmarshal(file);
            List<Offer> offer = catalog.getOffers().getOffer();

            for (Offer each_offer : offer) {
                for (int i = 0; i < offer.size(); i++) {
                    System.out.println(each_offer);
                }
            }

//            String str = FileUtils.rereadFileToString(file, "UTF-8");
//
//            Document doc = null;
//            try {
//                InputStream in = new ByteArrayInputStream(xml.getBytes("utf-8"));
//                doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(in);
//            } catch (UnsupportedEncodingException e1) {
//                e1.printStackTrace();
//            } catch (SAXException e1) {
//                e1.printStackTrace();
//            } catch (IOException e1) {
//                e1.printStackTrace();
//            } catch (ParserConfigurationException e1) {
//                e1.printStackTrace();
//            }
//
//            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//            try {
//                DocumentBuilder db = dbf.newDocumentBuilder();
//            } catch (ParserConfigurationException e1) {
//                e1.printStackTrace();
//            }
//            doc.getDocumentElement().normalize();
//            System.out.println("Root element " + doc.getDocumentElement().getNodeName());
//
//            NodeList nodeList = doc.getElementsByTagName("*");
//            for (int i = 0; i < nodeList.getLength(); i++) {
//                // Get element
//                Element element = (Element) nodeList.item(i);
//
////            String re = offer.get(0).getAvailability().toString();
////
////            System.out.println(offer.get(0).getAvailability().toString());
//
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


