package com.example.core;

public class Korisnik {

    int id;
    String username;
    String lozinka;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Korisnik() {
    }

    public Korisnik(String username_, String password_) {
        this.username=username_;
        this.lozinka=password_;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return lozinka;
    }

    public void setPassword(String lozinka) {
        this.lozinka = lozinka;
    }
}
