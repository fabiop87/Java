public class disciplina {

    private int codigoDisc;
    private String nomeDisc;
    public professor professor;

    public disciplina(int codigoDisc, String nomeDisc, professor professor) {
        this.codigoDisc = codigoDisc;
        this.nomeDisc = nomeDisc;
        this.professor = professor;
    }

    public int getCodigoDisc() {
        return codigoDisc;
    }

    public void setCodigoDisc(int codigoDisc) {
        this.codigoDisc = codigoDisc;
    }

    public String getNomeDisc() {
        return nomeDisc;
    }

    public void setNomeDisc(String nomeDisc) {
        this.nomeDisc = nomeDisc;
    }

    public professor getProfessor() {
        return professor;
    }

    public void setProfessor(professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "disciplina [codigoDisc=" + codigoDisc + ", nomeDisciplina=" + nomeDisc + ", professor=" + professor
                + "],";
    }

}
