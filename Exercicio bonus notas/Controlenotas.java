

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controlenotas {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        professor alex = new professor("alex", 1, "naosei");
        professor jonas = new professor("jonas", 2, "naosei");
        professor pedro = new professor("pedro", 3, "doutor");
        professor johanny = new professor("johanny", 4, "dba");

        disciplina poo = new disciplina(1, "poo", alex);
        disciplina estDados = new disciplina(2, "estruturas de dados", jonas);
        disciplina engSoftware = new disciplina(3, "engenharia de software", pedro);
        disciplina bancoDados = new disciplina(4, "banco de dados", johanny);

        aluno fabio = new aluno("fabio", 12, "ads", poo, estDados, engSoftware, bancoDados);
        aluno marcos = new aluno("marcos", 13, "ads", poo, estDados, engSoftware, bancoDados);
        aluno jorge = new aluno("jorge", 14, "ads", poo, estDados, engSoftware, bancoDados);

        controle cFabio = new controle(fabio, 0, 0, 0, 0, 0);
        controle cMarcos = new controle(marcos, 0, 0, 0, 0, 0);
        controle cJorge = new controle(jorge, 0, 0, 0, 0, 0);

        System.out.print("aa:");
        tec.nextLine();

        aluno alunoAtual = new aluno(null, 0, null, poo, estDados, engSoftware, bancoDados);
        try {

            while (true) {

                System.out.println("código do aluno:\n12- fabio\n13- marcos\n14-jorge\n10- mostrar notas de todos os alunos\n6- sair");
                System.out.print("digite o codigo do aluno: ");
                int a = tec.nextInt();
                switch (a) {
                    case 10:
                        System.out.println(cFabio.toString());
                        System.out.println(cMarcos.toString());
                        System.out.println(cJorge.toString());
                        continue;
                    case 12:
                        alunoAtual = fabio;
                        break;
                    case 13:
                        alunoAtual = jorge;
                        break;
                    case 14:
                        alunoAtual = marcos;
                        break;
                    case 6:
                        break;
                    default:
                        break;
                }
                if (a == 6) {
                    break;
                }

                controle controleAluno = new controle(alunoAtual, 0, 0, 0, 0, 0);

                System.out.println(
                        "disciplinas:1- POO\n2- estruturas de dados\n3- engenharia de software\n4- banco de dados \ndigite o código da disciplina: ");
                int cdisc = tec.nextInt();
                controleAluno.setCodigoDisc(cdisc);

                System.out.println(alunoAtual);
                controleAluno.setCodigoAluno(a);
                System.out.println("codigoaluno   " + controleAluno.getCodigoAluno());
                while (true) {
                    System.out.print(
                            "1- alterar P1\n2- alterar P2\n3- alterar AI1\n4- alterar AI2\n5- exibir as notas e média\n6- sair :");
                    int menu = tec.nextInt();
                    switch (menu) {
                        case 1:
                            System.out.print("digite a nota da p1: ");
                            float notap1 = tec.nextFloat();
                            controleAluno.setP1(notap1);
                            break;
                        case 2:
                            System.out.print("digite a nota da ai1: ");
                            float notaai1 = tec.nextFloat();
                            controleAluno.setAI1(notaai1);
                            break;
                        case 3:
                            System.out.print("digite a nota da p2: ");
                            float notap2 = tec.nextFloat();
                            controleAluno.setAI1(notap2);
                            break;
                        case 4:
                            System.out.print("digite a nota da ai2: ");
                            float notaai2 = tec.nextFloat();
                            controleAluno.setAI1(notaai2);
                            break;
                        case 5:
                            // System.out.println(controleAluno);
                            if (controleAluno.getCodigoAluno() == 12) {
                                cFabio = controleAluno;
                                System.out.println(cFabio.toString());
                            }
                            if (controleAluno.getCodigoAluno() == 13) {
                                cJorge = controleAluno;
                                System.out.println(cJorge.toString());
                            }
                            if (controleAluno.getCodigoAluno() == 14) {
                                cMarcos = controleAluno;
                                System.out.println(cMarcos.toString());
                            }
                            break;
                        case 6:
                            break;
                    }

                    if (menu == 6) {
                        break;
                    }
                }

            }
            System.out.println("");

        } catch (InputMismatchException e) {
            System.out.println("digite apenas valores especificados no programa");
        }
    }

}