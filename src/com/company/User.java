package com.company;

public class User implements Comparable {

    String name;
    int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        System.out.println("hash");
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        User a=(User)obj;
        if(a.id==this.id)return a.name.equals(this.name);
        return a.id==this.id;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        User a=(User)o;
        return this.id-a.id;
    }
}
