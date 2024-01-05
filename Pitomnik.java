package kontrol;

import kontrol.PackAnimal.Camal;
import kontrol.PackAnimal.Donkeys;
import kontrol.PackAnimal.Horses;
import kontrol.Pet.Cats;
import kontrol.Pet.Dogs;
import kontrol.Pet.Hamsters;


import java.util.ArrayList;

public class Pitomnik {

    private ArrayList<Object> pitomnik;
    public Pitomnik() {
        this.pitomnik = new ArrayList<>();
    }
    public int kolpet(){
        return pitomnik.size();
    }

    public void plusDog(Dogs dogs){
        System.out.println(dogs.getKlichka() + " добавлен в питомник");
        this.pitomnik.add(dogs);
    }

    public void plusCats(Cats cat){
        System.out.println(cat.getKlichka() + " добавлен в питомник");
        this.pitomnik.add(cat);
    }

    public void plusHamsters(Hamsters hamsters){
        System.out.println(hamsters.getKlichka() + " добавлен в питомник");
        this.pitomnik.add(hamsters);
    }

    public void plusCamal(Camal camal){
        System.out.println(camal.getKlichka() + " добавлен в питомник");
        this.pitomnik.add(camal);
    }

    public void plusDonkeys(Donkeys donkeys){
        System.out.println(donkeys.getKlichka() + " добавлен в питомник");
        this.pitomnik.add(donkeys);
    }

    public void plusHorses(Horses horses){
        System.out.println(horses.getKlichka() + " добавлен в питомник");
        this.pitomnik.add(horses);
    }
    
    public void ListPitomnik(){
        for (Object animal: pitomnik){
            System.out.println(animal.toString());
        }
    }

    public Object getAnimal(int NId) {
        for (Object animal: pitomnik){
            if (((HumanFriends)(animal)).getId() == NId)
                return animal;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Pitomnik{" +
                "pitomnik=" + pitomnik +
                '}';
    }


}
