package veiculos;
public class Veiculos {
    
    
    private String NomeVeiculo;
    private int PrecoVeiculo;
    public Modelo modelo;
    public Opcionais op1, op2, op3, op4, op5;

    public Veiculos(String NomeVeiculo, int PrecoVeiculo, Modelo modelo, Opcionais op1, Opcionais op2, Opcionais op3, Opcionais op4, Opcionais op5) {
        this.NomeVeiculo = NomeVeiculo;
        this.PrecoVeiculo = PrecoVeiculo;
        this.modelo = modelo;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.op5 = op5;
    }


    
    
    
}
