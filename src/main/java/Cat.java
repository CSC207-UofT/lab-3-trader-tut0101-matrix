public class Cat implements Drivable, Domesticatable, Tradable{
    private int maxSpeed;

    public Cat() {
        this.maxSpeed = 1;
    }

    public food() {
        return "beef";
    }

    @Override
    public String sound() {
        return "MeowMeow!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed+= 1 + (int)(Math.random() * 5);
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 2;
    }
}
