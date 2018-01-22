package edu.macalester.comp124.life;

/**
 * Created by bjackson on 9/8/2016.
 */
public class HighLife implements RuleSet {

    public String getName() {
        return "Highlife's Rules";
    }

    /**
     * Applies the rules of Conway's Game of Life.
     *
     * @param isAlive       The value of the current cell (true = alive).
     * @param neighborCount The number of living neighbors of the cell.
     * @return true if the cell should be alive in the next generation.
     */
    public boolean applyRules(boolean isAlive, int neighborCount) {
        if(isAlive && (neighborCount < 2 || neighborCount > 3)){
            return false;
        }
        else if(!isAlive && (neighborCount == 3 || neighborCount == 6)){
            return true;
        }
        return isAlive;
    }
}
