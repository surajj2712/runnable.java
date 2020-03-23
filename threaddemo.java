class threaddemo implements Runnable{
    threaddemo(){
        thread ct = thread.currentthread();
        System.out.println("currentthread"+ct);
        thread t = new thread( this, "demo thread");
        System.out.println("thread created:"+t);
        t.start();
        try{
            thread.sleep(3000);
        } catch(InterruptedException e){
            System.out.println("interrupted");
        }
        System.out.println("existing main thread");
    }
    public void run(){
        try{
            for(int i=5; i>0; i--){
                System.out.println(""+i);
                thread.sleep(1000);
            }
        }catch(InterruptedException e){
            system.out.println("child interrupted");
        }
        System.out.println("existing child thread");
    }
    public static void main(string args[]){
        new threaddemo();
    }
    

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }
}