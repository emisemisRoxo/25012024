// declaração da classe/objeto 'doWhileComentado'.
public class doWhileComentado {
    /** declaração de método terminoFilme
     * public: porque poderá ser importado por outros objetos/classes
     * static: porque o método não poderá ser alterado ou sobrescrito
     * void porquê é um método sem retorno
     * @param int[] porque poderão ser invocados métodos do tipo String e matrizes []
     * @param finall porque poderá ser invocado o objeto args da biblioteca java.lang
     */
    public static void terminoFilme(int finall) {
        //Impressão na tela da mensagem: Seu filme terminou :(.
        System.out.println("Seu filme terminou :(");
    }//fechamento do método 'terminoFilme'.
    public static void main(String[] args) {
        //declaração de váriáveis do tipo 'int', como "tempoTotal, minutoContado e segundoContado", com cada um seu valor.
        int tempoTotal = 2;
        int minutoContado = 0;
        int segundoContado = 0;
        //Declaração da ação 'while', enquanto a variável 'minutoContado' ser menor e igual à variável 'tempoTotal'.
        while (minutoContado <= tempoTotal) {
            //Declaração da ação 'try', para que se mantenha um loop para as condições estabelecidas nessa ação.
            try {
                //Imprimir uma mensagem selecionada, imprimir a variável 'segundoContado' e ir adicionando (+1) para a respectiva variável para cada loop., até...
                System.out.println("Assistindo filme. Se passaram " + minutoContado + " minuto(s) e " + segundoContado + " segundo(s)");
                segundoContado++;
                //Declaração da ação 'if', que se o 'segundoContado' foi igual a 60.
                if (segundoContado == 60) {
                    //Adicionar (+1) cada cada loop na variável 'minutoContado'.
                    minutoContado ++;
                    //Quando tiver a virada de cada 'minutoContado', irá zerar os 'segundoContado'.
                    segundoContado = 0;
                }//fechamento da ação 'if'.
            } catch (Exception e) {
                System.out.println("Ops! Ocorreu um erro " + e);
            }
            finally {
                if (minutoContado == 1 && segundoContado==0) {
                    System.out.println("Estamos na metade do filme! Aproveite.");
                }
                else if (minutoContado==3){
                    terminoFilme(minutoContado);
                }
            }
        }
    }
}
