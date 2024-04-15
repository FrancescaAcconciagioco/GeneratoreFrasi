package generaFrasi;

public class phraseoMatic {
	public static void main(String[]args){
final String[]elenco1 = {"ciao","buongiorno","bella",};
final String[]elenco2 = {"egregio","eclettico","intelligentissimo"};
final String[]elenco3 = {"studente","ragazzo","giovane"};

String parola1 = elenco1 [(int)(Math.random()*elenco1.length)];
String parola2 =elenco2 [(int)(Math.random()*elenco2.length)];
String parola3 = elenco3[(int)(Math.random()*elenco3.length)];
System.out.println(parola1+ " " + parola2 + " " +parola3 +" " );

}
}
