class A extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i==3){
                System.out.print("i is : "+i+", ");
                break;
            }
        }
        System.out.println("Exit from Thread A");
    }
}

class B extends Thread{
    public void run() {
        for(int j=1;j<=10;j++){
            if(j==3)
                Thread.yield();
            System.out.print("j is :"+j+", ");
        }
        System.out.println("Exit from Thread B");
    }
}

class C extends Thread {
    public void run(){
        try{
            for(int k=1;k<=10;k++){
                Thread.sleep(2000);
                System.out.print("K is "+k+", ");
            }
            System.out.println("Exit from Thread C");
        }
        catch(Exception e){}
    }
}
class ThreadDemo{
    public static void main(String args[]){
        Thread t = Thread.CurrentThread();
        System.out.println("Current Thread Name : "+t.getName());
        System.out.println(t);

        t.setName("Dileep","Vinod");
        
    }
}
