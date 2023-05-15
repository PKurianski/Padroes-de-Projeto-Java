package dio.strategy.tiposComportamento;

import dio.strategy.blueprints.IComportamento;

public class ComportamentoDefensivo implements IComportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
}
