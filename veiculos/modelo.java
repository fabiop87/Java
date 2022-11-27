
public class modelo {

    private String modelo;
    private opcional op1;
    private opcional op2;
    private opcional op3;
    private opcional op4;
    private opcional op5;

    public modelo(String modelo) {
        this.modelo = modelo;
    }

    public modelo(String modelo, opcional op1, opcional op2) {
        this.modelo = modelo;
        this.op1 = op1;
        this.op2 = op2;
    }

    public modelo(String modelo, opcional op1, opcional op2, opcional op3, opcional op4) {
        this.modelo = modelo;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public opcional getOp1() {
        return op1;
    }

    public void setOp1(opcional op1) {
        this.op1 = op1;
    }

    public opcional getOp2() {
        return op2;
    }

    public void setOp2(opcional op2) {
        this.op2 = op2;
    }

    public opcional getOp3() {
        return op3;
    }

    public void setOp3(opcional op3) {
        this.op3 = op3;
    }

    public opcional getOp4() {
        return op4;
    }

    public void setOp4(opcional op4) {
        this.op4 = op4;
    }

    public opcional getOp5() {
        return op5;
    }

    public void setOp5(opcional op5) {
        this.op5 = op5;
    }

    @Override
    public String toString() {
        return getModelo() ;
    }

}
