class Solution {
    public boolean isValidSudoku(char[][] b) {
        int []arr = new int[10];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                if(b[i][j]=='.')continue;
                if(arr[b[i][j]-'0']==1)return false;
                else arr[b[i][j] -'0']++;
            }
            Arrays.fill(arr, 0);
        }

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                if(b[j][i]=='.') continue;
                if(arr[b[j][i]-'0']==1) return false;
                else arr[b[j][i]-'0']++;
            }
            Arrays.fill(arr,0);
        }
for (int row = 0; row < 9; row += 3) {
    for (int col = 0; col < 9; col += 3) {

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {

                if (b[i][j] == '.') continue;

                int num = b[i][j] - '0';

                if (arr[num] > 0)
                    return false;

                arr[num]++;
            }
        }

        Arrays.fill(arr, 0);
    }
}

        return true;
    }
}