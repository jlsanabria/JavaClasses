package interfaces;

public class OpercionesDosImpl implements Operaciones {
    @Override
    public int suma(int a, int b) {
        int c = a + b;
        return c;
    }

    @Override
    public short resta(short a, short b) {
        return 0;
    }

    @Override
    public String invertido(String texto) {
        return "";
    }

    @Override
    public long factorial(int n) {
        // 3 * 4 = 3 + 3 + 3 + 3 = 12
        /*
        1 * 1 = 1 = 1
        1 * 2 = 1 + 1 = 2
        2 * 3 = 2 + 2 + 2 = 6
        6 * 4 = 6 + 6 + 6 + 6 = 24
         */
        int m = 1;
        for (int i = 1; i <= n; i++) {
            int c = 0, s = 0; //
            while(c < i) {
                s += m;
                c++;
            }
            m = s;
        }
        return m;
    }
}
