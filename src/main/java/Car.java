public class Car implements Tradable, Drivable{
    private int price;
    private int s;
    public Car(int price, int s){
        this.price = price;
        this.s = s;
    }
    @Override
    public int getPrice() {
        return price;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getS() {
        return s;
    }

    @Override
    public void downgradeSpeed() {
        this.s -= 1;
    }

    @Override
    public void upgradeSpeed() {
        this.s += 1;
    }

    @Override
    public int getMaxSpeed() {
        return this.getS();
    }

    public String drive(){
        double c = Math.random() * 100;
        if(c > 50.1){
            this.s -= 1;
            return "You have crashed!";
        }
        return "arrived to destination";
    }
}
