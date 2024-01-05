package kontrol;

public class PackAnimals extends HumanFriends {
    protected String vid = "Вьючные животные";

    public PackAnimals(int id, String name, String vid) {
        super(id, name);
        this.vid = vid;
    }

    public PackAnimals() {
        super();
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public void getVid() {
    }

    @Override
    public String toString() {
        return "PackAnimals{" +
                "vid='" + vid + '\'' +
                "} ";
    }

}
