public class Person {
    private String Firstname;
    private String surname;
    private int age;
    private char sex;
    private String phoneNumber;

    Person (){
    }

    Person (String Firstname, String surname, int age, char sex, String phoneNumber){
        this.Firstname = Firstname;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstname(){
        return Firstname;
    }
    public void setFirstname(String Firstname){
        this.Firstname = Firstname;
    }
    public String getsurname(){
        return surname;
    }
    public void setsurname(String surname){
        this.surname = surname;
    }
    public int age(){
        return age;
    }
    public void setage(int age){
        this.age = age;
    }
    public char getsex(){
        return sex;
    }
    public void setsex(char sex){
        if (sex == 'f' || sex = 'm'){
            this.sex = sex;
        }
        else{
            System.out.println("Sex not valid!");
        }
    }
    public String getphoneNumber(){
        return phoneNumber;
    }
    public void setphoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    
    public String displayDetails() {
        return ("First Name = " + Firstname + "\nSurname = " + surname + "\nAge = " + age + "\nSex = " + sex
                + "\nPhone Number = " + phoneNumber);
    }


}


