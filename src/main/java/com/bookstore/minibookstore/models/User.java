package com.bookstore.minibookstore.models;



public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    public User(Long id, String name, String email, String password) {
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
    }
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    private void setId(Long id) { this.id = id; }
    private void setName(String name) { this.name = name; }
    private void setEmail(String email) { this.email = email; }
    private void setPassword(String password) { this.password = password; }
    @Override
    public String toString() {
        return "user [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password;
    }


}
