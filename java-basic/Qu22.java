public class Qu22{
    public static void main(String[] args){
        int[][] score=new int[2][3];
        score[0][0]=70;
        score[0][1]=80;
        score[0][2]=100;
        score[1][0]=50;
        score[1][1]=60;
        score[1][2]=80;
        for(int i=0;i<score.length;i++){
            for(int j=0;j<score[i].length;j++){
                System.out.println(score[i][j]);
            }
        }
    }
}
/*
0 10
1 40
2 30
3 90
4 50
*/