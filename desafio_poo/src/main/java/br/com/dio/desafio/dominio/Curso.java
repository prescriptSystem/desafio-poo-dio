package br.com.dio.desafio.dominio;


import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper=true, includeFieldNames=true)
public class Curso extends Conteudo {

	private int cargaHoraria;

	@Override
	public double calcularXP() {

		return XP_PADRAO * cargaHoraria;
	}
	
	
	
	

}
