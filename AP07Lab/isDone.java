public boolean isDone(){
    int counter = 1;
    for(int i = 0;i < side;i++){
        for(int k = 0;k < side;k++){
            if(values[i][k] == counter){
                counter++
                }
            if(values[i][k] == 0){}
            else{
            return false;
            }
            }
            }
            return true;
            }
            
public boolean isDone(){
    for(int i = 0;i < side;i++){
        for(int k = 0;k < side;k++){
            if(k == 0){
                if((values[i][k+1] == values[i][k] + 1) || (values[i][k+1] == 0)){}
                }
            if(k == 3){ 
                if((values[i][k - 1] + 1 == values[i][k]) || (values[i][k-1] == 0)){}
                }
            if(k == 1 || k== 2){
                if((values[i][k] == values [i][k-1] + 1) && (values[i][k] == values[i][k+1] - 1) || values [i][k-1] == 0 || values [i][k+1] == 0 ){}
            }
            else{
            return false;
            }
            }
            }
            return true;
            }

public boolean isDone(){
    for(int i = 0;i < 16;i++){}
}
        
