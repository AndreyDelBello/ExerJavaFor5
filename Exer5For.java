/*Escreva um programa que, dada uma variável x com algum valor inteiro, temos um
novo x de acordo com a seguinte regra:
se x é par, x = x / 2
se x é impar, x = 3 * x + 1
imprime x */

public class Exer5For {

    public static void main(String args[]){
    int x = 19;
    if(x%2==0){
        x = x / 2;
        System.out.println("Valor de x é: "+ x);
    }
    else{
        x = 3 * x + 1;
        System.out.println("Se não o valor de X é: "+ x);
    }
    }
}