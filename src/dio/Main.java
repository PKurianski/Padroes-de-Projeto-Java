package dio;

import dio.facade.Facade;
import dio.singleton.Eager;
import dio.singleton.Lazy;
import dio.singleton.LazyHolder;
import dio.strategy.blueprints.IComportamento;
import dio.strategy.executor.Robo;
import dio.strategy.tiposComportamento.ComportamentoAgressivo;
import dio.strategy.tiposComportamento.ComportamentoDefensivo;
import dio.strategy.tiposComportamento.ComportamentoNormal;

public class Main {
    public static void main(String[] args) {

        // Singleton
        Lazy lazy = Lazy.getInstancia();
        System.out.println(lazy);
        lazy = Lazy.getInstancia();
        System.out.println(lazy);

        Eager eager = Eager.getInstancia();
        System.out.println(eager);
        eager = Eager.getInstancia();
        System.out.println(eager);

        LazyHolder lazyHolder = LazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = LazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy
        IComportamento normal = new ComportamentoNormal();
        IComportamento defensivo = new ComportamentoDefensivo();
        IComportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        // Facade
        Facade facade = new Facade();
        facade.mirgrarCliente("PKuri","16584236");
    }
}