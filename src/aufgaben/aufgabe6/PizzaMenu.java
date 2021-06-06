package aufgaben.aufgabe6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PizzaMenu {

	public static boolean existingPizza(Map<String,Double> menu, String pizza)
	{
		for(Map.Entry<String, Double> eintrag : menu.entrySet())
		{
			if(pizza == eintrag.getKey())
			{
				return true;
			}
		}
		return false;
	}
	
	public static void printPrice(Map<String,Double> menu, String pizza)
	{
		if(existingPizza(menu, pizza))
		{
			System.out.print(pizza + ": ");
			for(Map.Entry<String, Double> eintrag : menu.entrySet())
			{
				if(pizza == eintrag.getKey())
				{
					System.out.println(eintrag.getValue() + "0 Euro");
				}
			}
		}
		else
		{
			System.out.println(pizza + ": Diese Pizza gibt es nicht.");
		}
	}
	
	public static void printMenu(Map<String,Double> menu)
	{
		System.out.println("Das Menu enthält "+menu.entrySet().size()+ " Pizzen.");
			for(Map.Entry<String, Double> eintrag : menu.entrySet())
			{
				System.out.print("Pizza ");
				printPrice(menu , eintrag.getKey());
			}
	}
	
	public static void affordablePizza(Map<String,Double> menu, double maxPrice)
	{
		System.out.println("Eingegebener Betrag: "+ maxPrice + " Euro");
		HashSet<String> pizzen = new HashSet<String>();
		for(Map.Entry<String, Double> eintrag : menu.entrySet())
		{
			if(maxPrice >= eintrag.getValue())
			{
				pizzen.add(eintrag.getKey());
			}
		}
		if(pizzen.size()>0)
		{
			System.out.println("Mögliche Pizzen: " + pizzen);
			
		}
		else
		{
			System.out.println("Leider gibt es zu diesem Preis keine Pizza.");
		}
	}
	
	public static Map<String, Double> removeAllPizzen(Map<String,Double> menu)
	{
		HashSet<String> löschen = new HashSet<String>();
		for(Map.Entry<String, Double> eintrag : menu.entrySet())
		{
			löschen.add(eintrag.getKey());
		}
		for(String s : löschen)
		{
			menu.remove(s);
		}
		return menu;
	}

	public static void main(String[] args) {

		Map<String,Double> menu = new HashMap<>();

		menu.put("Margherita", 7.00);
		menu.put("Veggie", 7.50);
		menu.put("Salami", 8.50);
		menu.put("Schinken", 8.50);
		System.out.printf("%n----------- Test existingPizza -----------%n%n");
		System.out.println(existingPizza(menu, "Veggie"));
		System.out.println(existingPizza(menu, "Hawaii"));
		System.out.printf("%n----------- Test printPrice -----------%n%n");
		printPrice(menu, "Salami");
		printPrice(menu, "Hawaii");
		System.out.printf("%n----------- Test printMenu -----------%n%n");
		printMenu(menu);
		System.out.printf("%n----------- Test Preisänderung für Schinken Pizza -----------%n%n");
		menu.put("Schinken", 8.20);
		printPrice(menu, "Schinken");
		System.out.printf("%n----------- Test affordablePizza -----------%n%n");
		affordablePizza(menu, 4.0);
		affordablePizza(menu, 8.0);
		System.out.printf("%n----------- Test removeAllPizzen + neue Pizzen hinzufügen -----------%n%n");
		removeAllPizzen(menu);
		menu.put("Verde", 7.0);
		menu.put("Hawaii", 8.2);
		menu.put("Tradizionale", 8.5);
		printMenu(menu);
		System.out.printf("%n----------- Test Menu2 -----------%n%n");
		Map<String, Double> menu2 = new HashMap<>();
		menu2.putAll(menu);
		menu2.remove("Hawaii");
		for(Map.Entry<String, Double> pizzen : menu2.entrySet())
		{
			System.out.println(pizzen.getKey());
		}
		
		
	}

}
