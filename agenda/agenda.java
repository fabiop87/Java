

import java.io.*;
import java.util.ArrayList;

public class agenda {
    public static ArrayList<pessoa> ag = new ArrayList<>();
    public static pessoa a;

    public static void salvar(String arquivo, String conteudo, boolean adicionar) throws IOException {
        FileWriter fw = new FileWriter(arquivo, adicionar);
        fw.write(conteudo);
        fw.close();
    }

    public static String carregar(String arquivo) throws FileNotFoundException, IOException {
        File arq = new File(arquivo);
        if (!arq.exists()) {
            return null;
        }
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String saida = "";
        String linha;
        while ((linha = br.readLine()) != null) {
            saida += linha + "\n";
        }
        br.close();
        return saida;
    }

    public static boolean pesquisar(String arquivo, String pesquisa) throws FileNotFoundException, IOException {
        boolean retorno = false;
        File file = new File(arquivo);
        if (!file.exists()) {
            System.out.println("arquivo nao encontrado.");
            return retorno;
        }
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String saida = "";
        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
            if (linha.equals(pesquisa)) {
                retorno = true;
                System.out.println(br.readLine());
                break;
            }
        }
        br.close();
        return retorno;
    }

    /*
     * tentando pegar as informacoes do arquivo e colocar no arraylist para carregar
     * no programa
     * esse arraylist dos contatos que ja estavam na agenda vao ser copiados para o
     * arraylist <pessoas> da classe principal,
     * e depois salvos novamente quando o programa é encerrado (provavelmente é uma gambiarra meio triste)
     */
    public static void SalvarContatos(String arquivo) throws FileNotFoundException, IOException {
        File file = new File(arquivo);
        if (!file.exists()) {
            System.out.println("arquivo nao encontrado.");
        }
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String linha2;
        String nome, num;

        while ((linha2 = br.readLine()) != null) {
            nome = br.readLine();
            num = br.readLine();
            a = new pessoa(nome, num);
            ag.add(a);
        }
        br.close();

    }

}
