public abstract class Stage {
    protected int length;
    protected String description;
    protected boolean finish;

    public boolean isFinish() {
        return finish;
    }

    public String getDescription() {
        return description;
    }
    public abstract void go(Car c);
}
