package inheritance1.cs6;

public class AccountBO {

	public FixedAccount getAccountDetail(String detail) {
		String arr[] = detail.split(",");
		FixedAccount fixedAccount = new FixedAccount(arr[0], Double.parseDouble(arr[1]), arr[2],
				Double.parseDouble(arr[3]), Integer.parseInt(arr[4]));
		return fixedAccount;
	}

}
