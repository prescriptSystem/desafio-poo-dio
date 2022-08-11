package me.dio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
		
		//System.out.println(curso1);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição Curso JS");
		curso2.setCargaHoraria(4);
		
		//System.out.println(curso2);
		 
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Curso JS");
		mentoria.setDescricao("Descrição Curso JS");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Devoloper");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devVictor = new Dev();
		devVictor.setNome("Victor");
		devVictor.inscrever(bootcamp);
		
		devVictor.progredir();
		devVictor.progredir();
		
		System.out.println("Conteúdos Inscritos Victor: " + devVictor.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Victor: " + devVictor.getConteudosConcluidos());
		System.out.println("XP: " + devVictor.calcularXP());
		System.out.println("Conteúdos Inscritos Victor: " + devVictor.getConteudosInscritos());
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscrever(bootcamp);
		
		devJoao.progredir(); 
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularXP());
		System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
		
	}

}
