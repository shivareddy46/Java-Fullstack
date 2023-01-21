class employee{
    int id;
    String name;
    employee(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class detail extends employee{
    int age;
    detail(int id,String name,int age){
        super(id,name);
        this.age=age;
    }
    void display(){
        System.out.println(id+","+name+"."+age);
    }
}
class superuf{
    public static void main(String[] args){
        detail d=new detail(101,"Siva",19);
        d.display();
    }
}