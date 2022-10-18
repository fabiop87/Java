public class controle {
    public int codigoDisc;
    private int codigoAluno;
    private float P1, AI1, P2, AI2;
    private float mediaFinal;
    private aluno aluno;

    public controle(aluno aluno, int codigoDisc, float P1, float AI1, float P2, float AI2) {

        this.aluno = aluno;
        setCodigoDisc(codigoDisc);;
        this.P1 = P1;
        this.AI1 = AI1;
        this.P2 = P2;
        this.AI2 = AI2;
        setMediaFinal(P1, AI1, P2, AI2);
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }


    public aluno getAluno() {
        return aluno;
    }

    public int getCodigoDisc() {
        return codigoDisc;
    }

    public void setCodigoDisc(int codigoDisc) {
        this.codigoDisc = codigoDisc;
    }

    public void setAluno(aluno aluno) {
        this.aluno = aluno;
    }

    public float getP1() {
        return P1;
    }

    public void setP1(float P1) {
        if (P1 >= 0 && P1 <= 9) {
            this.P1 = P1;
            System.out.println("nota da p1 alterada para: " + P1);
        }else{System.out.println("valor invalido");}
    }

    public float getAI1() {
        return AI1;
    }

    public void setAI1(float AI1) {
        if (AI1 >= 0 && AI1 <= 1) {
            this.AI1 = AI1;
            System.out.println("nota da ai1 alterada para: " + AI1);
        }else{System.out.println("valor invalido");}
    }

    public float getP2() {
        return P2;
    }

    public void setP2(float P2) {
        if (P2 >= 0 && P2 <= 9) {
            this.P2 = P2;
            System.out.println("nota da p2 alterada para: " + P2);
        }else{System.out.println("valor invalido");}
    }

    public float getAI2() {
        return AI2;
    }

    public void setAI2(float AI2) {
        if (AI2 >= 0 && AI2 <= 1 ) {
            this.AI2 = AI2;
            System.out.println("nota da ai2 alterada para" + AI2);
        }else{System.out.println("valor invalido");}
    }

    public float getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(float P1, float AI1, float P2, float AI2) {
        float media = (P1 + AI1 + P2 + AI2) / 2;
        this.mediaFinal = media;
    }

    @Override
    public String toString() {
        return " [codigoDisc=" + codigoDisc + ", codigoAluno=" + codigoAluno + ", P1=" + P1 + ", AI1=" + AI1
                + ", P2=" + P2 + ", AI2=" + AI2 + ", mediaFinal=" + mediaFinal  + "]";
    }


}
