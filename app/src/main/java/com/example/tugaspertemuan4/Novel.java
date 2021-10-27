package com.example.tugaspertemuan4;

public class Novel {
    private String judul, genre, view;
    private int gambar;

    public Novel(String judul, String genre, String view, int gambar) {
        this.judul = judul;
        this.genre = genre;
        this.view = view;
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}

