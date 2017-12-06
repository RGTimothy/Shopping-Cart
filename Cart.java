import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Cart {
 
	private List<String> products = new ArrayList<String>();
	private int total_products;
 
	public int getTotalProducts() {
		return total_products;
	}
 
	public void addProduct(String productCode, int quantity) {
		for(int i = 0; i < quantity; i++)
		{
			products.add(productCode);
			total_products++;	
		}
	}

	public void removeProduct(String productCode) {
		for(int i = total_products - 1; i >= 0; i--)
		{
			if(products.get(i).equals(productCode))
			{	
				products.remove(i);
				total_products--;
			}
		}
	}

	protected int countThisProduct(String name){
		int sum = 0;
		for(int i = 0; i < total_products; i++)
		{
			if(products.get(i) == name) sum++;
		}
		return sum;
	}

	public void showCart(){
		Set<String> uniqueProduct = new HashSet<String>(products);
		for(String unique:uniqueProduct)
		{

			System.out.println(unique + " (" + countThisProduct(unique) + ")");
		}
	}
}