
package guiabasicajava;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author Victor Sanchez
 */
public class GuiaBasicaJava
{
    
    public static void main(String[] args) 
    {
        //ej1();
        //ej2();
        //ej3();
        //ej4();
        //ej5();
        //ej6();
        //ej7();
        //ej8();
        //ej9();
        //ej10();
        //ej11();
        //ej12();
        //ej13();
        ej14();
//        int ejercicio = 0;
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Elija una opcion: ");
//        ejercicio = teclado.next(); 
//        switch(ejercicio)
//        {
//            case 1: ej1();
//            case 2: ej2();
//            case 3: ej3();
//            case 4: ej4();
//            case 5: ej5();
//            case 6: ej6();
//            case 7: ej7();
//            case 8: ej8();
//            case 9: ej9();
//            case 10: ej10();
//            case 11: ej11();
//            case 12: ej12();
//            case 13: ej13();
//            case 14: ej14();
//            case 15: ej15();
//            case 16: ej16();
//            case 17: ej17();
//            case 18: ej18();  
//        }
  }

//1) Tipos de datos – Visualización del contenido
//   a. Escribir un código que inicialice 3 variables texto, entero y boolean. 
//   Para cada una de las variables visualizar en pantalla el valor de las 
//   variables.
    
    private static void ej1() 
    {
        String texto = "casa";
        int entero = 1;
        boolean boole = true;
        System.out.print("Texto: " + texto + "\nEntero: " + entero
                            +"\nBoolean: " + boole);   
    }

//2) Escribir un programa que:
//   a. Inicialice las siguientes variables:
//      i. ENTERO a = 100;
//      ii. DECIMAL b = 2.3;
//   b. Declare las siguientes variables:
//      i. ENTERO exp1;
//      ii. DECIMAL exp2;
//   c. Realice las siguientes asignaciones:
//      i. exp1 = a / b;
//      ii. exp2 = a / b;
//   d. ¿Qué errores se producen? ¿Cómo se pueden salvar?
    
    private static void ej2() 
    {
        //a.
        int a = 100;
        double b = 2.3;
        
        //b
        int exp1;
        double exp2;
        
        //c.
        //exp1 = a / b; Error: tipos de datos incompatibles (entero y decimal)
        exp1 = (int) Math.round(a / b);
        exp2 = a / b;
        System.out.print("a: "+a+"\nb: "+b+"\nexp1: "+exp1+"\nexp2: "+exp2);
    }

//3) Instrucciones de asignación (entender los cambios en las posiciones
//   de memoria)
//   a. Escribir un programa que: - Declare e inicialice 3 variables enteras
//      a, b, c con los siguientes valores: a=10; b=-8; c = 36
//      i. Visualice el contenido de las tres variables
//      ii. Realice las siguientes operaciones de asignación: a=b; b=c; c = a;
//      iii. Visualice nuevamente el contenido de las tres variables.
//   b. Ejecute el programa
//   c. Explique los cambios en los valores de las variables.
    
    private static void ej3() 
    {
     //a.
        int a = 10, b = -8, c = 36;
        
        //i.
        System.out.print("a: "+a+"\nb: "+b+"\nc: "+c+"\n");
        
        //ii.
        a = b; b = c; c = a;
        System.out.print("a: "+a+"\nb: "+b+"\nc: "+c+"\n");
     //c.
     // Se pierde el valor inicial de la variable a 
    }

//  4) Declara 2 variables numéricas (con el valor que desees), he indica cual
//     es mayor de los dos. Si son iguales indicarlo también. Cambiar los 
//     valores para comprobar que funciona.
    
    private static void ej4() 
    {
        int num1 = 5, num2 = 10;
        if(num1 != num2)
        {
            if(num1 > num2)
            {
                System.out.print("num1 ("+num1+") es mayor que num2 ("+num2+")");
            }
            else 
            {
                System.out.print("num2 ("+num2+") es mayor que num1 ("+num1+")");
            }
        }
        else
        {
            System.out.print("num1 ("+num1+") y num2 ("+num2+") son iguales.");
        }
    }

//  5) Declara un String que contenga tu nombre, después muestra un mensaje de
//     bienvenida por consola. Por ejemplo: si introduzco “Fernando”, me 
//     aparezca “Bienvenido Fernando”.
    
    private static void ej5() 
    {
        String nombre = "Victor";
        System.out.print("Bienvenido " + nombre + "\n");
    }

//  6) Modifica la aplicación anterior, para que nos pida el nombre que queremos
//     introducir por teclado.    
    
    private static void ej6() 
    {
        String nombre;
        Scanner teclado = new Scanner(System.in);
        nombre = teclado.nextLine();
        System.out.print("Bienvenido " + nombre + "\n");
    }

//  7) Haz una aplicación que calcule el área de un círculo (pi*R2). 
//     El radio se pedirá por teclado.
    
    private static void ej7() 
    {
        
        double radio, areaCirculo;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        radio = teclado.nextDouble();
        areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.print("el área es: "+areaCirculo+"\n");
    }

//  8) Lee un número por teclado e indica si es divisible entre 2. Si no lo es,
//     también debemos indicarlo.
    
    private static void ej8() 
    {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        numero = teclado.nextInt();
        if((numero%2)==0)
        {
            System.out.print("El número "+numero+" es divisible por 2");
        }
        else
        {
            System.out.print("El número "+numero+" no es divisible por 2");
        }
    }
    
//  9) Lee un número por teclado y muestra por consola, el carácter al que 
//     pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me
//     muestre una a.

    private static void ej9() 
    {
        int numero;
        char ascii;
        boolean flag = true;
        Scanner teclado = new Scanner(System.in);
        do
        {
            System.out.print("Ingrese un número entre 32 y 126: ");
            numero = teclado.nextInt();
            if(numero > 32 && numero < 126)
            {
                ascii = (char)numero;
                System.out.print("el carácter ASCII de "+numero+" es: "
                                +ascii+"\n");
                flag = true;
            }
            else{flag = false;}
            
        } while(flag == false);
    }

//  10) Modifica el ejercicio anterior, para que en lugar de pedir un número,
//      pida un carácter (char) y muestre su código en la tabla ASCII.
    
    private static void ej10() 
    {
        char caracter;
        int ascii;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un carácter: ");
        caracter = teclado.next().charAt(0);
        ascii = (int)caracter;
        System.out.print("el Código ASCII de "+caracter+" es: "+ascii+"\n");
    }
    
//  11) Lee un número por teclado que pida el precio de un producto y calcule el
//      precio final con IVA. El IVA sera una constante que sera del 21%.
    
    private static void ej11() 
    {
        double precio, precioConIVA;
        final double IVA = 1.21;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un precio: ");
        precio = teclado.nextDouble();
        precioConIVA = precio*IVA;
        System.out.print("El precio final con IVA es: "+precioConIVA);
    }

//  12) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.    
    
    private static void ej12() 
    {
        int i=1;
        while(i<=100)
        {
            System.out.print(i+" ");
            i++;
        }
        System.out.print("\n");
    }
    
//  13) Haz el mismo ejercicio anterior con un bucle for.
    
    private static void ej13() 
    {
        for(int i = 1; i <= 100; i++)
        {
            System.out.print(i+" ");
        }
        System.out.print("\n");
    }
    
//  14) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre
//      2 y 3. Utiliza el bucle que desees.    
    private static void ej14() 
    {
        for(int i = 1; i <= 100; i++)
        {
            if (i % 2 == 0 || i % 3 == 0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.print("\n");
    }
    
//  15) Realiza una aplicación que nos pida un número de ventas a introducir,
//      después nos pedirá tantas ventas por teclado como número de ventas se
//      hayan indicado. Al final mostrara la suma de todas las ventas.
    
}

