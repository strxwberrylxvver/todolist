package todolistmodel;

public class task {
    private static String name;
    private boolean completion;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getCompletion(){
        return completion;
    }

    public void setCompletion(boolean completion){
        this.completion = completion;
    }
    public task(){
        ;
    }
    public task(String name){
        this.name = name;
    }
}
