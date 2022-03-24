public class methodsExercVideo {
    public static void main(String[] args) {

        int tablePosition=calculateHighScorePosition(1500);
        displayHighScorePosition("Antonio", tablePosition );

        tablePosition=calculateHighScorePosition(900);
        displayHighScorePosition("Pepe", tablePosition );

        tablePosition=calculateHighScorePosition(400);
        displayHighScorePosition("Maria", tablePosition );

        tablePosition=calculateHighScorePosition(50);
        displayHighScorePosition("Inma", tablePosition );



    }

    public static void displayHighScorePosition(String playerName, int tablePosition){
        System.out.println(playerName + " managed to get into position " + tablePosition +
                " on the high score table");
    }
    public static int calculateHighScorePosition(int score){
        if(score>=1000){
            return 1;
        }else if(score>=500 && score<1000){
            return 2;
        }else if(score>100 &&  score<500){
            return 3;
        }else {
            return 4;
        }
    }
}
