package airport;

import java.util.Calendar;

public class airport {

    private String name;
    private String country;
    private String street;
    private int number;
    private String city;
    private int capacity;
    private int year;

    public airport() {
    }

    public airport(String name, String country, String street, int number, String city, int capacity, int year) {
        this.name = name;
        this.country = country;
        this.street = street;
        this.number = number;
        this.city = city;
        this.capacity = capacity;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int inauYear(){
        int updateYear = Calendar.getInstance().get(Calendar.YEAR);
        return updateYear - this.year;
    }

    @Override
    public String toString() {
        return "airport [name=" + name + ", country=" + country + ", street=" + street + ", number=" + number
                + ", city=" + city + ", capacity=" + capacity + ", year=" + year + "]";
    }

    
}
