class excepton{
    public static void main(String[] args){
        try{
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            int k = i/j;
            System.out.println("Division result is :- "+k);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
} 