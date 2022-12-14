package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Bootcamp {
	
	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	private Set<Dev> devsIncritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();

}
