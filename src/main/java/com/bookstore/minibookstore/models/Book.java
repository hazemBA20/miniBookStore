package com.bookstore.minibookstore.models;



public class Book {


    private Integer id;
    private String name;
    private String author;
    private Integer price;
    public Book(Integer id, String name, String author, Integer price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price=price;
    }
    public Integer getId() {return id;}
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public Integer getPrice() { return price; }
    private void setId(Integer id) { this.id = id; }
    private void setName(String name) { this.name = name; }
    private void setAuthor(String author) { this.author = author; }
    private void setPrice(Integer price) { this.price = price; }
    @Override
    public String toString() {
        return "book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price;
    }
}
