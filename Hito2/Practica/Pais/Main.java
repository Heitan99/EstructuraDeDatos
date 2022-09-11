package Pais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lectura=new Scanner(System.in);
        int nPais =1;
        Pais[] pais = new Pais[nPais];

        for(int i=0;i<nPais;i++){
            System.out.println("Ingresar pais "+(i+1)+": ");
            String nombrePais = lectura.nextLine();


            int nDepartamento =3;
            Departamento[] departamentos = new Departamento[nDepartamento];

            for(int j=0;j<nDepartamento;j++){

                System.out.println("Ingresar departamento "+(j+1)+": ");
                String nombreDepartamento = lectura.nextLine();


                int nProvincia=2;
                Provincia[] provincias = new Provincia[nProvincia];

                for(int k=0;k<nProvincia;k++){

                    System.out.println("Ingresar provincia "+(k+1)+": ");
                    String nombrePovincia = lectura.nextLine();

                    Provincia pr1 = new Provincia();
                    pr1.setNombre(nombrePovincia);
                    provincias[k] = pr1;

                }

                Departamento dep1 = new Departamento();
                dep1.setNombre(nombreDepartamento);
                dep1.setNroProvincias(provincias);
                departamentos[j] = dep1;

                dep1.mostrarDepartamento();
            }

            Pais pais1 = new Pais();
            pais1.setNombre(nombrePais);
            pais1.setNroDepartamentos(nDepartamento);
            pais1.setDepartamentos(departamentos);
            pais[i] = pais1;

            pais1.mostrarPais();
        }


    }
}
