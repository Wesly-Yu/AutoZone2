package Test001;

public class JustDemo {
    public static void main(String[] args) {
        //冒泡排序算法
        int[] a={6,32,55,21,8,1,78,14,66};
        System.out.println("排序前的数组为：");
        for(int n:a){
            System.out.println(n+"");
        }
        System.out.println();
        int temp;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }

        }
        System.out.println("冒泡排序后的数组为：");
        for(int n:a){
            System.out.println(n+"  ");
        }
    }


}

