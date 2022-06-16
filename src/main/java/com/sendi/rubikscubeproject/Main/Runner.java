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
        move.leftToUp(Sides.FRONT);
//
        System.out.println(Arrays.deepToString(cube.get(Sides.FRONT).getSchema()));
        System.out.println(Arrays.deepToString(cube.get(Sides.BACK).getSchema()));
//        move.leftToUp(Sides.FRONT);
//
//        System.out.println(Arrays.deepToString(cube.get(Sides.BACK).getSchema()));
        System.out.println("###########");
        move.middleToLeft(Sides.FRONT);
        System.out.println(Arrays.deepToString(cube.get(Sides.FRONT).getSchema()));
        System.out.println(Arrays.deepToString(cube.get(Sides.BACK).getSchema()));
        System.out.println(Arrays.deepToString(cube.get(Sides.RIGHT).getSchema()));


        Scanner scanner = new Scanner(System.in);
        String inGame = scanner.nextLine();
        while (inGame != "q") {

            System.out.println("Welcome to solve the rubik's cube.");
            System.out.println("1. Play");
            System.out.println("2. Quit");
            inGame = scanner.nextLine();
            switch (Integer.parseInt(inGame)) {
                case 1:
                    System.out.println("Here are the intsturctions:");
                    System.out.println("To move the ");
//                    solveTheCube();
                    break;
                case 2:
                    inGame = "q";
                    break;
            }
        }


    }
}
