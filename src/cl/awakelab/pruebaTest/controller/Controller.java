package cl.awakelab.pruebaTest.controller;

import cl.awakelab.pruebaTest.entity.Product;
import cl.awakelab.pruebaTest.entity.ShoppingCart;
import cl.awakelab.pruebaTest.exception.ProductNotFoundException;

public class Controller {
	private ShoppingCart _bookCart;
    private Product _defaultBook;
    
    public Controller(ShoppingCart bookCart) {
    	_bookCart = bookCart;

        _defaultBook = new Product("Extreme Programming", 23.95);
        _bookCart.addItem(_defaultBook);
    }
	
	
	public void productAdd() {
		Product newBook = new Product("Refactoring", 53.95);
        _bookCart.addItem(newBook);
	}
	
	public void empty() {
		_bookCart.empty();
	}
	
	 public void testProductRemove() throws ProductNotFoundException {
		 _bookCart.removeItem(_defaultBook);
	 }
	 
	 public void testProductNotFound() {
		 Product book = new Product("Ender's Game", 4.95);
         try {
			_bookCart.removeItem(book);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
