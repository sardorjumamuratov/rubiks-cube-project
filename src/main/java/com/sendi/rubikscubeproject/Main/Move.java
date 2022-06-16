package com.sendi.rubikscubeproject.Main;

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
    public void leftToUp() {

    }
    public void middleToUp(Sides sides) {



    }

    public void rightToUp() {

    }
}
