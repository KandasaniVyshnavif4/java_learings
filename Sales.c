#include<stdio.h>
int main()
{
    int n , i;
    int target = 500;
    int sales[100];
    printf("enter the value of n");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        printf("enter the value of sales for day %d",i);
        scanf("%d",&sales[i]);
        
    }
    int count = 0;
    int total_count = 0;
    for(i=1;i<=n;i++)
    {
        if (sales[i] >= target)
        {
            count ++;
            if(count > total_count)
            {
                total_count = count;
            }
        }
        else
        {
            count = 0;
        }
    }
    printf("tital coun t you want is %d",total_count);
    
    
}
