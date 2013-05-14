/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleatleta;

/**
 *
 * @author edinho
 */
public enum Sexo {

    MASCULINO(0), FEMININO(1);
    private int codigo;

    Sexo(int codigo) {
        this.codigo = codigo;
    }

    public byte getIndice() {
        if (this == MASCULINO) {
            return 0;
        } else {
            return 1;
        }
    }

    public char getValor() {
        if (this == MASCULINO) {
            return 'M';
        } else {
            return 'F';
        }
    }

    public static Sexo retornaSexoPeloIndice(int indice) {

        if (indice == 0) {
            return MASCULINO;
        } else {
            return FEMININO;
        }
    }
}
