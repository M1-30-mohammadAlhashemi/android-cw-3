package com.example.class7;

import java.io.Serializable;

public class playstation1 implements Serializable {
    private String Name;
    private int level;
    private String levelOfGame;
    private  String genre;
    private int year;
    private int img;
    private boolean chapters;

    public playstation1(String name, int level, String levelOfGame, String genre, int year, int img, boolean chapters) {
        Name = name;
        this.level = level;
        this.levelOfGame = levelOfGame;
        this.genre = genre;
        this.year = year;
        this.img = img;
        this.chapters = chapters;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLevelOfGame() {
        return levelOfGame;
    }

    public void setLevelOfGame(String levelOfGame) {
        this.levelOfGame = levelOfGame;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public boolean isChapters() {
        return chapters;
    }

    public void setChapters(boolean chapters) {
        this.chapters = chapters;
    }
}
