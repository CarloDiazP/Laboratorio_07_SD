package org.example;

import org.example.soap.SOAPImpl;
import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:1516/WS/Users", new SOAPImpl());
    }
}
