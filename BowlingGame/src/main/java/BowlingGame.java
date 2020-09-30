public class BowlingGame {

    private final int MAX_PINS_PER_FRAME = 10;
    private final int MAX_BOWLS_PER_GAME = 21;

    private int roll = 0;
    private int[] rolls = new int[MAX_BOWLS_PER_GAME]; // max

    public void roll(int val){
        rolls[roll++] = val;
    }

    public void roll(int...rolls){
        for(int pins : rolls){
            roll(pins);
        }
    }

    public int score() {
        int score = 0;
        int i = 0; // index of frames
        for(int frame = 0; frame < 10; frame++){
            if(rolls[i] == MAX_PINS_PER_FRAME) { // Strike at first bowl
                score += MAX_PINS_PER_FRAME + rolls[i+1] + rolls[i+2];
                i++;
            }else if(rolls[i] + rolls[i+1] == MAX_PINS_PER_FRAME){ // Checks for spare.. 2 parts of the frame (i and i+1)
                score += MAX_PINS_PER_FRAME + rolls[i+2];
            }else {
                score += rolls[i] + rolls[i + 1];
                i += 2;
            }
        }
        return score;
    }

}
