package CC.Encycloped.Abs.Org.Comput.Soft.Ling.HTML;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_Nd;

public class String_Token extends Token
{
	static{
		Stat_Notif.Init_StRt(String_Token.class);}

	public static Clas_Rap Class;

	public String_Token(String String){super(String);}
	public String_Token(){}

	static{
		Init_Nd(String_Token.class);}
}