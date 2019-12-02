public class EightQueen {

    static boolean[] flag_a = new boolean[8]; // 각 행에 퀸을 배치했는지 체크
    static boolean[] flag_b = new boolean[15]; // 오른-왼 대각선 방향으로 퀸을 배치했는지 체크
    static boolean[] flag_c = new boolean[15]; //  왼-오른 대각선 방향으로 퀸을 배치했는지 체크

    static int[] pos = new int[8]; // 각 열의 퀸의 위치

    // 각 열의 퀸의 위치를 출력

    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }


    // i열의 알맞은 위치에 퀸을 배치

    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            if (flag_a[j] == false && //가로에 아직 배치 x
                    flag_b[i + j] == false && // 대각선에 오른/왼 배치 x
                    flag_c[i - j + 7] == false  // 대각선에 왼/ 오른에 배치 x
            ) {
                pos[i] = j; // 퀸을 j행에 배치
                if (i == 7) // 모든 열에 배치시
                    print();
                else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                }
            }
//            System.out.println("flag check");
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
