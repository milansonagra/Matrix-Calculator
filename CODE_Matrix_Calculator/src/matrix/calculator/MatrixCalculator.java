package matrix.calculator;

/**
 *
 * @author Milan Sonagra
 */
public class MatrixCalculator {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        /*      Welcome Page        */
        WelcomePage Welcome = new WelcomePage();

        java.awt.EventQueue.invokeLater(() -> {
            Welcome.setVisible(true);
        });

        /*      Time of 2 second    */
        Thread.sleep(3000);
        Welcome.dispose();

        /*       Main Window     */
        java.awt.EventQueue.invokeLater(() -> {
            new MatrixCalculatorDesign().setVisible(true);
        });
    }
}
