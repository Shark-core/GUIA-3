class FactIv{
public static void main(String[] args) {
        P_F_C  J = new P_F_C();
        J.capturarDatos();
        System.out.println("IVA: " + J.calcularIVA());
        System.out.println("Total: " + J.calcularTotal());
    }
}