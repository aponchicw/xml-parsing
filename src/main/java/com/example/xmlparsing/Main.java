package com.example.xmlparsing;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("/home/altyn/Desktop/spring/xml-parsing/src/main/resources/kaspi2.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(KaspiCatalog.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            KaspiCatalog catalog = (KaspiCatalog) unmarshaller.unmarshal(file);
            List<Offer> offer = catalog.getOffers().getOffer();
//            System.out.println(offer.size());

            //Get Document Builder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            //Build Document
            Document document = builder.parse(file);

            //Normalize the XML Structure; It's just too important !!
            document.getDocumentElement().normalize();

            //Here comes the root node
            Element root = document.getDocumentElement();
//            System.out.println(root.getNodeName());

            //Get all availabilities
            NodeList nList = document.getElementsByTagName("availabilities"); //15
            NodeList nmList = document.getElementsByTagName("availability"); //36

//            System.out.println(nList.getLength());
//
//            for (int temp = 0; temp < nList.getLength(); temp++)
//            {
//                Node node = nmList.item(temp);
//                System.out.println("");    //Just a separator
//                if (node.getNodeType() == Node.ELEMENT_NODE)
//                {
//                    //Print each offers' detail
//                    Element eElement = (Element) node;
//                    System.out.println("Available : "    + eElement.getAttribute("available"));
//                    System.out.println("Store ID : "    + eElement.getAttribute("storeId"));
//                    System.out.println("=================");
//                }
//            }
//            for (Offer each_offer : offer) {
//                for (int i = 0; i < offer.size(); i++) {
//                    System.out.println(offer.get(i));
//                    each_offer.toString(i);
//                }
//            }

            NodeList listOfOffers = document.getElementsByTagName("offer"); //15
            System.out.println(listOfOffers.getLength());

            listOfOffers.item(0).getTextContent();
//            NodeList listOfAttr = root.getElementsByTagName("availabilities"); //15
//            System.out.println(listOfAttr.getLength());


            NodeList listOfAttributes = root.getElementsByTagName("availabilities");

            for (int i = 0; i < offer.size(); i++){ // 15 times
                List<Availabilities> availabilities = offer.get(i).getAvailabilities();
                List<Node> arrayOfAttribute = null;

                NodeList listOfATT = document.getElementsByTagName("availability");
                System.out.println(listOfATT.getLength());

                for (int j = i; j < offer.get(i).getAvailabilities().size(); j++){
                    Node listOfAttribute = listOfAttributes.item(i);
                    arrayOfAttribute.add(listOfAttribute);
                }
//                Node listOfAttribute = listOfAttributes.item(i);
//                listOfAttributes.getLength();
//                System.out.println(listOfAttributes.item(0));
//                for (Availabilities av : availabilities){
//                    NodeList listOfAttributes = root.getElementsByTagName("availabilities");
//                    listOfAttributes.item(i);
//                    av.getAvailability()
//                    System.out.println(i + av.getAvailability());
//                    System.out.println("============");
//                }


//                for (int j  = 0; j<listOfOffers.getLength(); j++){ // 15 times
//                    NodeList listOfAttr = root.getElementsByTagName("offer"); //15
//
//                    Node attr = listOfAttr.item(3);
//                    if (attr.getNodeType() == Node.ELEMENT_NODE) {
//                        Element off = document.getDocumentElement();
//                        Element eElement = (Element) off;
//                        System.out.println("Available : "    + eElement.getAttribute("available"));
//                        System.out.println("Store ID : "    + eElement.getAttribute("storeId"));
//                        System.out.println("=================");
//                    }
//                }
            }



//            System.out.println(listOfOffers.getLength());
//            for (int i = 0; i < offer.size(); i++) {
//                String avail = "";
//                System.out.println(offer.get(i));
//                NodeList listOfAvailabilities = document.getElementsByTagName("availabilities"); //15
////                NodeList listOfAvailabilities = document.getElementsByTagName("availabilities"); //15
//
//                avail += listOfAvailabilities.item(i).getAttributes().item(i);
////                for (int temp = 0; temp < nList.getLength(); temp++)
////                {
////                    Node node = nmList.item(temp);
////                    System.out.println("");    //Just a separator
////                    if (node.getNodeType() == Node.ELEMENT_NODE)
////                    {
////                        //Print each employee's detail
////                        Element eElement = (Element) node;
////                        System.out.println("Available : "    + eElement.getAttribute("available"));
////                        System.out.println("Store ID : "    + eElement.getAttribute("storeId"));
////                        System.out.println("=================");
////                    }
////                }
//                System.out.println(avail);
//            }

//            System.out.println(offer.size());
//            for (int i = 0; i<offer.size(); i++){
//                System.out.println(offer.get(i).getAvailability().get(i).getAvailabilityStatus(i));
//            }

//            String re = offer.get(0).getAvailability().toString();
//            System.out.println(offer.get(0).getAvailability().toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


