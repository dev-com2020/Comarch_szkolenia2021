package com.company;

public class Product {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

@Override
    public boolean equals(Object obj){
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Product other = (Product) obj;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
        return false;
    return true;
}

}
