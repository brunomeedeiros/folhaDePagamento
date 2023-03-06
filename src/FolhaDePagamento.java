import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class FolhaDePagamento {

    private double valorHora;
    private int horasTrabalhadas;
    private double salarioBruto;
    private double ir;
    private double sindicato;
    private double fgts;
    private double descontos;
    private double salarioLiquido;

    public FolhaDePagamento(double valorHora, int horasTrabalhadas) {
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        calcularFolhaDePagamento();
    }

    private void calcularFolhaDePagamento() {
        salarioBruto = valorHora * horasTrabalhadas;
        fgts = salarioBruto * 0.11;
        sindicato = salarioBruto * 0.03;

        if (salarioBruto <= 900) {
            ir = 0;
        } else if (salarioBruto <= 1500) {
            ir = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            ir = salarioBruto * 0.1;
        } else {
            ir = salarioBruto * 0.2;
        }

        descontos = ir + sindicato;
        salarioLiquido = salarioBruto - descontos;
    }

    public void imprimirFolhaDePagamento() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String mensagem = "Salário Bruto: R$ " + df.format(salarioBruto)
                + "\nDesconto do IR: R$ " + df.format(ir)
                + "\nDesconto do Sindicato: R$ " + df.format(sindicato)
                + "\nFGTS: R$ " + df.format(fgts)
                + "\nTotal de descontos: R$ " + df.format(descontos)
                + "\nSalário Líquido: R$ " + df.format(salarioLiquido);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
