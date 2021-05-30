
public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task T1=new Task(1,3,3,7);
		Task T2=new Task(2,3,7,12);
		Task T3=new Task(3,5,20,20);
		
		Task[] T= {T1,T2,T3};
		
		
		
		DMS_Algo(T);
				
	}
	
	
	public static void DMS_Algo(Task[] T) {
		
		
		int taille = T.length;  
        Task tmp;  
        for(int i=0; i < taille; i++) 
        {
                for(int j=1; j < (taille-i); j++)
                {  
                        if(T[j-1].getDeadline_task() > T[j].getDeadline_task())
                        {
                                //echanges des elements
                                tmp = T[j-1];  
                                T[j-1] = T[j];  
                                T[j] = tmp;  
                        }
 
                }
        }
		float [][] R = new float[100][100] ;
		float [] F =new float[100] ;
		int a,b ;
		for(int i=0 ; i<T.length;i++) {
			
			R[i][0]=(float) T[i].getComputation_time();
			a=0;
			do {
				
				R[i][a+1]=T[i].getComputation_time()+somme(R[i][a],T,i);
				
				a=a+1;
				b=a;
				
			}while((R[i][a+1]<=T[i].getDeadline_task()) && (R[i][a]<R[i][a+1]));
			
			
			if(R[i][b]>T[i].getDeadline_task()) {
				System.out.println("Tasks are not schedulable by DMS");
				return;
			}
			else { F[i]=R[i][b] ;
			}
					}
		int r=0;
		for(int i=0;i<T.length;i++) {
			if(F[i]>T[i].getDeadline_task()) r=1;
			
			
		}
		if(r==0) System.out.println("Tasks are schedulable by DMS");
		
		
		
		
	}
	
	public static float somme(float a,Task[] T,int N) {
		float s =0;
		for(int k=1;k<N;k++) {
			s= (float) (s+(-Math.floor(-a/T[k].getPeriod_task()))*T[k].getComputation_time());
		}
		
		return s;
	}
	
	
}



