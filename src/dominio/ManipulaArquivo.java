package dominio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 2) manipulacao de arquivo txt, criação, inserção e exclusão de registros
 * cria um arquixo txt com a formatação pedida no projeto
 * @author Luis Gabriel, Carlos Henrique
 */
public class ManipulaArquivo {
    static String path = "ListagemAlunos.txt";
    static SimpleDateFormat convert = new SimpleDateFormat("dd/MM/yyyy");

    public static ArrayList<Aluno> LeArquivo() throws IOException, ParseException {
        
        /**
         * cria a array list
         * @return lista
         */
        ArrayList<Aluno> lista = new ArrayList(); //cria uma lista vazia
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));

        String line = br.readLine();
        line = br.readLine();

        SimpleDateFormat convert = new SimpleDateFormat("dd/MM/yyyy");
        while (line != null) {

            String[] vect = line.split(",");
            Integer matricula = Integer.parseInt(vect[0]);
            String nome = vect[1];

            Date data = convert.parse(vect[3]);
            vect[3] = convert.format(data);
            data = convert.parse(vect[3]);

            Integer idade = Funcoes.atribuiIdade(data);
            String tele = vect[4];
            String cpf = vect[5];

            Aluno alun = new Aluno(matricula, nome, idade, data, tele, cpf);
            lista.add(alun);

            line = br.readLine();
        }
        //Remover o for abaixo, apenas para testes.
        /*System.out.println("Alunos: ");
        for (Aluno a : lista) {
            System.out.println(a);
        }*/
        br.close();
        return lista;
    }
    
    /**
     * escreve os registro em um arquivo txt
     * @param lista
     * @throws IOException 
     */
    public static void EscreveArquivo(ArrayList<Aluno> lista) throws IOException {

        File nArq = new File(path);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
        PrintWriter pw = new PrintWriter(bw);
        if (nArq.createNewFile()) {
            pw.println("matricula,nome,idade,dataNascimento,telefone,CPF");
            for (Aluno a : lista) {
                pw.println(a.toArchive());
            }
            pw.close();
        } else {
            pw.println("matricula,nome,idade,dataNascimento,telefone,CPF");
            for (Aluno a : lista) {
                pw.println(a.toArchive());
            }
            pw.close();
        }
    }

}
