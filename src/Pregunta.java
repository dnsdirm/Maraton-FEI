

public class Pregunta {
	private int numero;
	private String pregunta;
	private String a ;
	private String b ;
	private String c ;
	private String d ;
	private String respuesta;
	
	public Pregunta(int numero, 
					String pregunta, 
					String a, 
					String b, 
					String c, 
					String d, 
					String respuesta)
	{
		this.numero = numero;
		this.pregunta = pregunta;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.respuesta = respuesta;
	}

	public int getNumero() 		{ return numero; }
	public String getPregunta() { return pregunta; }
	public String getA() 		{ return a; }
	public String getB() 		{ return b; }
	public String getC() 		{ return c; }
	public String getD() 		{ return d; }
	public char getRespuesta()
	{
		/*
		if(respuesta.toLowerCase().charAt(0) == 'a' )
			return a;
		else if(respuesta.toLowerCase().charAt(0) == 'b')
			return b;
		else if(respuesta.toLowerCase().charAt(0) == 'c')
			return c;
		else if(respuesta.toLowerCase().charAt(0) == 'd')
			return d;
		else
			JOptionPane.showMessageDialog(null, "No hay respuesta");
		return null;
		*/
		return respuesta.charAt(0);
	}
	public String ToString() 	{ return numero + " -> " + pregunta;}
	
	public static void main(String[] args) {
		
	}
	
}