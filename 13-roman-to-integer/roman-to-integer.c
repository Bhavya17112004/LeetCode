int romanToInt(char* s) {
    short int result=0;
    int len = strlen(s);
    for(int i=0;i<len;i++){
        switch(s[i]){
            case 'I':result+=1;
            break;

            case 'V':if(i>0 && s[i-1]=='I'){
                result=result-1+4;
            }
            else{
                result+=5;
            }
            break;

            case 'X':if(i>0 && s[i-1]=='I'){
                result=result-1+9;
            }
            else{
                result+=10;
            }
            break;

           case 'L':if(i>0 && s[i-1]=='X'){
                result=result-10+40;
            }
            else{
                result+=50;
            }
            break;

           case 'C':if(i>0 && s[i-1]=='X'){
                result=result-10+90;
            }
            else{
                result+=100;
            }
            break;

           case 'D':if(i>0 && s[i-1]=='C'){
                result=result-100+400;
            }
            else{
                result+=500;
            }
            break;

           case 'M':if(i>0 && s[i-1]=='C'){
                result=result-100+900;
            }
            else{
                result+=1000;
            }
            break; 
        }
    }
    return result;
}