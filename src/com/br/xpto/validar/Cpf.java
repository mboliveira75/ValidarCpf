package com.br.xpto.validar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.br.xpto.exception.CpfException;

public class Cpf {
	
	private String numCpf;
	private int digVerficador1;
	private int digVerificador2;
	
	public Cpf(){
		
		super();
		
	}

	public String getNumCpf() {
		return numCpf;
	}

	public void setNumCpf(String numCpf) {
		if(numCpf.length() != 11){
			throw new CpfException(" Numero de digitos digitado esta incorreto !");
		}else{
			Pattern cpf = Pattern.compile("\\D{11}");
			Matcher matcher = cpf.matcher(numCpf);
			if(!matcher.find()){
				throw new CpfException(" Digitar apenar Numeros !");
			}
		}
	}

	public int getDigVerficador1() {
		return digVerficador1;
	}

	public void setDigVerficador1(int digVerficador1) {
		this.digVerficador1 = digVerficador1;
	}

	public int getDigVerificador2() {
		return digVerificador2;
	}

	public void setDigVerificador2(int digVerificador2) {
		this.digVerificador2 = digVerificador2;
	}
	
	

}
