package com.itdr.cookie1;

public class User {
    private String name;
    private  Integer psa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPsa() {
        return psa;
    }

    public void setPsa(Integer psa) {
        this.psa = psa;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", psa=" + psa +
                '}';
    }
    public String show(){
        return name+","+psa;

    }
}
