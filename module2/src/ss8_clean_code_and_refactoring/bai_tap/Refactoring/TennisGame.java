package ss8_clean_code_and_refactoring.bai_tap.Refactoring;

public class TennisGame {

    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;

    public static String getScore(String player1Name, String player2Name, int scorePlay1, int scorePlay2) {
        String score = "";
        int tempScore = 0;
        boolean equalScore = scorePlay1 == scorePlay2;
        if (equalScore) {
            switch (scorePlay1) {
                case ZERO:
                    score = "Love-All";
                    break;
                case ONE:
                    score = "Fifteen-All";
                    break;
                case TWO:
                    score = "Thirty-All";
                    break;
                case THREE:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else {
            boolean scoreGreaterThanThree = scorePlay1 >= 4 || scorePlay2 >= 4;
            if (scoreGreaterThanThree) {
                int minusResult = scorePlay1 - scorePlay2;
                if (minusResult == 1) score = "Advantage player1";
                else if (minusResult == -1) score = "Advantage player2";
                else if (minusResult >= 2) score = "Win for player1";
                else score = "Win for player2";
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = scorePlay1;
                    else {
                        score += "-";
                        tempScore = scorePlay2;
                    }
                    switch (tempScore) {
                        case ZERO:
                            score += "Love";
                            break;
                        case ONE:
                            score += "Fifteen";
                            break;
                        case TWO:
                            score += "Thirty";
                            break;
                        case THREE:
                            score += "Forty";
                            break;
                    }
                }
            }
        }
        return score;
    }



}

