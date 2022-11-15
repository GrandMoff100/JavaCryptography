package crypto;

/* Defines the protocol for the cryptography classes. */
abstract class CryptoBase {
    public abstract String encrypt(String content);
    public abstract String decrypt(String content);

    public static void main(String args[])
    {
        System.out.println("Hello World");

    }

    private String sterialize(String content) {
        return content.toLowerCase();
    }
}
