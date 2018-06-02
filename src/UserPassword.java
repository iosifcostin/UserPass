

public class UserPassword {
    public static void main(String[] args) {


        Person[] user = new Person[3];
        Person Iosif = new Person("Iosif", "asdfasdf");
        Person Marius = new Person("Marius", "qwerqwer");
        Person Iulia = new Person("Iulia", "zxcvzxcv");

        user[0] = Iosif;
        user[1] = Marius;
        user[2] = Iulia;

        String nume = SkeletonJava.readStringConsole("User: ");
        String parola = SkeletonJava.readStringConsole("Password: ");


        boolean acces = false;

        while (!acces)
        {
            System.out.println("User sau parola gresita, mai incercati!");

            nume = SkeletonJava.readStringConsole("User: ");
            parola = SkeletonJava.readStringConsole("Password: ");

            for (int i = 0; i < user.length; i++)
            {
                if (nume.equals(user[i].user) && parola.equals(user[i].password))
                {

                    acces = true;
                    break;
                }

            }

            if (acces)
            {
                System.out.println("Avesti acces");
            }


        }
    }
} // end class
