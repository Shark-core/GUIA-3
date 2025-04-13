import java.util.*;
class Evaluacion{
	public void pedirDatosYCalcularPromedio(){
       Scanner k = new java.util.Scanner(System.in);
        System.out.print("Ingrese la nota de la guía: ");
        double notaGuia = k.nextDouble();
        System.out.print("Ingrese la nota del control de lectura: ");
        double notaControlLectura = k.nextDouble();
        System.out.print("Ingrese la nota del parcial: ");
        double notaParcial = k.nextDouble();
        double promedio = calcularPromedio(notaGuia, notaControlLectura, notaParcial);
        System.out.println("El promedio obtenido por el estudiante es: " + promedio);
        System.out.println("El estudiante " + mostrarResultado(promedio));
        k.close();
    }
	
	public double calcularNotaGuia(double notaGuia) {
        return notaGuia * 0.30;
    }

    public double calcularNotaControlLectura(double notaControlLectura) {
        return notaControlLectura * 0.10;
    }

    public double calcularNotaParcial(double notaParcial) {
        return notaParcial * 0.60;
    }

    public double calcularPromedio(double notaGuia, double notaControlLectura, double notaParcial) {
        return calcularNotaGuia(notaGuia) + calcularNotaControlLectura(notaControlLectura) + calcularNotaParcial(notaParcial);
    }

    public String mostrarResultado(double promedio) {
        return promedio >= 6 ? "APROBO" : "REPROBO";
    }

    
}

