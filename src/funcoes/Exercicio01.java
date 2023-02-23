package funcoes;

import javax.swing.JOptionPane;

public class WhichNumberTheHighest {
    public static int higherNumber(int x, int y, int z){
        int FinalValor;
        if (x > y && x > z){
            FinalValor = x;
            }
        else if (y > z){
            FinalValor = y;
        }
        else{
            FinalValor = z;
        }

        return FinalValor;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Write a first number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Write a second number: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Write a third number: "));

        int higher = higherNumber(a, b, c);

        JOptionPane.showMessageDialog(null, "Your entered numbers were \n" + a + "\n" + b + "\n" + c);
        JOptionPane.showMessageDialog(null, "The largest number entered is " + higher);
    }
}
