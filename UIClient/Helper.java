package UIClient;

public class Helper {
     boolean checkPhoneNumber (String phoneNumber) {
         if (phoneNumber.length() != 10) {
             System.out.println("10 digits is required\n");
             return false;
         }

         int isInteger = 1;
         for (int i = 0; i <= 10; i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))){
                isInteger = 0;
                break;
            }
         }
         if (isInteger==0){
             System.out.println("Enter only digits\n");
         }
         return  true;
     }

     boolean checkName (String name){
      if (name==""){
          System.out.println("Invalid\n");
          return false;
      }

      boolean isAlphabet = true;
      for (int i =0; i<=name.length(); i++){
          if (!Character.isLetter(name.charAt(i))){
              isAlphabet=false;
              break;
          }
      }
      if (isAlphabet==false){
          System.out.println("Only alphabet is allowed\n");
      }
      return true;
     }

     boolean checkPassword (String password){
         if (password==""){
             System.out.println("Invalid\n");
             return false;
         }
         if (password.length()<8){
             return false;
         }
        return true;
     }


}
