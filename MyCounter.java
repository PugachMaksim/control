package kontrol;

public class MyCounter implements AutoCloseable{
    private int count;
    private boolean CreatedInTry;
    public MyCounter() {
        this.count = 0;
        this.CreatedInTry = false;
    }

    public MyCounter(boolean InTry) {
        this.count = 0;
        this.CreatedInTry = InTry;
    }
    public void add() {
        count++;
    }

    public int getCount(){
        return count;
    }

    @Override
    public void close() throws Exception {
        if (!CreatedInTry) throw new Exception("Счетчик был использован не в блоке try-with-resources");
    }
}
