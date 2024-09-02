class MainFunction{
    public static void main(String []arg){
        
        final NeakIT neakIT = new NeakIT(Theme.DARKMODE, new Data(1, "Sok"));
        
        System.out.println(neakIT.data.getName());
    }
}
