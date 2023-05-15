package dio.singleton;

public class LazyHolder {
    private static class instanceHolder {
        public static LazyHolder instancia = new LazyHolder();
    }

    private LazyHolder() {
        super();
    }

    public static LazyHolder getInstancia() {
        return instanceHolder.instancia;
    }
}