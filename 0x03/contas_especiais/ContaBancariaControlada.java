import exceptions.OperacaoInvalidaException;

public class ContaBancariaControlada extends ContaBancariaBasica {
    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        super.aplicarAtualizacaoMensal();
        if (super.getSaldo() < this.saldoMinimo) {
            try {
                super.sacar(valorPenalidade);
            } catch (OperacaoInvalidaException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
