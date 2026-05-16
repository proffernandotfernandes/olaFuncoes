public class App {
    public static void main(String[] args) throws Exception {
        float comissao = Utils.calcularPercentual(100.00f, 20.00f);
        System.out.println(comissao);

        float novoValor = Utils.calcularAcrescimo(100.00f, 10.00f);
        System.out.println(novoValor);

        float valorComDesconto = Utils.calcularDesconto(1000.00f, 15.00f);
        System.out.println(valorComDesconto);

    }
}
