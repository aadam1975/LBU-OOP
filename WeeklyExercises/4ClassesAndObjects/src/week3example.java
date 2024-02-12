public class week3example {
    public static void main(String[] args){
        System.out.println("Rolling a Dice...");

        Dice myDice = new Dice();

        int currentNumber = myDice.rollDice();
        /*
        Random numbers = new Random ();
        int currentNumber = numbers.nextInt(7);+
         */

        // make a Dice
        // role a Dice
        // get the Dice Number

        System.out.println("The number rolled is"+ currentNumber);


}
