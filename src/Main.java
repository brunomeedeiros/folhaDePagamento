import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora de trabalho:"));
        int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas no mês:"));
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento(valorHora, horasTrabalhadas);
        folhaDePagamento.imprimirFolhaDePagamento();
    }
}
