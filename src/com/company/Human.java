package com.company;

public class Human {
    Head properties;
    Human()
    {
        properties = new Head();
    }
    public String human()
    {
        return "Head{"
                + "eyes=" + properties.getEyes() + '\''
                + ", nose=" + properties.getHair()
                + '}';
    }

}