public class UserModel {
    protected int id;
    protected String name;
    protected String gender;
    private String ABA_ACCOUNT_NUMBERR; //spacial variable

    public UserModel() {
    }

    public UserModel(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
