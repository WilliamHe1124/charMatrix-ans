
/**
 * 在这里给出对类 charMatrix 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class charMatrix
{
    char[][] myarr;
    
    public charMatrix(int rows, int cols){
        myarr=new char[rows][cols];
        for (int i=0;i<rows;i++){
            for (int x=0;x<cols;x++)
            myarr[i][x]=' ';
        }
    }
    
    public charMatrix(int rows, int cols, char fill){
        myarr=new char[rows][cols];
        for (int i=0;i<rows;i++){
            for (int x=0;x<cols;x++)
            myarr[i][x]=fill;
        }
    }
    
    public void display(){
        for (int i=0;i<myarr.length;i++){
            for (int x=0;x<myarr[0].length;x++){
            System.out.print(myarr[i][x]);
            }
            System.out.println();
        }
    }
    
    public int numRows(){
        return myarr.length;
    }

    public int numCols(){
        return myarr[0].length;
    }

    public char charAt(int row, int col){
        return myarr[row][col];
    }

    public void setCharAt(int row, int col, char ch){
        myarr[row][col]=ch;
    }
    
    public boolean isEmpty(int row, int col){
        return (myarr[row][col]==(' '));
    }

    public void fillRect(int row0, int col0, int row1, int col1, char fill){
        for (int i=row0;i<row1;i++){
            for (int x=col0;x<col1;x++)
            myarr[i][x]=fill;
        }
    }
    
    public void clearRect(int row0, int col0, int row1, int col1){
        for (int i=row0;i<row1;i++){
            for (int x=col0;x<col1;x++)
            myarr[i][x]=' ';
        }
    }
    
    public int countInRow(int row){
        int ans=0;
        for (int i=0;i<myarr[row].length;i++){
            if (myarr[row][i]!=' ')ans++;
        }
        return ans;
    }
    
    public int countInCol(int col){
        int ans=0;
        for (int i=0;i<myarr.length;i++){
            if (myarr[i][col]!=' ')ans++;
        }
        return ans;
    }
}
