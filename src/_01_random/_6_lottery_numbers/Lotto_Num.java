package _01_random._6_lottery_numbers;

import javax.swing.JOptionPane;

public class Lotto_Num {
public static void main(String[] args) {
int lotto = new Random().nextint(100);
JOptionPane.showInputDialog(lotto);
JOptionPane.showInputDialog(lotto++);
JOptionPane.showInputDialog(lotto+36);
JOptionPane.showInputDialog(lotto--);
JOptionPane.showInputDialog(lotto+4);
JOptionPane.showInputDialog(lotto+999999);
}
}
