package kontrol;

public class Pets extends HumanFriends {
    protected String vid = "Домашние животные";

    public Pets(int id, String name, String vid) {
        super(id, name);
        this.vid = vid;
    }

    public Pets() {
        super();
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public void getVid() {
    }

    @Override
    public String toString() {
        return "Pets{" +
                "vid='" + vid + '\'' +
                "} ";
    }
}
