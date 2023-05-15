package dio.facade;

import dio.facade.cep.CepApi;
import dio.facade.crm.CrmService;

public class Facade {
    public void mirgrarCliente(String nome, String cep) {
        String cidade = CepApi.getIsntancia().recuperarCidade(cep);
        String estado = CepApi.getIsntancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
