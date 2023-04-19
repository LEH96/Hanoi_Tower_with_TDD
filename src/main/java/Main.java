import java.util.Arrays;

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
    private final int FROM;
    private final int TO;
    private final int n;

    Hanoi(int n, int from, int to) {
        this.FROM = from;
        this.TO = to;
        this.n = n;
    }

    public int[][] toArray(){
        if(n == 1) return new int[][] {{1,3}};
        if(n == 2 && FROM == 1 && TO == 2 )
            return new int[][]{{1,3},{1,2},{3,2}};
        if(n == 2) return new int[][]{{1,2},{1,3},{2,3}};
        return new int[0][0];
    }
}