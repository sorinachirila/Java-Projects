public class Darts {
    //define and initialize necessary members
    enum Multiplier {
        DOUBLE, TRIPLE, XX;
    }

    private int score = 301;
    private int dartsLeft = 3;
    private boolean isFinished = false;
    private int turn = 1;
    private int lastTurnScore = score;


    //define getters
    public int score() {
        return score;
    }

    public int dartsLeft() {
        return dartsLeft;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public int turn() {
        return turn;
    }

    public int lastTurnScore() {
        return lastTurnScore;
    }

    //actual methods
//    public void darts(int scoreTemp){
//        updateDartBoard(scoreTemp, null);
//    }

    public void darts(int throwScore){
        updateDartBoard(throwScore, null);
    }


    public void darts(int i, Multiplier m){
        int multiplier;
        int throwScore;

        switch(m){
            case DOUBLE:
                multiplier = 2;
                break;
            case TRIPLE:
                multiplier = 3;
                break;
            default:
                multiplier = 1;
                break;
        }
        throwScore = multiplier * i;
        updateDartBoard(throwScore, m);
    }

    public void updateDartBoard(int throwScore, Multiplier m){

        int currentScore = score - throwScore;

        if(dartsLeft == 1){
                turn++;
                dartsLeft = 3;//update
        } else {
                dartsLeft--;
        }

        if(currentScore == 0 && m == Multiplier.DOUBLE){
                isFinished = true;
//                score = throwScore;
//                return;
        } else{
            if(currentScore > 1 && dartsLeft == 3){
                lastTurnScore = currentScore;
            }

            if(currentScore <= 1){
                currentScore = lastTurnScore;
            }
        }
        score = currentScore;

//            if(throwScore <= 1){
//                throwScore = lastTurnScore;
//            }
//
//            if(throwScore > 1 && dartsLeft == 3){
//                lastTurnScore = throwScore;
//            }
//            score = throwScore;
    }


}
