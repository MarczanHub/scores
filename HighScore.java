public class HighScore {
    public static void main(String[] args) {
        
        int number1 = randomNumber();
        int number2 = randomNumber();
        int number3 = randomNumber();
        int number4 = randomNumber();
        int number5 = randomNumber();
        int number6 = randomNumber();
        int number7 = randomNumber();
        int number8 = randomNumber();
        int number9 = randomNumber();
        int number10 = randomNumber();
        
        int highScore = 0;
        int[] scores = {number1, number2, number3, number4, number5, number6, number7, number8, number9, number10};
        System.out.print("Here are the scores: ");
        for(int i = 0; i < scores.length; i++){
            System.out.print(scores[i] + " ");
            if(scores[i] > highScore){
                highScore = scores[i];
            }
        }
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
    }
    public static int randomNumber(){
        double randomNumber = Math.random() * 50000;
        randomNumber++;
        return (int) randomNumber;
    }
}
