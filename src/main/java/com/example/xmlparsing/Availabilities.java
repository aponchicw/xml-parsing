package com.example.xmlparsing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@XmlRootElement
public class Availabilities {
    private String availability;

    @Override
    public String toString() {
        return "Availability{" +
                "availability_status='" + availability + '\'' +
                '}';
    }
}
