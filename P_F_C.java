import java.util.*;
public class P_F_C{
    String producto;
    double precio;
    int cantidad;
    public void capturarDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el producto: ");
        producto = scanner.nextLine();
        System.out.print("Ingrese el precio: ");
        precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad: ");
        cantidad = scanner.nextInt();
        scanner.close();
    }

    public double calcularIVA(){
        return (precio * cantidad) * 0.20;
    }

    public double calcularTotal(){
        return (precio * cantidad) + calcularIVA();
    }

   

}