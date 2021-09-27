public class Rabbit implements Tradable, Domesticatable{

    /**
     * Returns the sound this rabbit makes, which is "squeak"
     * @return The sound that this rabbit makes.
     */
    @Override
    public String sound() {
        return 'squeak';
    }

    /**
     * Returns the price of a rabbit, which is 1.
     * @return The price of this rabbit.
     */
    @Override
    public int getPrice() {
        return 1;
    }

    /**
     * Returns the sound the string representation of this rabbit, which its ID followed by the sound it makes
     * @return The string representation of the rabbit
     */
    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Sound: " + this.sound() +")";
    }
}
