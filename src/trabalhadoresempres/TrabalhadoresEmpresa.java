package trabalhadoresempres;

import java.util.Scanner;

public class TrabalhadoresEmpresa {

    private Trabalhador trab[];  // vetor de objetos (da classe Trabalhador)
    private int N;    // qtde. de trabalhadores de empresa

    public static void main(String[] args) {
        new TrabalhadoresEmpresa();
    }

    public TrabalhadoresEmpresa() {
        lerDadosDosTrabalhadores();
        listarTrabalhadoresCadastrados();
        calcularMediaSalarialMulheres();
    }

    public void lerDadosDosTrabalhadores() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a qtde. de trabalhadores da empresa: ");
        N = sc.nextInt();
        trab = new Trabalhador[N];  // alocamos memória para o vetor de trabalhadores
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o nome do trabalhador " + (i + 1) + ": ");
            String nom = sc.next();
            System.out.print("Digite o sexo (F ou M) do trabalhador : ");
            String sex = sc.next();
            System.out.print("Digite o salário do trabalhador : ");
            float sal = sc.nextFloat();
            trab[i] = new Trabalhador(nom, sex.charAt(0), sal);
        }
    }

    public void listarTrabalhadoresCadastrados() {
        System.out.println("\nTrabalhadores cadastrados: \n");
        for (int i = 0; i < N; i++) {
            System.out.println(trab[i].toString());
        }
    }

    public void calcularMediaSalarialMulheres() {
        float soma = 0.0f;
        int qtdeMulheres = 0;
        for (int i = 0; i < N; i++) {
            if (trab[i].getSexo() == 'F') {
                soma += trab[i].getSalario();
                qtdeMulheres++;
            }
        }
        if (qtdeMulheres > 0) {
            float media = soma / qtdeMulheres;
            System.out.println("\nMédia dos salários das mulheres: "
                    + media + " \n");
        }
        else {
            System.out.println("\nNão temos mulheres nesta empresa. ");
        }
    }

}
