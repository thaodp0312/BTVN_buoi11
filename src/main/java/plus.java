public  class plus {

    int cong(int a,int b){
        return (a+b);
    }

    int [] congmang(int [] m1, int [] m2){

        int [] m =new int[4];
        for (int i=0;i<4;i++){
            m[i]=m1[i]+m2[i];
        }
        return m;
    }
    boolean soduong(int x){
        if (x>0){
            return true;
        } else
            return false;
    }
}

