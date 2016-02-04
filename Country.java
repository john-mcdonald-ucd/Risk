import javax.swing.*;
import java.awt.*;

/**
 * Created by johnmcdonald on 03/02/2016.
 */
public class Country {

    private String mName;
    private int[] mCoord;
    private int[][] mAdjacent;
    private int mUnits;
    private Color mColor;

    public Country(String name, int[] coord) {
        mName = name;
        mCoord = coord;
    }

//    public Country(String name, int[] coord, int[][] adjacent, int units, Color color) {
//        mName = name;
//        mCoord = coord;
//        mAdjacent = adjacent;
//        mUnits = units;
//        mColor = color;
//    }
    
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int[] getCoord() {
        return mCoord;
    }

    public void setCoord(int[] coord) {
        mCoord = coord;
    }

    public int[][] getAdjacent() {
        return mAdjacent;
    }

    public void setAdjacent(int[][] adjacent) {
        mAdjacent = adjacent;
    }

    public int getUnits() {
        return mUnits;
    }

    public void setUnits(int units) {
        mUnits = units;
    }

    public Color getColor() {
        return mColor;
    }

    public void setColor(Color color) {
        mColor = color;
    }
}
