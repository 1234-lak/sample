package qedge.aug29;

public class MultiDimension {

	public static void main(String[] args) {
		// store login data into array
		String login [][]=new String[4][2];
		//first row first cell data
		login[0][0]="admin1";
		//first row second cell
		login[0][1]="test1";
		//second row first cell data
		login[1][0]="admin2";
		//second row second cell data
		login[1][1]="test2";
		//third row first cell data
		login[2][0]="admin3";
		//third row second cell
		login[2][1]="test3";
		//fourth row first cell data
		login[3][0]="admin4";
		//fourth row second cell data
		login[3][1]="test4";
		System.out.println(login[1][1]);
		System.out.println(login[2][0]);
		//print array length
		System.out.println(login.length);
		//print row cell length
		System.out.println(login[0].length);
		//iterate all rows
		for (int i = 0; i < login.length; i++) {
			//iterate each row cell
			for (int j = 0; j < login[i].length; j++) {
				System.out.print(login[i][j]+"\t");
				}
			System.out.println();
				
				
				

		}
		
		
		
			}
		
			
		}
		
		
	

