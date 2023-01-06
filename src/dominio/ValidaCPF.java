package dominio;

import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * classe para validação de cpf
 * @author Carlos Henrique
 */
public class ValidaCPF {
    
    /**
     * método para validação de cpf
     * @param CPF
     * @return boolean
     */
    public static boolean isCPF(String CPF) {
        if (CPF.equals("00000000000")
                || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48);
            }

            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }
    
    /**
     * remove pontuacao e traços digitados no campo texto
     * @param Cru
     * @return 
     */
    public static String formataCPF(String Cru) {
        String novo;
        novo = Cru.replaceAll("\\p{Punct}", "");
        novo = novo.replace("-", "");
        return novo;
    }
    
    /**
     * comparador de número de cpf
     * @param cadastro
     * @param aluno
     * @return 
     */
    public static boolean ComparaCPF(String cadastro, ArrayList<Aluno> aluno) {
        for (Aluno aluno2 : aluno) {
            if (aluno2.getCpf().equals(cadastro)) {
                return true;
            }
        }
        return false;
    }
        
    /**
     * adiciona pontuação e traço ao cpf na escrita
     * @param CPF
     * @return 
     */
    public static String imprimeCPF(String CPF) {
        return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "."
                + CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }
}
