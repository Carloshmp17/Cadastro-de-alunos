package dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * classe com os métodos de manipulação dos registros
 * @author Luis Gabriel
 */
public class Funcoes {

    final static int quantMat = 10000; // N matrículas a serem geradas
    
    /**
     * metodo gerador de matriculas unicas
     * gera uma matricula unica verificando se um numero de matricula ja consta na lista
     * @param lista
     * @return mat
     */    
    public static Integer criaMat(ArrayList<Aluno> lista) {
        Random geraMat = new Random();
        Integer mat = geraMat.nextInt(quantMat); //gera uma matrícula

        HashSet<Integer> set = new HashSet<Integer>();
        //aloca todas as matrículas em um Set
        for (Iterator<Aluno> iterator = lista.iterator(); iterator.hasNext();) {
            Aluno aluno = (Aluno) iterator.next();
            set.add(aluno.getMatricula());
        }
        //Verifica se a matrícula gerada é única
        do {
            mat = geraMat.nextInt(quantMat);
        } while (!set.add(mat));

        return mat;
    }    
    
    /**
     * método que calcula a idade baseado na data de nascimento
     * @param dataNasc
     * @return idade
     */
    public static Integer atribuiIdade(Date dataNasc) {

        /*aluno a = new aluno();
		dataNasc = a.getDataNascimento();*/
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataNasc);
        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - cal.get(Calendar.YEAR);

        if (hoje.get(Calendar.MONTH) < cal.get(Calendar.MONTH)) {
            idade--;
        } else {
            if (hoje.get(Calendar.MONTH) == cal.get(Calendar.MONTH)
                    && hoje.get(Calendar.DAY_OF_MONTH) < cal.get(Calendar.DAY_OF_MONTH)) {
                idade--;
            }
        }

        return idade;
    }
    
    /**
     * c) metodo que retorna o terceiro elemento da lista
     * @param aluno
     * @return terceiro
     */
    public static Aluno terceiraRecebe(ArrayList<Aluno> aluno) {
        Aluno terceiro = new Aluno(aluno.get(2));        
        return terceiro;      
    }
   
    /**
     * d) metodo que retorna a primeira e a ultima matricula da lista
     * @param aluno
     * @return matriculas
     */
    public static Integer[] MatriculasFirstLast(ArrayList<Aluno> aluno) {
        Integer matriculas[] = new Integer[2];
        Aluno aux1 = new Aluno(aluno.get(0));
        Aluno aux2 = new Aluno(aluno.get(aluno.size() - 1));
        matriculas[0] = aux1.getMatricula();
        matriculas[1] = aux2.getMatricula();
        return matriculas;
    }
   
    /**
     * e) metodo que remove o ultimo elemento da lista
     * @param aluno 
     * 
     */
    public static void UltimaRemove(ArrayList<Aluno> aluno) {
        aluno.remove(aluno.size() - 1);
    }
        
    /**
     * f) metodo que obtem a maior e a menor idade da lista
     * @param aluno
     * @return valores
     */
    public static Integer[] Idades(ArrayList<Aluno> aluno) {
        Integer menor = (Integer) 0, maior = (Integer) 0;
        Integer valores[] = new Integer[2];
        HashSet<Integer> valores1 = new HashSet<Integer>();
        for (Aluno a : aluno) {
            valores1.add(a.getIdade());
        }
        maior = Collections.max(valores1);
        menor = Collections.min(valores1);
        valores[0] = maior;
        valores[1] = menor;
        return valores;
    }
    
    /**
     * g) metodo que verifica se um aluno consta na lista
     * @param aluno
     * @param cadastro
     * @return boolean
     */
    public static boolean ExisteAluno(ArrayList<Aluno> aluno, Aluno cadastro) {
        final ArrayList<Aluno> auxiliar = new ArrayList<Aluno>(aluno);
        final Aluno aux = new Aluno(cadastro);
        for (Aluno a : auxiliar) {
            if (a.getNome().equals(aux.getNome())) {
                if (a.getDataNascimento().equals(aux.getDataNascimento())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * h) metodo que adiciona um registro na terceira posicao da lista
     * @param aluno
     * @param cadastro 
     */
    public static void TerceiraAdiciona(ArrayList<Aluno> aluno, Aluno cadastro) {
        aluno.add(2, cadastro);
    }
}
