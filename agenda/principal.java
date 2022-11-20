

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class principal {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        ArrayList<pessoa> pessoas = new ArrayList<>();
        String nome, telefone, novoNum, novoNome;
        String salvarOutrosContatos = "";

        // tentei salvar os contatos do txt em objetos do tipo pessoa mas nao estou
        // conseguindo fazer com mais de um

        try {
            agenda.SalvarContatos("agenda.txt");
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        // juntando o arraylist do arquivo com o arraylist do programa
        pessoas = agenda.ag;

        System.out.println(pessoas);
        int menu = -1;

        while (menu != 0) {
            System.out.println("1- adicionar um numero de uma pessoa");
            System.out.println("2- consultar lista inteira");
            System.out.println("3- consultar telefone de uma pessoa");
            System.out.println("4- alterar nome ou telefone");
            System.out.println("5- excluir nome ou telefone");
            System.out.println("6- mostrar arraylist do programa(testando para achar bugs estranhos)");
            System.out.println("0- sair");

            menu = tec.nextInt();

            if (menu == 1) {
                System.out.print("Digite o nome: ");
                nome = tec.next();
                System.out.print("Digite o numero: ");
                telefone = tec.next();

                pessoa a = new pessoa(nome, telefone);
                pessoas.add(a);

                try {
                    String texto = "\n" + a.nome + "\n" + a.telefone + "\n";
                    agenda.salvar("agenda.txt", texto, true);

                } catch (Exception e) {
                    e.printStackTrace();

                }
            }
            if (menu == 2) {
                try {
                    System.out.println(agenda.carregar("agenda.txt"));

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (menu == 3) {
                String pesquisa;
                System.out.print("qual pessoa deseja consultar o numero?: ");
                pesquisa = tec.next();
                try {
                    if (agenda.pesquisar("agenda.txt", pesquisa)) {
                        //System.out.println("Encontrou");

                    } else {
                        System.out.println("Nao encontrou");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            if (menu == 4) {

                System.out.print("digite o nome da pessoa para alterar dados:");
                String nomej = tec.next();
                int p = procurarPessoa(nomej, pessoas);
                if (p != -1) {
                    System.out.println("alterando dados de: " + pessoas.get(p));

                    int menuInterno;
                    System.out.print("1- mudar nome, 2- mudar telefone:");
                    menuInterno = tec.nextInt();
                    if (menuInterno == 1) {
                        System.out.print("digite o novo nome: ");
                        novoNome = tec.next();
                        pessoas.get(p).setNome(novoNome);
                    }
                    if (menuInterno == 2) {

                        System.out.print("digite o novo numero de " + pessoas.get(p) + ": ");
                        novoNum = tec.next();
                        pessoas.get(p).setTelefone(novoNum);
                    }
                    // salvando o conteudo do arraylist e mandando para o arquivo
                    try {
                        for (int i = 0; i < pessoas.size(); i++) {

                            salvarOutrosContatos += "\n" + pessoas.get(i).getNome() + "\n"
                                    + pessoas.get(i).getTelefone() + "\n";
                        }
                        agenda.salvar("agenda.txt", salvarOutrosContatos, false);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("essa pessoa nao esta cadastrada na agenda");
                }

            }

            if (menu == 5) {
                System.out.print("digite o nome da pessoa para excluir da agenda:");
                String nomej = tec.next();
                int p = procurarPessoa(nomej, pessoas);
                if (p != -1) {
                    System.out.println(pessoas.get(p));
                    // removendo o a pessoa do arraylist, e salvando as outras
                    pessoas.remove(p);
                    try {
                        for (int i = 0; i < pessoas.size(); i++) {

                            salvarOutrosContatos += "\n" + pessoas.get(i).getNome() + "\n"
                                    + pessoas.get(i).getTelefone() + "\n";
                        }
                        agenda.salvar("agenda.txt", salvarOutrosContatos, false);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("essa pessoa nao esta cadastrada na agenda");
                }
            }
            if (menu == 6) {
                System.out.println(pessoas.toString());
            }
            
        }
        // o programa ta com um bug de nao excluir o ultimo nome e telefone, entao se o arraylist estiver vazio a agenda vai dar clear também porque um depende do outro nesse caso
        if (pessoas.size() == 0) {
            try {
                agenda.salvar("agenda.txt", "", false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static int procurarPessoa(String nome, ArrayList<pessoa> pessoas) {
        int indice = -1;
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getNome().equals(nome))
                indice = i;
        }

        return indice;
    }

}
