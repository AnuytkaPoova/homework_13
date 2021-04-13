import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
    Semaphore s;

    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
        s = new Semaphore(2);
    }
    @Override
    public void go(Car c) {
        try {
            try {
                s.acquire();
                System.out.println(c.getName() + " готовится к этапу(ждет): " +
                        description);
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " +
                        description);
                s.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
