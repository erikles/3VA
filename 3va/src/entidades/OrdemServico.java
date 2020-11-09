package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.toedter.calendar.JCalendar;

public class OrdemServico {

	private JCalendar DataAgendamento;
	private Cliente cliente;
	private double valorTotal;

	public OrdemServico() {
		super();
	}

	public OrdemServico( JCalendar dataAgendamento, Cliente cliente, double ValorTotal) {
		super();
		this.cliente = cliente;
		this.DataAgendamento = dataAgendamento;
	}


	
	public JCalendar getDataAgendamento() {
		return DataAgendamento;
	}

	public void setDataAgendamento(JCalendar calendar) {
		DataAgendamento = calendar;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	
}
