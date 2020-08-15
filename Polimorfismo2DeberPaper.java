/*
Diseñe e implemente un algoritmo que le permita clacular la densidad
 */
package polimorfismo2deberpaper;

import java.util.Scanner;

class PropiedadEtanolGenerico
{
    int CalcularDensidadEtanol(int masa,int volumen)
    {
        return masa/volumen;
    }
    double ClacularDensidadEtanol(double masa, double volumen)
    {
        return masa+volumen;
    }
///////////////////////////////////////

    float CalcularVolumenEtanolMotor(float pi,float radio,float altura){

        return pi*(radio)*(radio)*altura;
    }
    double CalcularVolumenEtanolMotor(double pi,double radio,double altura){

        return pi*(radio)*(radio)*altura;
    }
////////////////////////////////7
    float CalcularTemperaturaEbullicionEtanol(float relacion_presion, float constante_gases,
            float entalpia_vapor, float temperatura_inicial){
        return 1/(((relacion_presion*constante_gases)/entalpia_vapor)-(1/temperatura_inicial));
    }
    double CalcularTemperaturaEbullicionEtanol(double relacion_presion, double constante_gases,
            double entalpia_vapor, double temperatura_inicial){
        return 1/(((relacion_presion*constante_gases)/entalpia_vapor)-(temperatura_inicial));
    }
////////////////////////////////////
    float CalcularLimiteInflamabilidadEtanol( float numero_constante,float densidad_gas,
            float inflamabilidad_gas,float densidad_etanol,float inflamalilidad_etanol){
        return numero_constante/(densidad_gas/inflamabilidad_gas)+(densidad_etanol/inflamalilidad_etanol);
    }
     double CalcularLimiteInflamabilidadEtanol( double numero_constante,double densidad_gas,
            double inflamabilidad_gas,double densidad_etanol,double inflamalilidad_etanol){
        return numero_constante/(densidad_gas/inflamabilidad_gas)+(densidad_etanol/inflamalilidad_etanol);
     }
}

/**
 *
 * @author STIVEN
 */
public class Polimorfismo2DeberPaper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PropiedadEtanolGenerico Objeto1=new PropiedadEtanolGenerico();
        PropiedadEtanolGenerico Objeto2=new PropiedadEtanolGenerico();
        PropiedadEtanolGenerico Objeto3=new PropiedadEtanolGenerico();
        PropiedadEtanolGenerico Objeto4=new PropiedadEtanolGenerico();
        PropiedadEtanolGenerico Objeto5=new PropiedadEtanolGenerico();
        PropiedadEtanolGenerico Objeto6=new PropiedadEtanolGenerico();
        PropiedadEtanolGenerico Objeto7=new PropiedadEtanolGenerico();
        PropiedadEtanolGenerico Objeto8=new PropiedadEtanolGenerico();




        System.out.println("\n\tUniversidad de las Fuerzas Armadas ESPE EXTENSIÓN Latacunga\n"
                    + "\nCarrera: Ingenieria Automotriz\n"
                    + "\nNombre: Julio Jiménez\n"
                    + "\nDocente: Ing.LUIS GUERRA\n"
                    + "\nMateria: Programacion [7450]\n");

        System.out.println("\nLA DENSIDAD DEL ETANOL\n");

        int resultado1;
        Objeto1.CalcularDensidadEtanol(460,4);
        resultado1 = Objeto1.CalcularDensidadEtanol(460,4);
        System.out.println("La densidad del Etanol es: "+resultado1+" Kg/m^3" );

        double resultado2;
        Objeto1.CalcularDensidadEtanol(460,4);
        resultado2=Objeto2.CalcularDensidadEtanol(460,4);
        System.out.println("La densidad del Etanol es: "+resultado2+" Kg/m^3");

        /////////////////////////////////////////////
        System.out.println("\nEL VOLUMEN DEL ETANOL EN UN MOTOR GASOLINA\n");
        float resultado3;
        Objeto3.CalcularVolumenEtanolMotor(3.14,2.5,5.8);
        resultado3=Objeto3.CalcularVolumenEtanolMotor(3.14f,2.5f,5.8f);
        System.out.println("El volumen del etanol en un motor gasolina: "+resultado3+" m^3" );

        double resultado4;
        Objeto4.CalcularVolumenEtanolMotor(3.14,2.5,5.8);
        resultado4=Objeto4.CalcularVolumenEtanolMotor(3.14,2.5,5.8);
        System.out.println("El volumen del etanol en un motor gasolina: "+resultado4+" m^3");
        ////////////////////////////////////////////
        System.out.println("\nEL PUNTO DE EBULLIÓN DEL ETANOL\n");
        float resultado5;
        Objeto5.CalcularTemperaturaEbullicionEtanol(2.03f,8.31f,2930.5,308.5);
        resultado5=Objeto5.CalcularTemperaturaEbullicionEtanol(2.03f,8.31f,2930.5f,308.5f);
        System.out.println("El Punto de ebullición del etanol: "+resultado5+" °K" );

        double resultado6;
        Objeto5.CalcularTemperaturaEbullicionEtanol(2.03f,8.31f,2930.5,308.5);
        resultado6=Objeto6.CalcularTemperaturaEbullicionEtanol(2.03f,8.31f,2930.5f,308.5f);
        System.out.println("El Punto de ebullición del etanol: "+resultado6+"°K" );
        ///////////////////////////////////////////////////
        System.out.println("\nEL LIMITE DE LA INFLAMABILIDAD DEL ETANOL\n");
        float resultado7;
        Objeto7.CalcularLimiteInflamabilidadEtanol(100.5,70.5,14.5,115.5,10.5);
        resultado7=Objeto7.CalcularLimiteInflamabilidadEtanol(100.5f,70.5f,14.5f,115.5f,10.5f);
        System.out.println("El Punto de ebullición del etanol: "+resultado7+"%" );

        double resultado8;
        Objeto8.CalcularLimiteInflamabilidadEtanol(100.5,70.5,14.5,115.5,10.5);
        resultado8=Objeto8.CalcularLimiteInflamabilidadEtanol(100.5,70.5,14.5,115.5,10.5);
        System.out.println("El Punto de ebullición del etanol: "+resultado8+"%" );

    }

}
