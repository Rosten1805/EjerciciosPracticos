
        public class Ejercicio3 {


            public static void main(String[] args) {

                int numero = 5;

                System.out.println("Sumamos cada número hasta llegar al " + numero);
                int temp = 0; int resultado = 0;


                while(temp <= numero) {
                    resultado += temp;
                    temp = temp++;
                }
                System.out.println("El resultado es: " + resultado);


                System.out.println("\nMostramos la cuenta atras desde: " + numero);
                int contador = numero;
                do {
                    System.out.println(contador);
                    contador--;
                } while(contador > 0);

                // Se muestra por cada número si es par o impart hasta llegar al número que hay en la variable número
                System.out.println("\nIndicamos los números que son pares e impares hasta el número " + numero);
                for (int i = ++contador; i <= numero; temp++) {
                    if(i % 2 == 0) {
                        System.out.println("El número " + i + " es par");
                    } else {
                        System.out.println("El número " + i + " es impar");
                    }
                }

            }


        }











