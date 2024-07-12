package n2exercici1.models;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	private static Scanner scanner = new Scanner(System.in);
	
	public static byte llegirByte(String missatge) {
		byte edat = 0;
		boolean entradaCorrecta = false;
		
		do {
			try {
				System.out.println(missatge);
				edat = scanner.nextByte();
				entradaCorrecta = true;
				
			} catch (InputMismatchException ex) {
				System.out.println("Error de format");
			}
		} while (!entradaCorrecta);
		
		return edat;
	}
	
	public static int llegirInt(String missatge) {
		int edat = 0;
		boolean entradaCorrecta = false;
		
		do {
			try {
				System.out.println(missatge);
				edat = scanner.nextInt();
				entradaCorrecta = true;
				
			} catch (InputMismatchException ex) {
				System.out.println("Error de format");
			}
		} while (!entradaCorrecta);
		
		return edat;
	}
	
	public static float llegirFloat(String missatge) {
		float edat = 0;
		boolean entradaCorrecta = false;
		
		do {
			try {
				System.out.println(missatge);
				edat = scanner.nextFloat();
				entradaCorrecta = true;
			} catch (InputMismatchException ex) {
				System.out.println("Error de format");
			}
		} while (!entradaCorrecta);
		
		return edat;
	}
	
	public static float llegirDouble(String missatge) {
		double edat = 0;
		boolean entradaCorrecta = false;
		
		do {
			try {
				System.out.println(missatge);
				edat = scanner.nextDouble();
				entradaCorrecta = true;
				
			} catch (InputMismatchException ex) {
				System.out.println("Error de format");
			}
		} while (!entradaCorrecta);
		
		return edat;
	}
	
	public static char llegirChar(String missatge) {
		char edat = 0;
		boolean entradaCorrecta = false;
		
		do {
			try {
				System.out.println(missatge);
				edat = scanner.next().charAt(0);
				entradaCorrecta = true;
				
			} catch (Exception ex) {
				System.out.println("Error de format");
			}
		} while (!entradaCorrecta);
		
		return edat;
	}
	
	public static String llegirString(String missatge) {
		String edat = null;
		boolean entradaCorrecta = false;
		
		do {
			try {
				System.out.println(missatge);
				edat = scanner.nextLine();
				entradaCorrecta = true;
				
			} catch (Exception ex) {
				System.out.println("Error de format");
			}
		} while (!entradaCorrecta);
		
		return edat;
	}
	
	public static boolean llegirSiNo(String missatge) {
		boolean resposta = false;
		boolean entradaCorrecta = false;
		
		do {
			try {
				System.out.println(missatge);
				 String edat = scanner.next().toLowerCase();
	                if (edat.equals("s")) {
	                    resposta = true;
	                    entradaCorrecta = true;
	                } else if (edat.equals("n")) {
	                    resposta = false;
	                    entradaCorrecta = true;
	                } else {
	                    System.out.println("Error de format.");
	                }
	            } catch (Exception e) {
	                System.out.println("Error de format.");
	                scanner.nextLine(); 
	            }
	        } while (!entradaCorrecta);
	        
	        return resposta;
	}
	}


