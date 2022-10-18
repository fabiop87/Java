public class aluno extends pessoa {

    private int codigoAluno;
    private String curso;
    disciplina poo;
    disciplina estDados;
    disciplina engSoftware;
    disciplina bancoDados;


    // public aluno(String nome, int codigoAluno, String curso) {
    //     super(nome);
    //     this.codigoAluno = codigoAluno;
    //     this.curso = curso;
        
    // }
    
    public aluno(String nome, int codigoAluno, String curso, disciplina poo, disciplina estDados,
    disciplina engSoftware, disciplina bancoDados) {
        super(nome);
        this.codigoAluno = codigoAluno;
        this.curso = curso;
        this.poo = poo;
        this.estDados = estDados;
        this.engSoftware = engSoftware;
        this.bancoDados = bancoDados;
    }
    
    
        public disciplina getPoo() {
        return poo;
    }


    public void setPoo(disciplina poo) {
        this.poo = poo;
    }


    public disciplina getEstDados() {
        return estDados;
    }


    public void setEstDados(disciplina estDados) {
        this.estDados = estDados;
    }


    public disciplina getEngSoftware() {
        return engSoftware;
    }


    public void setEngSoftware(disciplina engSoftware) {
        this.engSoftware = engSoftware;
    }


    public disciplina getBancoDados() {
        return bancoDados;
    }


    public void setBancoDados(disciplina bancoDados) {
        this.bancoDados = bancoDados;
    }


        public int getCodigoAluno() {
            return codigoAluno;
        }
    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    @Override
    public String toString() {
        return "aluno [codigoAluno=" + codigoAluno + ", curso=" + curso  + "]";
    }


}
