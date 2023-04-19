import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new MySolution().solution(3)));
    }
}

class ClassSolution {
    public int[][] solution(int n) {
        return new Hanoi(1, 3, n).toArray();
    }
}

class Hanoi {
    private final List<int[]> moves = new ArrayList<>();

    Hanoi(int n, int from, int to) {
        calculate(from, to, n);
    }

    private void calculate(int from, int to, int n) {
        int by = 6 - from - to;

        if(n == 1) { addPath(from, to); return; }

        calculate(from, by, n-1);
        calculate(from, to, 1);
        calculate(by, to, n-1);

    }

    private void addPath(int from, int to) {
        moves.add(new int[]{from, to});
    }

    public int[][] toArray(){
        //List<int[]> -> int[][]
        return moves.toArray(int[][]::new);
    }
}