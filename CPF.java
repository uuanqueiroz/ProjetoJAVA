public class CPF {
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public CPF(String numero) {
        // Validação do CPF
        this.numero = numero;
    }
}
