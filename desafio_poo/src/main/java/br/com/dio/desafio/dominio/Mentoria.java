package br.com.dio.desafio.dominio;

import java.time.LocalDate;


import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper=true, includeFieldNames=true)
public class Mentoria extends Conteudo {

	private LocalDate data;
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}
	
	

}
