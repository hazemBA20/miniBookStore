package com.bookstore.minibookstore.models;



public class Book {


    private String id;
    private String name;
    private String author;
    private String price;
    public Book(String id, String name, String author, String price) {}
    public String getId() {return id;}
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public String getPrice() { return price; }
    private void setId(String id) { this.id = id; }
    private void setName(String name) { this.name = name; }
    private void setAuthor(String author) { this.author = author; }
    private void setPrice(String price) { this.price = price; }
    @Override
    public String toString() {
        return "book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price;
    }
}
