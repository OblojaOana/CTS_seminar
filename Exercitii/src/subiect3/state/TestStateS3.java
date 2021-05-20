package subiect3.state;



public class TestStateS3 {
	public static void main(String[] args)
	{
		
		Examen examen=new Examen("CTS", 55);
		examen.sustinereExamen.sustineExamen(examen);
		
		examen.setExamen(TipExamen.ORAL);
		examen.sustinereExamen.sustineExamen(examen);
	
	}


}
