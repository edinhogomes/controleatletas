/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleatleta;

/**
 *
 * @author edinho
 */
public enum CategoriaJogadorVolei {

    AMADOR(0), PROFISSIONAL(1);
    private int codigo;

    CategoriaJogadorVolei(int codigo) {

        this.codigo = codigo;

    }

    public byte getIndice() {
        if (this == AMADOR) {
            return 0;
        } else {
            return 1;
        }
    }

    public char getValor() {
        if (this == AMADOR) {
            return 'A';
        } else {
            return 'P';
        }
    }

    public static CategoriaJogadorVolei retornaCategoriaPeloIndice(int indice) {

        if (indice == 0) {
            return AMADOR;
        } else {
            return PROFISSIONAL;
        }

    }
}
