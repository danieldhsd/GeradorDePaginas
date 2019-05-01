package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Parser.Formatter;
import tagsCorpaPagina.Html;

public class SalvarArquivo {
	public static File arquivo;
	public static FileWriter escritorDeArquivo;
	public static Formatter formatador;
	
	public boolean salvarArquivo(Html html) {
		String caminho = "saida.html";
		
		try {
			arquivo = new File(caminho);
			formatador = new Formatter();
			escritorDeArquivo = new FileWriter(arquivo);
			escritorDeArquivo.write(html.geraResultado());
			escritorDeArquivo.close();
			formatador.format(caminho);
			
			return true;
		}catch( IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}