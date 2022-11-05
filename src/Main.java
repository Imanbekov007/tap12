
public class Main {
    public static void main(String[] args) {



        University university = new University();
        university.setName("Oxford");
        university.setLocation("England");
        university.setDate(1096);
        university.setStudents(22000);

        University university2 = new University();
        university2.setName("Cambridge");
        university2.setLocation("England");
        university2.setDate(1209);
        university2.setStudents(21098);


        University university3 = new University();
        university3.setName("Manas");
        university3.setLocation("Kyrgyzstan");
        university3.setDate(1995);
        university3.setStudents(6000);


        University university4 = new University();
        university4.setName("Ala-too");
        university4.setLocation("Kyrgyzstan");
        university4.setDate(1996);
        university4.setStudents(5000);


        University[] universities = {university, university2, university3, university4};
        System.out.println("            UNIVERSITIES");
        console(universities);

        Car car=new Car();
        car.setName("BMW");
        car.setLocation("Germany");
        car.setDate(1916);
        car.setStudents(118000);

        Car car2=new Car();
        car2.setName("Mercedes-Benz");
        car2.setLocation("Germany");
        car2.setDate(1926);
        car2.setStudents(172000);


        Car car3=new Car();
        car3.setName("Ford");
        car3.setLocation("USA");
        car3.setDate(1903);
        car3.setStudents(186000);


        Car car4=new Car();
        car4.setName("Honda");
        car4.setLocation("Japan");
        car4.setDate(1948);
        car4.setStudents(218045);

        Car[] cars={car,car2,car3,car4};
        System.out.println(" ");
        System.out.println("            CARS");
        console2(cars);

        School school=new School();
        school.setName("Oxford International School Bishkek");
        school.setLocation("Kyrgyzstan");
        school.setDate(1987);
        school.setStudents(500);

        School school2=new School();
        school2.setName("Chyngyz Aytmatov");
        school2.setLocation("Kyrgyzstan");
        school2.setDate(1973);
        school2.setStudents(2000);

        School school3=new School();
        school3.setName("British School of the Moscow");
        school3.setLocation("Russia");
        school3.setDate(2018);
        school3.setStudents(800);

        School school4=new School();
        school4.setName("Kazakhstan International School");
        school4.setLocation("Kazakhstan");
        school4.setDate(1997);
        school4.setStudents(2400);

        School[] schools={school,school2,school3,school4};
        System.out.println(" ");
        System.out.println("            Schools");
        console3(schools);

        Person person=new Person();
        person.setName("Jackie Chan");
        person.setLocation("China");
        person.setDate(1954);
        person.setStudents(65);

        Person person2=new Person();
        person2.setName("Gulzhigit Alykulov");
        person2.setLocation("Kyrgyzstan");
        person2.setDate(2000);
        person2.setStudents(60);

        Person person3=new Person();
        person3.setName("Cristiano Ronaldo");
        person3.setLocation("Portugal");
        person3.setDate(1985);
        person3.setStudents(85);

        Person person4=new Person();
        person4.setName("Tom Hardy");
        person4.setLocation("England");
        person4.setDate(1977);
        person4.setStudents(75);

        Person[] people={person,person2,person3,person4};
        System.out.println(" ");
        System.out.println("            People");
        console4(people);






    }

    public static void console(University[] universities) {
        for (University university : universities) {

            {
                System.out.println("Name of the university : "+university.getName());
                System.out.println("Location of the university : "+university.getLocation());
                System.out.println("Foundation date of the university : "+university.getDate()+"-year");
                System.out.println("Number of students : "+university.getStudents());
                System.out.println(" ");
            }
        }

    }
    public static void console2(Car[] cars) {
        for (Car car : cars) {
            {
                System.out.println("Name of the car: "+car.getName());
                System.out.println("Country of the car : "+car.getLocation());
                System.out.println("Foundation date of car : "+car.getDate()+"-year");
                System.out.println("Number of employees : "+car.getStudents());
                System.out.println(" ");
            }
        }

    }
    public static void console3(School[] schools) {
        for (School school : schools) {

            {
                System.out.println("Name of the School : "+school.getName());
                System.out.println("Location of the School : "+school.getLocation());
                System.out.println("Foundation date of the School : "+school.getDate()+"-year");
                System.out.println("Number of students : "+school.getStudents());
                System.out.println(" ");
            }
        }

    }
    public static void console4(Person [] people) {
        for (Person  person: people) {

            {
                System.out.println("Name : "+person.getName());
                System.out.println("Place of the birth : "+person.getLocation());
                System.out.println("Date of birth : "+person.getDate()+" year");
                System.out.println("Weight : "+person.getStudents()+"kg");
                System.out.println(" ");
            }
        }

    }


}

