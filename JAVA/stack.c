#include<stdio.h>
char s[50];
int top=-1;
char TOP(){
    return s[top];
}

void push(char data){
    top++;
    s[top]=data;
}

char pop(){
    char tmp;
    tmp=s[top];
    top--;
    return tmp;
}

int ifempty(){
    if(top==-1){
        return 1;
    }
    else
        return 0;
}

int checksymb(char symbol){
    if((symbol>=65 && symbol <=90) || (symbol>=97 && symbol <= 122)){
        return 1;
    }
    else
        return 0;
}

int precedence(char ch){
    if(ch==3)
        return 3;
    if(ch=='*' || ch=='/')
        return 2;
    if(ch=='+' || ch=='-')
        return 1;
    
    return 0;
}

void infix_to_postfix(char infix[50])
{
    int pos=0;
    char symbol,topsymbol;
    char postfix[50]=" "; 
    
    for(int i=0;infix[i]!='\0';i++)
    {
        symbol = infix[i];
        if(checksymb(symbol))
        {
            postfix[pos] = symbol;
            pos++;
        }
        else if(symbol == '(')
            push(symbol);
        else if(symbol == ')')
        {
            topsymbol=pop();
            while(topsymbol != '(')
            {
                postfix[pos]=topsymbol;
                pos++;
                topsymbol=pop();
            }
        }
        else
        
    }
}


int main(){
    
    
    return 0;

}