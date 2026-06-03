import java.util.Scanner;

void main() {

    int cod, quant;
    double valor_final;
    Scanner sc = new Scanner(System.in);

    System.out.println("\n1    Cachorro Quente    R$ 4.00");
    System.out.println("2    X-salada           R$ 4.50");
    System.out.println("3    X-Bacon            R$ 5.00");
    System.out.println("4    Torrada Simples    R$ 2.00");
    System.out.println("5    Refrigerante       R$ 1.50\n");

    System.out.println("Escolha o codigo do lanche: ");
    cod = sc.nextInt();

    System.out.print("Insira a quantidade: ");
    quant = sc.nextInt();

    if(cod == 1){
        valor_final = (double) quant * 4.50;
    }

    else if(cod == 2){
        valor_final = (double) quant * 4.00;
    }

    else if(cod == 3){
        valor_final = (double) quant * 5.00;
    }

    else if(cod == 4){
        valor_final = (double) quant * 2.00;
    }

    else{
        valor_final = (double) quant * 1.50;
    }

    System.out.printf("\nTotal: R$ %.2f\n", valor_final);

    sc.close();

}