package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        // int[] n = new int[]{0, 13, 12, 1, 6, 8, 13, 5, 6, 6, 13, 0};
        int[] n = new int[]{6, 13, 1, 1, 6, 13, 9, 6};

        int r = solution(6, 13, n); 
        System.out.println(r);
    }

    static int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
            //if (nX == nY && nX > 0 && (A[i] != X || A[i] != Y))
            if (nX == nY && nX > 0)
                result = i;
        }
        return result;
    }
}
