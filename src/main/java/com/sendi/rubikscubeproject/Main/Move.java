package com.sendi.rubikscubeproject.Main;

import javafx.geometry.Side;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Move {

    static Map<Enum, CubeSide> moveCube;

    public Move(Map<Enum, CubeSide> cube) {
        this.moveCube = cube;
    }

    public void topToRight(Sides sides) {
        Enum[] topRowOftheCurrentSide = moveCube.get(sides).getSchema()[0];
        Enum[] topRowOftheLeftSide = moveCube.get(Sides.LEFT).getSchema()[0];
        Enum[] topRowOftheRightSide = moveCube.get(Sides.RIGHT).getSchema()[0];
        Enum[] topRowOftheBackSide = moveCube.get(Sides.BACK).getSchema()[0];

        Enum[] tempSide = topRowOftheCurrentSide;

        topRowOftheCurrentSide = topRowOftheLeftSide;
        topRowOftheLeftSide = topRowOftheBackSide;
        topRowOftheBackSide = topRowOftheRightSide;
        topRowOftheRightSide = tempSide;

        moveCube.get(sides).setSchemaRow(topRowOftheCurrentSide, 0);
        moveCube.get(Sides.LEFT).setSchemaRow(topRowOftheLeftSide, 0);
        moveCube.get(Sides.BACK).setSchemaRow(topRowOftheBackSide, 0);
        moveCube.get(Sides.RIGHT).setSchemaRow(topRowOftheRightSide, 0);

        moveCube.get(Sides.TOP).rotateSchemaClockwise();
    }

    public void middleToRight(Sides sides) {

        Enum[] middleRowOftheCurrentSide = moveCube.get(sides).getSchema()[1];
        Enum[] middleRowOftheLeftSide = moveCube.get(Sides.LEFT).getSchema()[1];
        Enum[] middleRowOftheRightSide = moveCube.get(Sides.RIGHT).getSchema()[1];
        Enum[] middleRowOftheBackSide = moveCube.get(Sides.BACK).getSchema()[1];

        Enum[] tempSide = middleRowOftheCurrentSide;

        middleRowOftheCurrentSide = middleRowOftheLeftSide;
        middleRowOftheLeftSide = middleRowOftheBackSide;
        middleRowOftheBackSide = middleRowOftheRightSide;
        middleRowOftheRightSide = tempSide;

        moveCube.get(sides).setSchemaRow(middleRowOftheCurrentSide, 1);
        moveCube.get(Sides.LEFT).setSchemaRow(middleRowOftheLeftSide, 1);
        moveCube.get(Sides.BACK).setSchemaRow(middleRowOftheBackSide, 1);
        moveCube.get(Sides.RIGHT).setSchemaRow(middleRowOftheRightSide, 1);
    }

    public void bottomToRight(Sides sides) {
        Enum[] topRowOftheCurrentSide = moveCube.get(sides).getSchema()[2];
        Enum[] topRowOftheLeftSide = moveCube.get(Sides.LEFT).getSchema()[2];
        Enum[] topRowOftheRightSide = moveCube.get(Sides.RIGHT).getSchema()[2];
        Enum[] topRowOftheBackSide = moveCube.get(Sides.BACK).getSchema()[2];

        Enum[] tempSide = topRowOftheCurrentSide;

        topRowOftheCurrentSide = topRowOftheLeftSide;
        topRowOftheLeftSide = topRowOftheBackSide;
        topRowOftheBackSide = topRowOftheRightSide;
        topRowOftheRightSide = tempSide;

        moveCube.get(sides).setSchemaRow(topRowOftheCurrentSide, 2);
        moveCube.get(Sides.LEFT).setSchemaRow(topRowOftheLeftSide, 2);
        moveCube.get(Sides.BACK).setSchemaRow(topRowOftheBackSide, 2);
        moveCube.get(Sides.RIGHT).setSchemaRow(topRowOftheRightSide, 2);

        moveCube.get(Sides.BOTTOM).rotateSchemaClockwise();
    }

    public void topToleft(Sides sides){
        Enum[] topRowOftheCurrentSide = moveCube.get(sides).getSchema()[0];
        Enum[] topRowOftheLeftSide = moveCube.get(Sides.LEFT).getSchema()[0];
        Enum[] topRowOftheRightSide = moveCube.get(Sides.RIGHT).getSchema()[0];
        Enum[] topRowOftheBackSide = moveCube.get(Sides.BACK).getSchema()[0];

        Enum[] tempSide = topRowOftheCurrentSide;

        topRowOftheCurrentSide = topRowOftheRightSide;
        topRowOftheRightSide = topRowOftheBackSide;
        topRowOftheBackSide = topRowOftheLeftSide;
        topRowOftheLeftSide = tempSide;

        moveCube.get(sides).setSchemaRow(topRowOftheCurrentSide, 0);
        moveCube.get(Sides.LEFT).setSchemaRow(topRowOftheLeftSide, 0);
        moveCube.get(Sides.BACK).setSchemaRow(topRowOftheBackSide, 0);
        moveCube.get(Sides.RIGHT).setSchemaRow(topRowOftheRightSide, 0);

        moveCube.get(Sides.TOP).rotateSchemaCounterClockwise();

    }
    public void middleToLeft(Sides sides){
        Enum[] middleRowOftheCurrentSide = moveCube.get(sides).getSchema()[1];
        Enum[] middleRowOftheLeftSide = moveCube.get(Sides.LEFT).getSchema()[1];
        Enum[] middleRowOftheRightSide = moveCube.get(Sides.RIGHT).getSchema()[1];
        Enum[] middleRowOftheBackSide = moveCube.get(Sides.BACK).getSchema()[1];

        Enum[] tempSide = middleRowOftheCurrentSide;

        middleRowOftheCurrentSide = middleRowOftheRightSide;
        middleRowOftheRightSide = middleRowOftheBackSide;
        middleRowOftheBackSide = middleRowOftheLeftSide;
        middleRowOftheLeftSide = tempSide;

        moveCube.get(sides).setSchemaRow(middleRowOftheCurrentSide, 1);
        moveCube.get(Sides.LEFT).setSchemaRow(middleRowOftheLeftSide, 1);
        moveCube.get(Sides.BACK).setSchemaRow(middleRowOftheBackSide, 1);
        moveCube.get(Sides.RIGHT).setSchemaRow(middleRowOftheRightSide, 1);
    }
    public void bottomToLeft(Sides sides) {
        Enum[] topRowOftheCurrentSide = moveCube.get(sides).getSchema()[2];
        Enum[] topRowOftheLeftSide = moveCube.get(Sides.LEFT).getSchema()[2];
        Enum[] topRowOftheRightSide = moveCube.get(Sides.RIGHT).getSchema()[2];
        Enum[] topRowOftheBackSide = moveCube.get(Sides.BACK).getSchema()[2];

        Enum[] tempSide = topRowOftheCurrentSide;

        topRowOftheCurrentSide = topRowOftheRightSide;
        topRowOftheRightSide = topRowOftheBackSide;
        topRowOftheBackSide = topRowOftheLeftSide;
        topRowOftheLeftSide = tempSide;

        moveCube.get(sides).setSchemaRow(topRowOftheCurrentSide, 2);
        moveCube.get(Sides.LEFT).setSchemaRow(topRowOftheLeftSide, 2);
        moveCube.get(Sides.BACK).setSchemaRow(topRowOftheBackSide, 2);
        moveCube.get(Sides.RIGHT).setSchemaRow(topRowOftheRightSide, 2);

        moveCube.get(Sides.BOTTOM).rotateSchemaCounterClockwise();
    }

    //back sides of the cube act differently, so that we have to keep our sharp eye on it and manage it to rotate flawlessly
    public void leftToUp(Sides sides) {
        Enum bottomRowLeftElementOfCurrentSide = moveCube.get(sides).getSchema()[2][0];
        Enum bottomRowLeftElementOfTopSide = moveCube.get(Sides.TOP).getSchema()[2][0];
        Enum bottomRowLeftElementOfBackSide = moveCube.get(Sides.BACK).getSchema()[0][2];
        Enum bottomRowLeftElementOfBottomSide = moveCube.get(Sides.BOTTOM).getSchema()[2][0];

        Enum temp = bottomRowLeftElementOfCurrentSide;
        moveCube.get(sides).setSchemaElement(2, 0, bottomRowLeftElementOfBottomSide);
        moveCube.get(Sides.BOTTOM).setSchemaElement(2, 0, bottomRowLeftElementOfBackSide);
        moveCube.get(Sides.BACK).setSchemaElement(0, 2, bottomRowLeftElementOfTopSide);
        moveCube.get(Sides.TOP).setSchemaElement(2, 0, temp);

        Enum middleRowLeftElementOfCurrentSide = moveCube.get(sides).getSchema()[1][0];
        Enum middleRowLeftElementOfTopSide = moveCube.get(Sides.TOP).getSchema()[1][0];
        Enum middleRowLeftElementOfBackSide = moveCube.get(Sides.BACK).getSchema()[1][2];
        Enum middleRowLeftElementOfBottomSide = moveCube.get(Sides.BOTTOM).getSchema()[1][0];

        temp = middleRowLeftElementOfCurrentSide;
        moveCube.get(sides).setSchemaElement(1, 0, middleRowLeftElementOfBottomSide);
        moveCube.get(Sides.BOTTOM).setSchemaElement(1, 0, middleRowLeftElementOfBackSide);
        moveCube.get(Sides.BACK).setSchemaElement(1, 2, middleRowLeftElementOfTopSide);
        moveCube.get(Sides.TOP).setSchemaElement(1, 0, temp);

        Enum topRowLeftElementOfCurrentSide = moveCube.get(sides).getSchema()[0][0];
        Enum topRowLeftElementOfTopSide = moveCube.get(Sides.TOP).getSchema()[0][0];
        Enum topRowLeftElementOfBackSide = moveCube.get(Sides.BACK).getSchema()[0][0];
        Enum topRowLeftElementOfBottomSide = moveCube.get(Sides.BOTTOM).getSchema()[0][0];

        temp = topRowLeftElementOfCurrentSide;
        moveCube.get(sides).setSchemaElement(0, 0, topRowLeftElementOfBottomSide);
        moveCube.get(Sides.BOTTOM).setSchemaElement(0, 0,topRowLeftElementOfBackSide);
        moveCube.get(Sides.BACK).setSchemaElement(2, 2, topRowLeftElementOfTopSide);
        moveCube.get(Sides.TOP).setSchemaElement(0, 0, temp);

        moveCube.get(Sides.LEFT).rotateSchemaClockwise();

    }
    public void middleToUp(Sides sides) {
        Enum bottomRowMiddleElementOfCurrentSide = moveCube.get(sides).getSchema()[2][1];
        Enum bottomRowMiddleElementOfTopSide = moveCube.get(Sides.TOP).getSchema()[2][1];
        Enum bottomRowMiddleElementOfBackSide = moveCube.get(Sides.BACK).getSchema()[0][1];
        Enum bottomRowMiddleElementOfBottomSide = moveCube.get(Sides.BOTTOM).getSchema()[2][1];

        Enum temp = bottomRowMiddleElementOfCurrentSide;
        moveCube.get(sides).setSchemaElement(2, 1, bottomRowMiddleElementOfBottomSide);
        moveCube.get(Sides.BOTTOM).setSchemaElement(2, 1, bottomRowMiddleElementOfBackSide);
        moveCube.get(Sides.BACK).setSchemaElement(0, 1, bottomRowMiddleElementOfTopSide);
        moveCube.get(Sides.TOP).setSchemaElement(2, 1, temp);

        Enum middleRowMiddleElementOfCurrentSide = moveCube.get(sides).getSchema()[1][1];
        Enum middleRowMiddleElementOfTopSide = moveCube.get(Sides.TOP).getSchema()[1][1];
        Enum middleRowMiddleElementOfBackSide = moveCube.get(Sides.BACK).getSchema()[1][1];
        Enum middleRowMiddleElementOfBottomSide = moveCube.get(Sides.BOTTOM).getSchema()[1][1];

        temp = middleRowMiddleElementOfCurrentSide;
        moveCube.get(sides).setSchemaElement(1, 1, middleRowMiddleElementOfBottomSide);
        moveCube.get(Sides.BOTTOM).setSchemaElement(1, 1, middleRowMiddleElementOfBackSide);
        moveCube.get(Sides.BACK).setSchemaElement(1, 1, middleRowMiddleElementOfTopSide);
        moveCube.get(Sides.TOP).setSchemaElement(1, 1, temp);


        Enum topRowMiddleElementOfCurrentSide = moveCube.get(sides).getSchema()[0][1];
        Enum topRowMiddleElementOfTopSide = moveCube.get(Sides.TOP).getSchema()[0][1];
        Enum topRowMiddleElementOfBackSide = moveCube.get(Sides.BACK).getSchema()[2][1];
        Enum topRowMiddleElementOfBottomSide = moveCube.get(Sides.BOTTOM).getSchema()[0][1];

        temp = topRowMiddleElementOfCurrentSide;
        moveCube.get(sides).setSchemaElement(0, 1, topRowMiddleElementOfBottomSide);
        moveCube.get(Sides.BOTTOM).setSchemaElement(0, 1,topRowMiddleElementOfBackSide);
        moveCube.get(Sides.BACK).setSchemaElement(2, 1, topRowMiddleElementOfTopSide);
        moveCube.get(Sides.TOP).setSchemaElement(0, 1, temp);

    }

    public void rightToUp(Sides sides) {
        Enum bottomRowRightElementOfCurrentSide = moveCube.get(sides).getSchema()[2][2];
        Enum bottomRowRightElementOfTopSide = moveCube.get(Sides.TOP).getSchema()[2][2];
        Enum topRowLeftElementOfBackSide = moveCube.get(Sides.BACK).getSchema()[0][0];
        Enum bottomRowRightElementOfBottomSide = moveCube.get(Sides.BOTTOM).getSchema()[2][2];

        Enum temp = bottomRowRightElementOfCurrentSide;
        moveCube.get(sides).setSchemaElement(2, 2, bottomRowRightElementOfBottomSide);
        moveCube.get(Sides.BOTTOM).setSchemaElement(2, 2, topRowLeftElementOfBackSide);
        moveCube.get(Sides.BACK).setSchemaElement(0, 0, bottomRowRightElementOfTopSide);
        moveCube.get(Sides.TOP).setSchemaElement(2, 2, temp);

        Enum middleRowRightElementOfCurrentSide = moveCube.get(sides).getSchema()[1][2];
        Enum middleRowRightElementOfTopSide = moveCube.get(Sides.TOP).getSchema()[1][2];
        Enum middleRowLeftElementOfBackSide = moveCube.get(Sides.BACK).getSchema()[1][0];
        Enum middleRowRightElementOfBottomSide = moveCube.get(Sides.BOTTOM).getSchema()[1][2];

        temp = middleRowRightElementOfCurrentSide;
        moveCube.get(sides).setSchemaElement(1, 2, middleRowRightElementOfBottomSide);
        moveCube.get(Sides.BOTTOM).setSchemaElement(1, 2, middleRowLeftElementOfBackSide);
        moveCube.get(Sides.BACK).setSchemaElement(1, 0, middleRowRightElementOfTopSide);
        moveCube.get(Sides.TOP).setSchemaElement(1, 2, temp);


        Enum topRowRightElementOfCurrentSide = moveCube.get(sides).getSchema()[0][2];
        Enum topRowRightElementOfTopSide = moveCube.get(Sides.TOP).getSchema()[0][2];
        Enum bottomRowLeftElementOfBackSide = moveCube.get(Sides.BACK).getSchema()[2][0];
        Enum topRowRightElementOfBottomSide = moveCube.get(Sides.BOTTOM).getSchema()[0][2];

        temp = topRowRightElementOfCurrentSide;
        moveCube.get(sides).setSchemaElement(0, 2, topRowRightElementOfBottomSide);
        moveCube.get(Sides.BOTTOM).setSchemaElement(0, 2,bottomRowLeftElementOfBackSide);
        moveCube.get(Sides.BACK).setSchemaElement(2, 0, topRowRightElementOfTopSide);
        moveCube.get(Sides.TOP).setSchemaElement(0, 2, temp);

        moveCube.get(Sides.RIGHT).rotateSchemaCounterClockwise();
    }

    public void leftToDown(Sides sides) {

    }

    public void middleToDown(Sides sides) {

    }

    public void rightToDown(Sides sides) {

    }
}
