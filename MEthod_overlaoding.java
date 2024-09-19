class MetOverload{
    public int pro(int x){
        return (x);
    }
    public int pro(int x,int y){
        return (x*y);
    }
    public int pro(int x,int y,int z){
        return (x*y*z);
    }
    public static void main(String[] args){
        MetOverload d1=new MetOverload();
        System.out.println(d1.pro(4,3,2));
    }
}
