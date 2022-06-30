package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class PlataformaDeEnsino {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Lesson> list = new ArrayList<>();

		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da " + i + " a aula:");
			System.out.print("Conte�do ou tarefa (c/t)?");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			if (ch == 'c') {
				System.out.print("T�tulo:");
				String Tit = sc.next();
				System.out.print("URL do v�deo: ");
				String url = sc.next();
				System.out.print("Dura��o em segundos: ");
				int sec = sc.nextInt();
				list.add(new Video(Tit, url, sec));
				System.out.println();
			} else {
				System.out.print("T�tulo:");
				String Tit = sc.next();
				System.out.print("Descri��o:");
				String desc = sc.next();
				System.out.print("Quantidade de quest�es:");
				int quest = sc.nextInt();
				list.add(new Task(Tit, desc, quest));
			}
		}

		sc.close();

		System.out.println();
		System.out.print("DURA��O TOTAL DO CURSO = " + "Segundos ");
		int result = 0;
		for (Lesson lesson : list) {
			result += lesson.duration();
		}

		System.out.print(result);

	}

}

//Lesson  = li��o
//questioncount = n�mero de perguntas
