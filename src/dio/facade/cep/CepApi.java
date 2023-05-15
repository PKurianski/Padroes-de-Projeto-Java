package dio.facade.cep;

public class CepApi {
    private static CepApi isntancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getIsntancia() {
        return isntancia;
    }

    public String recuperarCidade(String cep){
        return "São Paulo";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }
}
