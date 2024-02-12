public class dice {

    int sides;
    int currentNumber;




    //This is a Constructor method
    public Dice() {

    }

    public int rollDice() {
        Random numbers = new Random();
        int currentNumber = number.nextInt(7);
        return currentNumber;
    }

}

