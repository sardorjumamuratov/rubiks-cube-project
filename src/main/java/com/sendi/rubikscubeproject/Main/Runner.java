package com.sendi.rubikscubeproject.Main;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        CubeSide cubeSideFrontRed = new CubeSide(new Enum[][]{
                {Colors.RED, Colors.RED, Colors.RED},
                {Colors.RED, Colors.RED, Colors.RED},
                {Colors.RED, Colors.RED, Colors.RED}},
                "RED");

        CubeSide cubeSideBackOrange = new CubeSide(new Enum[][]{
                {Colors.ORANGE, Colors.ORANGE, Colors.ORANGE},
                {Colors.ORANGE, Colors.ORANGE, Colors.ORANGE},
                {Colors.ORANGE, Colors.ORANGE, Colors.ORANGE}},
                "ORANGE");

        CubeSide cubeSideLeftWhite = new CubeSide(new Enum[][]{
                {Colors.WHITE, Colors.WHITE, Colors.WHITE},
                {Colors.WHITE, Colors.WHITE, Colors.WHITE},
                {Colors.WHITE, Colors.WHITE, Colors.WHITE}},
                "WHITE");

        CubeSide cubeSideRightYellow = new CubeSide(new Enum[][]{
                {Colors.YELLOW, Colors.YELLOW, Colors.YELLOW},
                {Colors.YELLOW, Colors.YELLOW, Colors.YELLOW},
                {Colors.YELLOW, Colors.YELLOW, Colors.YELLOW}},
                "YELLOW");

        CubeSide cubeSideTopBlue = new CubeSide(new Enum[][]{
                {Colors.BLUE, Colors.BLUE, Colors.BLUE},
                {Colors.BLUE, Colors.BLUE, Colors.BLUE},
                {Colors.BLUE, Colors.BLUE, Colors.BLUE}},
                "BLUE");

        CubeSide cubeSideBottomGreen = new CubeSide(new Enum[][]{
                {Colors.GREEN, Colors.GREEN, Colors.GREEN},
                {Colors.GREEN, Colors.GREEN, Colors.GREEN},
                {Colors.GREEN, Colors.GREEN, Colors.GREEN}},
                "GREEN");


        Map<Enum, CubeSide> cube = new HashMap<>();
        cube.put(Sides.FRONT, cubeSideFrontRed);
        cube.put(Sides.BACK, cubeSideBackOrange);
        cube.put(Sides.LEFT, cubeSideLeftWhite);
        cube.put(Sides.RIGHT, cubeSideRightYellow);
        cube.put(Sides.TOP, cubeSideTopBlue);
        cube.put(Sides.BOTTOM, cubeSideBottomGreen);

        Move move = new Move(cube);

//        move.leftToDown(Sides.FRONT);
//        System.out.println("After leftToDown");
//        System.out.println(Arrays.deepToString(cube.get(Sides.FRONT).getSchema()));
//        System.out.println(Arrays.deepToString(cube.get(Sides.BACK).getSchema()));
//
//        move.middleToRight(Sides.FRONT);
//        System.out.println("########### after middleToRight");
//        System.out.println(Arrays.deepToString(cube.get(Sides.FRONT).getSchema()));
//        System.out.println(Arrays.deepToString(cube.get(Sides.BACK).getSchema()));
//
//        move.leftToUp(Sides.FRONT);
//        System.out.println("###########");
//        System.out.println(Arrays.deepToString(cube.get(Sides.FRONT).getSchema()));
//        System.out.println(Arrays.deepToString(cube.get(Sides.BACK).getSchema()));
//
//        move.topToleft(Sides.FRONT);
//        move.bottomToRight(Sides.FRONT);
//        move.rightToUp(Sides.FRONT);
//        move.rightToUp(Sides.FRONT);
//        move.rightToUp(Sides.FRONT);
//        move.middleToLeft(Sides.FRONT);
//        System.out.println("###########");
//        System.out.println(Arrays.deepToString(cube.get(Sides.FRONT).getSchema()));
//        System.out.println(Arrays.deepToString(cube.get(Sides.BACK).getSchema()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to solve the rubik's cube.");
        System.out.println("Press the number to command");
        System.out.println("P >> Play");

        System.out.println("Q >> Quit");
        String inGame = scanner.nextLine();

        if (inGame.equalsIgnoreCase("P")) {
            while (!inGame.equalsIgnoreCase("q")) {
                Sides currentSide = Sides.FRONT;
                System.out.println("#####################");
                System.out.println("1. To Rotate the Side");
                System.out.println("20. To Rotate the Row");
                inGame = scanner.nextLine();
                switch (Integer.parseInt(inGame)) {
                    case 1:
                        System.out.println("Here are the intsturctions:");
                        System.out.println("2. Front Side");
                        System.out.println("3. Back Side");
                        System.out.println("4. Left Side");
                        System.out.println("5. Right Side");
                        System.out.println("6. Top Side");
                        System.out.println("7. Bottom Side");
                        break;
                    case 2:
                        currentSide = Sides.FRONT;
                        for (int i = 0; i < cube.get(Sides.FRONT).getSchema().length; i++) {
                            for (int j = 0; j < cube.get(Sides.FRONT).getSchema()[i].length; j++) {
                                System.out.print(cube.get(Sides.FRONT).getSchema()[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        currentSide = Sides.BACK;
                        for (int i = 0; i < cube.get(Sides.BACK).getSchema().length; i++) {
                            for (int j = 0; j < cube.get(Sides.BACK).getSchema()[i].length; j++) {
                                System.out.print(cube.get(Sides.BACK).getSchema()[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case 4:
                        currentSide = Sides.LEFT;
                        for (int i = 0; i < cube.get(Sides.LEFT).getSchema().length; i++) {
                            for (int j = 0; j < cube.get(Sides.LEFT).getSchema()[i].length; j++) {
                                System.out.print(cube.get(Sides.LEFT).getSchema()[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case 5:
                        currentSide = Sides.RIGHT;
                        for (int i = 0; i < cube.get(Sides.RIGHT).getSchema().length; i++) {
                            for (int j = 0; j < cube.get(Sides.RIGHT).getSchema()[i].length; j++) {
                                System.out.print(cube.get(Sides.RIGHT).getSchema()[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case 6:
                        currentSide = Sides.TOP;
                        for (int i = 0; i < cube.get(Sides.TOP).getSchema().length; i++) {
                            for (int j = 0; j < cube.get(Sides.TOP).getSchema()[i].length; j++) {
                                System.out.print(cube.get(Sides.TOP).getSchema()[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case 7:
                        currentSide = Sides.BOTTOM;
                        for (int i = 0; i < cube.get(Sides.BOTTOM).getSchema().length; i++) {
                            for (int j = 0; j < cube.get(Sides.BOTTOM).getSchema()[i].length; j++) {
                                System.out.print(cube.get(Sides.BOTTOM).getSchema()[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case 8:
                        move.topToRight(currentSide);
                        break;
                    case 9:
                        move.topToleft(currentSide);
                        break;
                    case 10:
                        move.middleToRight(currentSide);
                        break;
                    case 11:
                        move.middleToLeft(currentSide);
                        break;
                    case 12:
                        move.bottomToRight(currentSide);
                        break;
                    case 13:
                        move.bottomToLeft(currentSide);
                        break;
                    case 14:
                        move.leftToUp(currentSide);
                        break;
                    case 15:
                        move.leftToDown(currentSide);
                        break;
                    case 16:
                        move.middleToUp(currentSide);
                        break;
                    case 17:
                        move.middleToDown(currentSide);
                        break;
                    case 18:
                        move.rightToUp(currentSide);
                        break;
                    case 19:
                        move.rightToDown(currentSide);
                        break;
                    case 20:
                        System.out.println("8. topToRight");
                        System.out.println("9. topToLeft");
                        System.out.println("10. middleToRight");
                        System.out.println("11. middleToLeft");
                        System.out.println("12. bottomToRight");
                        System.out.println("13. bottomToLeft");
                        System.out.println("14. leftToUp");
                        System.out.println("15. leftToDown");
                        System.out.println("16. middleToUp");
                        System.out.println("17. middleToDown");
                        System.out.println("18. rightToUp");
                        System.out.println("19. rightToDown");
                        break;
                    case 25:
                        inGame = "q";
                        break;
                }
            }
            System.out.println("#####################");
        } else {
            System.out.println("You just quit the game!");
        }

    }
}
