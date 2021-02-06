package cl.awakelab.pruebaTest.main;

import cl.awakelab.pruebaTest.controller.Controller;
import cl.awakelab.pruebaTest.entity.ShoppingCart;

public class Main {

	public static void main(String[] args) {
		ShoppingCart bookCart = new ShoppingCart();
		
		Controller controller = new Controller(bookCart);
		
		System.out.println("bookCart.getItemCount(): " + bookCart.getItemCount());
		
		controller.productAdd();
		
		System.out.println("bookCart.getItemCount(): " + bookCart.getItemCount());
		
		controller.empty();
		
		System.out.println("bookCart.getItemCount(): " + bookCart.getItemCount());
		
		// Acá lanza una excepción (es lo esperado)
		//controller.testProductNotFound();

	}

}
