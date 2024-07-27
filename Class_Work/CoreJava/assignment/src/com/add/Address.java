//package com.add;
//
//public class Address {
//    private int addId;
//    private String city;
//    private String state;
//    private String pinched;
//
//    public Address(int addId, String city, String state, String pinched) {
//        this.addId = addId;
//        this.city = city;
//        this.state = state;
//        this.pinched = pinched;
//    }
//
//    public int getAddId() {
//        return addId;
//    }
//
//    public void setAddId(int addId) {
//        this.addId = addId;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getPinched() {
//        return pinched;
//    }
//
//    public void setPinched(String pinched) {
//        this.pinched = pinched;
//    }
//
//    public void displayAddress() {
//        System.out.println("Address ID: " + addId);
//        System.out.println("City: " + city);
//        System.out.println("State: " + state);
//        System.out.println("Pinched: " + pinched);
//    }
//}



package com.add;

public class Address {
    private int addId;
    private String city;
    private String state;
    private String pinched;

    // Parameterized constructor
    public Address(int addId, String city, String state, String pinched) {
        this.addId = addId;
        this.city = city;
        this.state = state;
        this.pinched = pinched;
    }

    // Getter and Setter methods
    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinched() {
        return pinched;
    }

    public void setPinched(String pinched) {
        this.pinched = pinched;
    }

    // Method to display the address
    public void displayAddress() {
        System.out.println("Address ID: " + addId);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Pinched: " + pinched);
    }
}

