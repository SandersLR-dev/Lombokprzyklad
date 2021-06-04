public class LombokPrzyklad {
    public static void main(String[] args){


        App app = new App();
        App app2 = new App("Piotr","Nowak",22);

        AppData appData= new AppData("Piotr","Nowak");

        System.out.println("Wiek : " + app.getAge());
        System.out.println("Imie : "+app.getName());
        System.out.println("Nazwisko : "+app.getLastName());

        System.out.println(app.toString());
        System.out.println(app.hashCode());
        System.out.println(app2.toString());
        System.out.println(app2.hashCode());
        System.out.println(app.equals(app2));

        System.out.println(appData.toString());
        app.setAge(22);
        app.setName("Piotr");
        app.setLastName("Nowak");

        System.out.println(app.equals(app2));


    }
}
