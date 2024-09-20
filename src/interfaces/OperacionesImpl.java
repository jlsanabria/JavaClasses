package interfaces;

public class OperacionesImpl implements Operaciones {
    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public short resta(short a, short b) {
        return (short) (a - b);
    }

    @Override
    public String invertido(String texto) {
        // texto --> "Hi Java Programmer"
        String textoInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }
        return textoInvertido;
    }

    @Override
    public long factorial(int n) {
        int m = 1;
        for (int i = 1; i <= n; i++) {
            m *= i; // m = m * i
        }
        return m;
    }
}
