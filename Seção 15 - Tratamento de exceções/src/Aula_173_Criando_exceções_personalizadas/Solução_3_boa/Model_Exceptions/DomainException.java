package Aula_173_Criando_exceções_personalizadas.Solução_3_boa.Model_Exceptions;

public class DomainException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }

}
