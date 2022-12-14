package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;



import lombok.Data;

@Data
public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public void inscrever(Bootcamp bootcamp)
	{
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsIncritos().add(this);
	}
	
	public void progredir()
	{
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}
		else
		{
			System.err.println("Você não está matriculado em nenhum conteúdo");
		}
	}
	
	public double calcularXP()
	{
		return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
		
	}

}
