import java.util.*;

public class MyClass
 {
    
public static void main(String args[]) 
{
        
Scanner s=new Scanner(System.in);
        
int n=s.nextInt();
        
int a[]=new int[n];
       
 for(int i=0;i<n;i++)
        
a[i]=s.nextInt();
        
int f=0;
       
 for(int i=0;i<n;i++)
        
{
            
f=0;
            
for(int j=0;j<i;j++)
            
{
                
if(a[i]==a[j])
                
{
                    
f=1;
                    
break;
                
}
            
}
            
if(f==0)
            
{
                
for(int j=i+1;j<n;j++)
                
if(a[i]==a[j])
                
{
                
System.out.print(a[i]+" ");
                
break;
                
}
           
}
        
}
    
}

}