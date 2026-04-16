public class LongUserID {
    
    public static void main(String[] args) {
        
        long user1 = 135L, user2 = 654L;
        long idPermitted = 135L;
        
        if (user1 == idPermitted) {
            System.out.println("User "+ user1 + " Access granted");
        }

        else{
            System.out.println("User "+ user1 + " Access Denied");
        }

                if (user2 == idPermitted) {
            System.out.println("User "+ user2 + " Access granted");
        }

        else{
            System.out.println("User "+ user2 + " Access Denied");
        }

    }
}
