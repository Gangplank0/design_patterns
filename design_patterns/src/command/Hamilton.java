package command;
/**
 * @todo
 * @author 成明俊
 * @email 1047914020@qq.com
 * @date 2019年11月6日
 */
public class Hamilton {
	public static void Hamiltonsuan(int n) {
		int i;
		int max =100;
		int[][] c =new int[4][2];
		int[] visited = new int[max];
		int[] x = new int[max];
		int k;
		c[0][1]=1;
		c[1][0]=1;
		c[1][2]=1;
		c[2][1]=1;
		c[2][3]=1;
		c[3][2]=1;
		for(i=0;i<n;i++) {
			x[i]=0;
			visited[i] = 0;
		}
		k=0;
		visited[0]=1;
		x[0] =0;
		k=k+1;
		while(k>=0) {
			x[k]=x[k]+1;
			while(x[k]<n) {
				if(visited[x[k]]==0&&c[x[k-1]][x[k]]==1) {
					break;
				}else {
					x[k]=x[k]+1;
				}
			}
			if(x[k]<n&&k==n-1&&c[x[k]][0]==1) {
				for(k=0;k<n;k++) {
					System.out.print(x[k]);
				}
				System.out.print(x[0]);
				return;
			}else if(x[k]<n&&k<n-1) {
				visited[x[k]]=1;
				k=k+1;
			}else {
				x[k]=0;
				visited[x[k]]=0;
				k=k-1;
			}
		}
	}
	 public static void main(String[] args) {
		 Hamiltonsuan(10);
	 }



}
