package kontrol;

import java.util.Scanner;

import kontrol.PackAnimal.Camal;
import kontrol.PackAnimal.Donkeys;
import kontrol.PackAnimal.Horses;
import kontrol.Pet.Cats;
import kontrol.Pet.Dogs;
import kontrol.Pet.Hamsters;


public class Main {
    public static void main(String[] args) throws Exception {
        Pitomnik pitomnik = new Pitomnik();
        boolean prodCikl = true;

        try (MyCounter schetchik = new MyCounter(true)) {
            while (prodCikl) {
                System.out.println("""
                        Добрый день, что делаем?\s
                        1 Завести новое животное\s
                        2 Обучить животное новым командам""");
                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();
                switch (i) {
                    case 1 -> {
                        System.out.println("""
                                Хорошо, какое животное?\s
                                1 Домашнее животное\s
                                2 Вьючное животное""");
                        int j = sc.nextInt();
                        switch (j) {
                            case 1 -> {
                                System.out.println("""
                                        Хорошо, идем дальше\s
                                        1 Собака\s
                                        2 Кошка\s
                                        3 Хомяк""");
                                int k = sc.nextInt();
                                switch (k) {
                                    case 1 -> {
                                        int kolpet = pitomnik.kolpet();
                                        Dogs dog = new Dogs();
                                        dog.setId(kolpet);
                                        dog.setName("Друзья человека");
                                        dog.setVid("Домашние животные");
                                        dog.setKlichka();
                                        dog.setBirthDate();
                                        dog.setSkillist();
                                        System.out.println(dog);
                                        if (dog.AllFilled()) {
                                            schetchik.add();
                                            pitomnik.plusDog(dog);
                                            System.out.println("Число добавленных животных: "+schetchik.getCount());
                                        }else System.out.println("Вы не заполнили все данные. Животное не будет добавлено.");
                                    }
                                    case 2 -> {
                                        int kolpet = pitomnik.kolpet();
                                        Cats cat = new Cats();
                                        cat.setId(kolpet);
                                        cat.setName("Друзья человека");
                                        cat.setVid("Домашние животные");
                                        cat.setKlichka();
                                        cat.setBirthDate();
                                        cat.setSkillist();
                                        System.out.println(cat);
                                        pitomnik.plusCats(cat);
                                    }
                                    case 3 -> {
                                        int kolpet = pitomnik.kolpet();
                                        Hamsters hamsters = new Hamsters();
                                        hamsters.setId(kolpet);
                                        hamsters.setName("Друзья человека");
                                        hamsters.setVid("Домашние животные");
                                        hamsters.setKlichka();
                                        hamsters.setBirthDate();
                                        hamsters.setSkillist();
                                        System.out.println(hamsters);
                                        pitomnik.plusHamsters(hamsters);
                                    }
                                    default -> throw new IllegalStateException("Unexpected value: " + k);
                                }
                            }
                            case 2 -> {
                                System.out.println("""
                                        Хорошо, идем дальше\s
                                        1 Верблюд\s
                                        2 Осел\s
                                        3 Лошадь""");
                                int m = sc.nextInt();
                                switch (m) {
                                    case 1 -> {
                                        int kolpet = pitomnik.kolpet();
                                        Camal camal = new Camal();
                                        camal.setId(kolpet);
                                        camal.setName("Друзья человека");
                                        camal.setVid("Вьючные животные");
                                        camal.setKlichka();
                                        camal.setBirthDate();
                                        camal.setSkillist();
                                        System.out.println(camal);
                                        pitomnik.plusCamal(camal);
                                    }
                                    case 2 -> {
                                        int kolpet = pitomnik.kolpet();
                                        Donkeys donkeys = new Donkeys();
                                        donkeys.setId(kolpet);
                                        donkeys.setName("Друзья человека");
                                        donkeys.setVid("Вьючные животные");
                                        donkeys.setKlichka();
                                        donkeys.setBirthDate();
                                        donkeys.setSkillist();
                                        System.out.println(donkeys);
                                        pitomnik.plusDonkeys(donkeys);
                                    }
                                    case 3 -> {
                                        int kolpet = pitomnik.kolpet();
                                        Horses horses = new Horses();
                                        horses.setId(kolpet);
                                        horses.setName("Друзья человека");
                                        horses.setVid("Вьючные животные");
                                        horses.setKlichka();
                                        horses.setBirthDate();
                                        horses.setSkillist();
                                        System.out.println(horses);
                                        pitomnik.plusHorses(horses);
                                    }
                                    default -> throw new IllegalStateException("Unexpected value: " + m);
                                }
                            }
                            default -> throw new IllegalStateException("Unexpected value: " + j);
                        }
                    }
                    case 2 -> {
                        System.out.println("Введите Id нужного животного");
                        pitomnik.ListPitomnik();
                        int NId = sc.nextInt();
                        Object animal = pitomnik.getAnimal(NId);
                        String AnimalClassName = animal.getClass().getName();
                        switch (AnimalClassName) {
                            case "kontrol.Pet.Dogs" -> {
                                ((Dogs) (animal)).setSkillist();
                                System.out.println("Умения добавлены:");
                                System.out.println(animal);
                            }
                            case "kontrol.Pet.Cats" -> {
                                ((Cats) (animal)).setSkillist();
                                System.out.println("Умения добавлены:");
                                System.out.println(animal);
                            }
                            case "kontrol.Pet.Hamsters" -> {
                                ((Hamsters) (animal)).setSkillist();
                                System.out.println("Умения добавлены:");
                                System.out.println(animal);
                            }
                            case "kontrol.PackAnimal.Camal" -> {
                                ((Camal) (animal)).setSkillist();
                                System.out.println("Умения добавлены:");
                                System.out.println(animal);
                            }
                            case "kontrol.PackAnimal.Horses" -> {
                                ((Horses) (animal)).setSkillist();
                                System.out.println("Умения добавлены:");
                                System.out.println(animal);
                            }
                            case "kontrol.PackAnimal.Donkeys" -> {
                                ((Donkeys) (animal)).setSkillist();
                                System.out.println("Умения добавлены:");
                                System.out.println(animal);
                            }
                            default -> {
                                System.out.println("Нет такого животного");
                            }
                        }
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + i);
                }
                System.out.println("1 Продолжить работу \n" +
                        "2 Закончить работу");
                int m = sc.nextInt();
                if (m == 2) prodCikl = false;
            }
        }
    }
}