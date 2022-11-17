/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoque;

import controledeestoque.view.PrincipalView;

/**
 *
 * @author Aluno
 */
public class ControledeEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrincipalView principalView = new PrincipalView();
        principalView.validate();
        principalView.pack();
        principalView.setVisible(true);
    }
}
