package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class stream {

	public static void main(String[]args){
		
		Consumer<String> println = System.out::println;
		Stream<String> nomes = Stream.of("joao", "jose", "juca"); 
		List<String> outrosNomes = Arrays.asList("ana", "Juan", "mauricio");
		
		outrosNomes.stream().forEach(println);
		
		
		UnaryOperator<String> addGreeting = nome -> "olá " + nome;
		
		nomes.map(addGreeting).forEach(println);
		
	}
	
}
