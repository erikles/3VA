package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.Cliente;

public class OrdemServico {

	private Date dataEntrada;
	private Date dataSaida;
	private Integer numOS;
	private int statusServico;
	private Cliente cliente;
	private double valorTotal;
	private String descricao;
	
	
	

	public OrdemServico() {
		super();
	}

	public OrdemServico(String descricao, Date dataEntrada, Date dataSaida, Integer numOS, int statusServico, Cliente cliente) {
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.numOS = numOS;
		this.statusServico = statusServico;
		this.cliente = cliente;
		this.descricao = descricao;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Integer getNumOS() {
		return numOS;
	}

	public void setNumOS(Integer numOS) {
		this.numOS = numOS;
	}

	public int getStatusServico() {
		return statusServico;
	}

	public void setStatusServico(int statusServico) {
		this.statusServico = statusServico;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public void setMatricula(String text) {
		// TODO Aretur
		
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	
}
