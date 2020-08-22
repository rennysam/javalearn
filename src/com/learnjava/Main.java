package com.learnjava;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] firstName={"Renny","Params","Govind"};
        String[] lastName={"sam","byju","mahesh"};

        List<User> users = new ArrayList<User>();

        for(int i=0; i< firstName.length; i++){
           User u = new User();
           u.setFirstName(firstName[i]);
           u.setLastName(lastName[i]);
           users.add(u);
        }

        for(User u:users){
            System.out.println(u.getFullName());
        }
        Main m = new Main();
        m.printUser(users.get(0));
    }

    public  void printUser(User u){

        System.out.println(u.getFullName());
    }
}
