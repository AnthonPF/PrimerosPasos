public class Methods {

    public static void main(String[] args) {

        boolean gameOver=true;
        int score=800;
        int levelCompleted=5;
        int bonus=100;

        int highScore=calculateScore(gameOver, score, levelCompleted, bonus);//metodo creado abajo
        System.out.println("Your final score was " + highScore);

        gameOver=true;
        score=10000;
        levelCompleted=8;
        bonus=200;

        highScore=calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }else{
            return -1;
        }

    }
}