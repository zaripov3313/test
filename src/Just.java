public class Just {
    private  String name;
    private  String surname;

    public Just(){
        System.out.println("bye bye");
    }


    public void test() {
    }
    public boolean Check(){
        return false;
    }

    public Just(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Just{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

