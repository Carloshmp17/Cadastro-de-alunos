package visao;

/**
 * Este form não faz parte do projeto. A sua função é apenas demonstrar
 * o conceito de herança. Um form padrão foi criado e podemos criar
 * mais forms baseados no formPadrao apenas utilizando o conceito de herança.
 * Apenas acrescentando extends FormPadrao conseguimos criar um novo form
 * com todas as características do FormPadrao.
 * @author Carlos Henrique, Luis Gabriel, Sergio Avila
 */
public class FormHerancaTeste extends FormPadrao {
    // para diferenciar os forms. O título da janela será adicionado via código
    
    public FormHerancaTeste(){
        setTitle("HERANÇA - EXEMPLO");
        
    }
}
