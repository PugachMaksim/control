package kontrol;

import java.util.Scanner;

public abstract class HumanFriends {
    Scanner sc = new Scanner(System.in);

    private int id;
    private String name;


    public HumanFriends(int id, String name) {
        this.id =id;
        this.name=name;
    }

    public HumanFriends() {
    }

    public int getId() {
        return id;
    }


    public void setId(int kolpet) {
        id = kolpet+1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(int i){
        i = i++;
    }

    @Override
    public String toString() {
        return "HumanFriends{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
