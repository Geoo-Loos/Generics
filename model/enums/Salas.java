package model.enums;


public enum Salas {
    SALA_A(300.00),
    SALA_B(300.00),
    SALA_C(300.00),
    SALA_D(300.00);

    private Double adicional;

    private Salas(Double adicional) {
        this.adicional = adicional;
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }

    
}
