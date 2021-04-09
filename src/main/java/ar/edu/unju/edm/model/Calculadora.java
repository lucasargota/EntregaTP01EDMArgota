package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	private int num1;
	private int num2;

	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	public int sumar() {
		  return num1 + num2;
		
	}
	
	public int restar() {
		  return num1 - num2;
		
	}
	
	public int dividir() {
		  return num1 / num2;
		
	}
	
	public int multiplicar() {
		  return num1 * num2;
		
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num1;
		result = prime * result + num2;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (num1 != other.num1)
			return false;
		if (num2 != other.num2)
			return false;
		return true;
	}

	

}
