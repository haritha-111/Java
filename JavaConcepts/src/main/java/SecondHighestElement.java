import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class SecondHighestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrN = {20, 50, 60,30,10, 90};
		
		int len = arrN.length;
		 
		
		for (int i=0; i<len; i++)
			
		{
			for (int j=i+1; j<len; j++)
				
				if(arrN[i]<arrN[j])
					
				{
					int temp =arrN[i];
					arrN[i]=arrN[j];
					arrN[j]=temp;
					
					
		
		}
					
					
		}
		
		System.out.println("sorted array descendding order:");
		
		for(int i=0; i<len; i++)
			
		{
			System.out.println(arrN[i]);
		}
		
		if (len>2)
		{
			System.out.println("second largest:" + arrN[1]);
		}
			
	}

}
