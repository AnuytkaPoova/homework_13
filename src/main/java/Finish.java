public class Finish extends Stage {
    private  boolean win = true;

    public boolean isWin() {
        return win;
    }

    public  void setWin(boolean win) {
        this.win = win;
    }

    @Override
    public synchronized void go(Car c) {
        try {
            Thread.sleep(length / c.getSpeed() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (this.isWin()){
            System.out.println(c.getName() + " WIN " );
            this.setWin(false);
        } else {
            System.out.println(c.getName() + " финишировал" );
        }

    }
}
