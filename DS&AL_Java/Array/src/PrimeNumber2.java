public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;

        for (int n = 3; n <= 1000; n += 2) { // 대상은 홀수만
            int i;
            for (i = 1; i < ptr; i++) { // 이미 찾은 소수로 나누어 봄
                counter++;
                if (n % prime[i] == 0) // 나누어 떨어지면 소수가 아님
                    break;
            }
            if (ptr == i)           // 마지막까지 나누어 떨어지지 않음
                prime[ptr++] = n;   // 소수라고 배열에 저장
        }
        for (int i = 0; i < ptr; i++)
            System.out.println(prime[i]);

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
