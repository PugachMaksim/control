package kontrol.PackAnimal;
import kontrol.PackAnimals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Donkeys extends PackAnimals {
    Scanner sc = new Scanner(System.in);

    private String klichka;
    private LocalDate BirthDate;
    private List<String>Skillist;


    public Donkeys(int id, String name, String vid, String klichka, int BirthDate, List<String> Skillist) {
        super(id, name, vid);
        this.klichka = klichka;
        this.BirthDate = LocalDate.ofEpochDay(BirthDate);
        this.Skillist = new ArrayList<>();
    }

    public Donkeys() {
        super();
        this.Skillist = new ArrayList<>();
    }


    public String getKlichka() {
        return klichka;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setKlichka() {
        System.out.println("Введите кличку животного");
        this.klichka = sc.nextLine();

    }

    public void setBirthDate() {
        int Y;
        int M;
        int D;
        System.out.println("Введите дату рождения в формате: год, месяц, день");
        BirthDate = LocalDate.of(Y = sc.nextInt(), M = sc.nextInt(), D = sc.nextInt());
        String temp=sc.nextLine();
    }
    public void setSkillist() {
        System.out.println("Введите умения через запятую");
        String skill = sc.nextLine();
        List<String> NewSkillist = List.of(skill.split(", "));
        this.Skillist.addAll(NewSkillist);
    }

    @Override
    public String toString() {
        return "Осел" +
                "Id=" + getId() + '\'' +
                ", вид(Класс):" + vid +
                "Кличка:" + klichka + '\'' +
                ", Дата рождения:" + BirthDate +
                ", Умеет:" + Skillist + '\'';
    }
}
