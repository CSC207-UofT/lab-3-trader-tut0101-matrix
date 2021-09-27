public class Car implements Tradable, Drivable{
    private int max_Speed;
    public int cost;

    public Car(int maxSpeed, int cost) {
        this.max_Speed = maxSpeed;
        this.cost = cost;
    }

    /**
     * Upgrade the speed of this car.
     */
    @Override
    public void upgradeSpeed() {
        this.max_Speed = this.max_Speed * 2;
    }

    /**
     * Downgrade the speed of this car.
     */
    @Override
    public void downgradeSpeed() {
        this.max_Speed--;
    }

    /**
     * Return the max speed of this car.
     */
    @Override
    public int getMaxSpeed() {
        return this.max_Speed;
    }


    /**
     * Return the cost of this car, which is constantly 10000.
     */
    @Override
    public int getPrice() {
        return this.cost;
    }


}
