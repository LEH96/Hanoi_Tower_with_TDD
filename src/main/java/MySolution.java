import java.util.ArrayList;
import java.util.List;

public class MySolution {
    public List<int[]> mvList = new ArrayList<>();
    public int[][] solution(int n) {
        int tower1 = 1;
        int tower2 = 2;
        int tower3 = 3;

        hanoiTowerMove(n, tower1, tower2, tower3);

        int[][] answer = new int[mvList.size()][2];
        for(int i=0 ; i< answer.length ; i++){
            answer[i] = mvList.get(i);
        }

        return answer;
    }

    public void hanoiTowerMove(int num, int from, int by, int to){
        if(num == 1) {
            mvList.add(new int[]{from, to});
        } else {
            hanoiTowerMove(num-1, from, to, by);
            mvList.add(new int[]{from, to});
            hanoiTowerMove(num-1, by, from, to);
        }
    }
}
