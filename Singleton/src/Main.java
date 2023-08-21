public class Main {
    public static void main(String[] args) {
        User user = User.getInstance();
        user.setName("Çağrı");
        user.setSurname("Akbıyık");

        User sameUser = User.getInstance();
        System.out.println(sameUser.getName() + " " + sameUser.getSurname());
    }
}
