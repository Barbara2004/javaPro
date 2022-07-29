package lesson07;

import java.util.ArrayList;
import java.util.List;

//the nullPointerException has happened because the ArrayList was null because all of its objects were null. To resolve this problem
//I created a constructor and applied it to objects, besides I moved "add ball" to the method
public class Main {
    private static class Ball {
        private String sort;

        public Ball(String sort) {
            this.sort = sort;
        }

        public Ball() {
        }
    }

    private static class Board {
        private List<Ball> balls;

        public int count() {
            List<Ball> balls = new ArrayList<>();
            balls.add(new Ball("for Basketball"));
            balls.add(new Ball("for Volleyball"));
            balls.add(new Ball("for Tennis"));
            return balls.size();
        }
    }

    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.count());
    }
}

