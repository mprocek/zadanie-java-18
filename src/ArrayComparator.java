public class ArrayComparator {

    boolean compare(int[][] tabA, int[][] tabB){

        boolean isTheSame = true;

        if(tabA.length==tabB.length){
            for (int i=0; i<tabA.length; i++){
                for(int j=0; j<tabA[i].length; j++){
                    if(tabA[i].length==tabB[i].length){
                        if(tabA[i][j]!=tabB[i][j]){
                            isTheSame=false;
                            break;
                        }
                    } else  {
                        isTheSame=false;
                        break;
                    }
                }
            }
        } else {
            isTheSame=false;
        }
    return isTheSame;
    }
}
