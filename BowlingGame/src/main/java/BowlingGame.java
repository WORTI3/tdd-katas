public class BowlingGame {

    private final int MAX_PINS_PER_FRAME = 10;
    private final int MAX_FRAMES_PER_GAME = 10;
    private final int MAX_BOWLS_PER_GAME = 21;

    private int roll = 0;
    private int[] rolls = new int[MAX_BOWLS_PER_GAME]; // max

    public void roll(int val){
        rolls[roll++] = val;
    } // Increases the roll variable by 1 each time roll is executed.

    /*
     * Roll method:
     * Mainly used for testing, this method uses an array of numbers and puts them through a for-each loop.
     */
    public void roll(int...rolls){
        for(int pins : rolls){
            roll(pins);
        }
    }

    /*
     * Score method:
     * Calculates how many points a player won in a "bowl".
     */
    public int score() {
        int score = 0; // Has to be inside and not a global variable to limit problems with multi-threading.
        int i = 0; // index of frames
        for(int frame = 0; frame < MAX_FRAMES_PER_GAME; frame++){ // Gives us some frames to work with. (10 frames per game)
            if(rolls[i] == MAX_PINS_PER_FRAME) { // Strike at first bowl within a frame.
                score += MAX_PINS_PER_FRAME + rolls[i+1] + rolls[i+2];
                i++; // Adds 1 frame to the "index" as a strike only allows for one bowl.
            }else if(rolls[i] + rolls[i+1] == MAX_PINS_PER_FRAME){ // Checks for spare.. 2 parts of the frame (i and i+1, 5 and 5).
                score += MAX_PINS_PER_FRAME + rolls[i+2]; // Ten plus the score of the next whole frame.
            }else{ // If not a strike or a spare..
                score += rolls[i] + rolls[i + 1]; // Add first and second part of the frame to the score..
                i += 2;
            }
        }
        return score; // Returns the score, how many pins knocked plus bonuses for strikes and spares.
    }

}
