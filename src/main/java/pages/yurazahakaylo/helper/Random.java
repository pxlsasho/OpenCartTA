package pages.yurazahakaylo.helper;



public class Random {

    public String randomEmail = BuildRandomStringBetween(1,32) + "@gmail.com";
    public String randomName = BuildRandomStringBetween(1,32);
    public String randomSecondName = BuildRandomStringBetween(1,32);
    public String randomPassword = BuildRandomStringBetween(4,20);
    public String randomPhoneNumber = BuildRandomNumberBetween(3,32);



// Do beetween

    public String BuildRandomStringBetween(int a, int b)
    {
        String SaltCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz" +
                "1234567890";
        StringBuilder salt = new StringBuilder();

        java.util.Random rnd = new java.util.Random();

        while (salt.length() < getRandomIntegerBetweenRange(a,b))
        {
            int index = (int) (rnd.nextFloat() * SaltCHARS.length());
            salt.append(SaltCHARS.charAt(index));
        }

        return salt.toString();
    }

    public String BuildRandomNumberBetween(int a, int b)
    {
        String SaltCHARS = "1234567890";
        StringBuilder salt = new StringBuilder();

        java.util.Random rnd = new java.util.Random();

        while (salt.length() < getRandomIntegerBetweenRange(a,b))
        {
            int index = (int) (rnd.nextFloat() * SaltCHARS.length());
            salt.append(SaltCHARS.charAt(index));
        }

        return salt.toString();
    }



    public int getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
}
