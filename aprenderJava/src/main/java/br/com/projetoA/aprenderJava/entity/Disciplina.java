package br.com.projetoA.aprenderJava.entity;

public class Disciplina {
	
	private String nomeDisciplina;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeDisciplina == null) ? 0 : nomeDisciplina.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota4);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Disciplina other = (Disciplina) obj;
		if (nomeDisciplina == null) {
			if (other.nomeDisciplina != null)
				return false;
		} else if (!nomeDisciplina.equals(other.nomeDisciplina))
			return false;
		if (Double.doubleToLongBits(nota1) != Double.doubleToLongBits(other.nota1))
			return false;
		if (Double.doubleToLongBits(nota2) != Double.doubleToLongBits(other.nota2))
			return false;
		if (Double.doubleToLongBits(nota3) != Double.doubleToLongBits(other.nota3))
			return false;
		if (Double.doubleToLongBits(nota4) != Double.doubleToLongBits(other.nota4))
			return false;
		return true;
	}
	
	
	
}
