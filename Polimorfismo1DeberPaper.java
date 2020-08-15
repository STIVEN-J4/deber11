/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo1deberpaper;

class Motor{
    public void EncenderMotor(){
        System.out.println("Se acciona por Compresión");
    }
}
class MotorGasolina extends Motor{
    public void EncenderMotor(){
        System.out.println("Se acciona por Chispa");
    }
}
class MotorDiesel extends Motor{
    public void EndencerMotor(){
        System.out.println("Se acciona por Compresión");
    }
}
class MotorElectrico extends Motor{
    public void EncenderMotor(){
        System.out.println("Se acciona por Energia electrica");
    }
}
class MotorStirling extends Motor{
    public void EncenderMotor(){
        System.out.println("Se acciona por Vapor");
    }
}
/**
 *
 * @author STIVEN
 */
public class Polimorfismo1DeberPaper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Motor Objeto1=new MotorGasolina();
        Motor Objeto2=new MotorDiesel();
        Motor Objeto3=new MotorElectrico();
        Motor Objeto4=new MotorStirling();

        System.out.println("\n\tUniversidad de las Fuerzas Armadas ESPE EXTENSIÓN Latacunga\n"
                    + "\nCarrera: Ingenieria Automotriz\n"
                    + "\nNombre: Julio Jiménez\n"
                    + "\nDocente: Ing.LUIS GUERRA\n"
                    + "\nMateria: Programacion [7450]\n");


        System.out.println("\nEl motor a Gasolina\n");
        Objeto1.EncenderMotor();

        System.out.println("\nEl motor a Diesel\n");
        Objeto2.EncenderMotor();

        System.out.println("\nEl motor Electrico\n");
        Objeto3.EncenderMotor();

        System.out.println("\nEl motor Stirling\n");
        Objeto4.EncenderMotor();

    }

}
