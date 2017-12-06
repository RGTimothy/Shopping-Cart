public class TestCart {
 	public static void main(String[] args){
 		Cart cart = new Cart();
		cart.addProduct("Baju Merah Mantap", 1);
		cart.addProduct("Baju Merah Mantap", 1);
		cart.addProduct("Bukuku", 3);
		cart.removeProduct("Bukuku");
		cart.addProduct("Singlet Hijau", 1);
		cart.removeProduct("ProdukBohongan");
		cart.showCart();
 	}
}