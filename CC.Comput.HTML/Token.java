package CC.Encycloped.Abs.Org.Comput.Soft.Ling.HTML;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

public class Token
{
	public static Clas_Rap Class=Init_StRt(Token.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Token(String String){Set_String(String);}
	public Token(){}

	public String String;
		public void Set_String(String String){this.String=String;}
		public String Get_String(){return String;}

	static{
		Init_Nd(Token.class);}
}