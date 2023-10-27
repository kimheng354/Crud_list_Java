import java.util.List;


public  class User {
    private  final  int id ;
    private String name ;
    private int age ;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static User findUserByID(List<User> userList, int readID){
        for (User user:userList){
            if (user.getId()==readID){
                return user;
            }

        }
        return null ;
    }



}
