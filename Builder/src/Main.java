public class Main {
    public static void main(String[] args) {

        User user1 = new User.Builder()
                .setFirstName("Çağrı")
                .setLastName("Akbıyık")
                .setEmail("cagri@gmail.com")
                .setPhoneNumber("+849498464664")
                .build();

        System.out.println("First Name: " + user1.getFirstName() + "\nLast Name: " + user1.getLastName() + "\nEmail: " + user1.getEmail() + "\nPhone Number: " + user1.getPhoneNumber());
    }
}
