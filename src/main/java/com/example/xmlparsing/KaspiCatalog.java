package com.example.xmlparsing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@XmlRootElement(name = "kaspi_catalog")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class KaspiCatalog {
    private String company;
    private String merchantid;
    Offers offers;
}