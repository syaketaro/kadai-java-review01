
public class Review01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int price = 1500;
		int syouhizei = tax(price);
		int taxIn = price + syouhizei;
		
		System.out.println(price + "円の商品の税込価格は" + taxIn + "円（消費税は"+ syouhizei + "円）です。");
	}
	public static int tax(int price) {
		int result = price / 10;
		return result;
		
	}
}
