class conOverload{
    int id;
    String name;
    public conOverload(){
        System.out.println("Default constructor");
    }
    public conOverload(int i,String n){
        id=i;
        name=n;
    }
    public conOverload(int i){
        id=i;
        System.out.println("Single parameter");
    }
    public static void main(String[] args){
        conOverload d1=new conOverload();
        conOverload d3=new conOverload(5);
        conOverload d2=new conOverload(1,"Sohana");
        System.out.println(d3.id);
        System.out.println("ID is: "+d2.id+"\nName is:"+d2.name);
    }
}
