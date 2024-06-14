public class modifiers_private {
    private String fName = "Gorish";
    private String lName = "Mahaajan";
    private String email = "gmahajan23@email.com";
    private int age = 19;

    public static void main(String[] args) {
        modifiers_private myObj = new modifiers_private();
        System.out.println("Name:" + myObj + " " + myObj.lName);
        System.out.println("email: " + myObj.email);
        System.out.println("Age" + myObj.age);
    }
}
