package entidades;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.toedter.calendar.JCalendar;

public class OrdemServico {

	private Date DataAgendamento;
	private Cliente cliente;
	private double valorTotal;

	public OrdemServico() {
		super();
	}

	public OrdemServico( Date dataAgendamento, Cliente cliente, double ValorTotal) {
		super();
		this.cliente = cliente;
		this.DataAgendamento = dataAgendamento;
	}

	public Date getDataAgendamento() {
		return DataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		DataAgendamento = dataAgendamento;
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
	

	@Override
	public String toString() {
		return "Data: " + DataAgendamento.getDay() +"/"+ (DataAgendamento.getMonth()+1) +
				" Cliente= " + cliente.getNome() + ", Valor= R$"+ getValorTotal();
	}

	
}
