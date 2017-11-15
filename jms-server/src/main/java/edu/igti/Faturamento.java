package edu.igti;

public class Faturamento {

    private String cliente;
    private Float valor;

    public Faturamento() {
    }

    public Faturamento(String cliente, Float valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	@Override
    public String toString() {
        return String.format("Faturamento{cliente=%s, valor=%f}", getCliente(), getValor());
    }

}
