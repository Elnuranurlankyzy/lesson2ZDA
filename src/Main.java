//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
        public static int generateRandomAge() {
            return (int)(Math.random()*70);
        }
        public static String permission(int age, int temperature) {
            if((age > 20 && age < 45)&&(temperature > -20 && temperature < 30)) {
                return("Можно идти гулять!");
            }else if(age < 20 &&(temperature > 0 && temperature < 28)) {
                return ("Можно идти гулять!");
            }else if(age < 45 &&(temperature > -10 && temperature < 25)) {
                return("Можно идти гулять");
            }else{
                return("Оставайтесь дома!");
            }
        }

    public static void main(String[] args) {
        System.out.println(permission(23,47));
        System.out.println(permission(26,45));
        System.out.println(permission(29,34));
        System.out.println(permission(22,32));
        System.out.println(permission(25,24));
        System.out.println("");

        System.out.println(permission(generateRandomAge(),45));
    }
}



