package dio.strategy.executor;

import dio.strategy.blueprints.IComportamento;

public class Robo {
    private IComportamento comportamento;

    public void setComportamento(IComportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
