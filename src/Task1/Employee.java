package Task1;

public class Employee {

    public String name;
    public Integer id;
    public String phone;
    public boolean updatephone;

    public void setName(String name){
        this.name = name;
    }

    public String updateName(){
        return this.name;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setupdatePhone(boolean updatephone){
        this.updatephone = updatephone;
    }

    public boolean updatePhone(){
        return this.updatephone;
    }

    public void getById (int id){
        if (id == this.id){
            System.out.println("======= getById ==========");
            System.out.println("Name : " + name );
            System.out.println("Id : " + id);
            System.out.println("Phone : " + phone);
            System.out.println("===========================");
        }
    }











}
