package edu.miu.cs489.javacliquizapp.model;

public class EmailAddress {
    private String address;
    private String label;

    public EmailAddress(String address, String label) {
        this.address = address;
        this.label = label;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}

