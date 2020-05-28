// WAP to make a simple calculator
public class Calculator
{
    int num1,num2,ans;
    char ch;
    void init( int n1, int n2, char op)
    {
        num1=n1;
        num2=n2;
        ch =op;
    }
    void calc()
    {
        if(ch=='+')
        {
            ans =num1+ num2;
            
            }
            else if(ch=='-')
            {
                ans =num1-num2;
                
            }
            else if(ch=='*')
            {
                ans=num1*num2;
                
            }
            else if(ch=='/')
            {
                ans = num1/num2;
                
                }
                else if (ch=='%')
                {
                    ans= num1%num2;
                    
                    }
                   else
                   {
                       System.out.println("invalid");
                    }
                }
                void display()
                {
                    System.out.println(ans);
                }
                }
            
                                                           
        