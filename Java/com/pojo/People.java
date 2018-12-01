package com.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class People {
    private int id;
    private String name;
    private Set sets;
    private List list;
    private String[] arrays;
    private Map map;
    private Dog dog;

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sets=" + sets +
                ", list=" + list +
                ", arrays=" + Arrays.toString(arrays) +
                ", map=" + map +
                ", dog=" + dog +
                '}';
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Map getMap() {
        return map;
    }

    public People(int id, String name, Set sets, List list, String[] arrays) {
        this.id = id;
        this.name = name;
        this.sets = sets;
        this.list = list;
        this.arrays = arrays;
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public String[] getArrays() {
        return arrays;
    }

    public void setList(List list) {
        this.list = list;
    }

    public List getList() {
        return list;
    }

    public People(int id, String name, Set sets, List list) {
        this.id = id;
        this.name = name;
        this.sets = sets;
        this.list = list;
    }

    public void setSets(Set sets) {
        this.sets = sets;
    }

    public Set getSets() {
        return sets;
    }

    public People(int id, String name, Set sets) {
        this.id = id;
        this.name = name;
        this.sets = sets;
    }

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public People() {
    }
}
