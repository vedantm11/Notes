   

 public class JoinExample1 extends Thread  
    {    
        public void run()  
        {    
            for(int i=1; i<=4; i++)  
            {    
                try  
                {    
                    Thread.sleep(500);    
                }catch(Exception e){System.out.println(e);}    
                
              System.out.println(i);    
            }    
        }    
        public static void main(String args[])  
        {   
            // creating three threads  
            JoinExample1 t1 = new JoinExample1();    
            JoinExample1 t2 = new JoinExample1();    
            JoinExample1 t3 = new JoinExample1();    

            // thread t1 starts  
            t1.start();   
            // starts second thread only when first thread t1 is dead.  
            try  
            {    
                t1.join();    
            }catch(Exception e){System.out.println(e);}    
          
            // start t2 and t3 thread   
            t2.start();   
            t3.start();    
        }    
    }  

OUTPUT:
1
2
3
4
1
1
2
2
3
3
4
4