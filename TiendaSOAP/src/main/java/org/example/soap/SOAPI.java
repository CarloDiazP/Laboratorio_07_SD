package org.example.soap;

import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import org.example.model.Item;

@WebService
public interface SOAPI {
    @WebMethod
    public List<Item> getItems();
    @WebMethod
    public String buyItem(String name, int  cantidad);
    @WebMethod
    public void addItem(Item item);
    @WebMethod
    public void setItem(String name, int cantidad, double precio);
}