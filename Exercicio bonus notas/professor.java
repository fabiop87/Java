public class professor extends pessoa {
    private int codigoProfessor;
    private String titulacao;

    public professor(String nome, int codigoProfessor, String titulacao) {
        super(nome);
        this.codigoProfessor = codigoProfessor;
        this.titulacao = titulacao;
    }

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        if (codigoProfessor > 0) {
            this.codigoProfessor = codigoProfessor;
        }
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return super.toString() + "[codigoProfessor=" + codigoProfessor + ", titulacao=" + titulacao + "]";
    }

}