
public class TestEncapsulation {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAcc_no(937739073L);
		acc.setName("David Slavevski");
		acc.setEmail("slavevskidavid@gmail.com");
		acc.setAmount(256000f);
		System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
	}
}