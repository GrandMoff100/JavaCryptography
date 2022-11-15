import crypto.CaesarCipher;

public class Main {
	public static void main(String args[])
	{
		CaesarCipher cipher = new CaesarCipher("abcdefghijklmnopqrstuvwxyz ", 3);
		System.out.println(cipher.encrypt(content));
		System.out.println(cipher.decrypt(cipher.encrypt(content)));

	}
}
