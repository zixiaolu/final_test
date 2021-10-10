package service;

import dto.Book;

import java.util.HashMap;
import java.util.Map;

public class Bookservice {

    private Map<String, Book> store;

    public Bookservice(){
        store=new HashMap<>();
        store.put("English",new Book("English",15,"a"));
        store.put("Chinese",new Book("Chinese",18,"b"));
        store.put("Math",new Book("Math",22,"c"));
        store.put("Science",new Book("Science",10,"d"));
    }

    public Book getBookByName(String name){
        Book result=new Book("error",-1,"error");
        if(store.containsKey(name)){
            result=store.get(name);
        }
        return result;
    }

    public Map<String,Book> getAllBook(){
        return store;
    }
}
