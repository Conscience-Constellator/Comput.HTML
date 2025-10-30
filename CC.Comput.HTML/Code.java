package CC.Encycloped.Abs.Org.Comput.Soft.Ling.HTML;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;

import static java.lang.Byte.parseByte;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Org.Syc.TXt.Rit.Red_AB;
import CC.Encycloped.Abs.Org.Syc.TXt.Text;
import CC.Encycloped.Abs.Org.Syc.TXt.Rit.Serbl;
import CC.Util.Bool.Point_Bool;
import CC.Util.Object_Plus;
import CC.Util.Prim.Int_Havr_Abs;
import CC.Util.Unusd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Code extends Object_Plus implements Red_AB,Serbl
{
	public static final Clas_Rap Class=Init_StRt(Code.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Code(byte Mod){this.Mod=Mod;}
	public Code(Object S)
	{
		this();
		Pars();
	}
	public Code(){this((byte)0);}
	@Override public void Red_Othr_Dispach(Object[] Contxt,String Par,Int_Havr_Abs Indx)
	{
		int A=Par.indexOf('|');
		Indx.Int$(parseByte(Par.substring(0,A)));
		int A_Plus=A+1;
		int B=Par.indexOf('\n',A_Plus);
		Mod=parseByte(Par.substring(A_Plus,B));
	}

	public ArrayList<Token> Tok_List=new ArrayList<>(100_0000);
		public void Ad_Tok(Token Token)
		{
			if(Tok_List.size()>100_0000)
			Tok_List.add(Token);
		}

		public int Indx=0;

	public byte Mod;
		public static final byte None=1;
		public static final byte In=2;
		public static final byte Out=4;

		public void Set_Mod(byte Mod){this.Mod=Mod;}
	public String String;
		public void Set_String(String String){this.String=String;}
		public String Get_String(){return String;}
	public int Red_Tok(String String,int Start,char Find)
	{
		int End=Text.Find_Or_End(String,Find,Start);
		Set_String(String.substring(Start,End));

		return End+1;
	}
		public int Red_Tag(String String,int Start)
		{
			int End=Red_Tok(String,Start,'>');
			Ad_Tok(new String_Token(Get_String()));

			return End;
		}
		public int Red_String(String String,int Start)
		{
			int End=Red_Tok(String,Start,'"');
			Ad_Tok(new String_Token(Get_String()));

			return End;
		}
		public int Red_Wit(String String,int Start)
		{
			int Nd=Red_Tok(String,Start,'"');

			return Nd;
		}
		public int Red_Unhandld(String String,int Strt)
		{
			int End=Red_Tok(String,Strt,'"');
			Ad_Tok(new String_Token(Get_String()));

			return End;
		}
	@Override public void Red(String Txt,int Indx,int Nd)
	{
		int Length=Txt.length();
		for(char Chr;Indx<Nd;)
		{
			Chr=Txt.charAt(Indx);
			//Indx=
				switch(Chr)
			{
				case '<':{Indx=Red_Tag(String,Indx+1);}
				case '"':{Indx=Red_String(String,Indx+1);}
				case ' ':{Indx=Red_Wit(String,Indx+1);}
				case '\t':{Indx=Red_Wit(String,Indx+1);}
				case '\n':{Indx=Red_Wit(String,Indx+1);}
				default:{Indx=Indx+1;}
			};
			/**Orient to the correct mode*//**switch(Mode)
			{
				case Out:
				case In:
				case None:
				{
					int a=Text.Find(Code,'<',Indx,Nd),b=Text.Find(Code,'>',Indx,Nd),p=0;
					if(a!=-1)
					{
						if(b!=-1)
						{
							int m=Math.min(a,b);
							Next(Code.substring(Indx,m));
							Indx=m+1;
						}
						else
						{
							Next(Code.substring(Indx,a));
							Indx=a+1;
						}
					}
					else
					{
						if(b!=-1)
						{
							Next(Code.substring(Indx,b));
							Set_Mode(Out);
							Indx=b+1;
						}
						else
						{
							Add_String(Code.substring(Indx));
							Indx=Length;
						}
					}
				}
			}**/
		}
	}
	public void Pars(){}

	@Override public void List_Pointg(Collection List,Point_Bool Filtr){}

	@Override public void Rit_Othr_Dispach(@Unusd Map<Object,Integer> Inst_Ke,StringBuilder Bildr)
	{
		Bildr.append(Indx);
		Bildr.append('|');
		Bildr.append(Mod);
	}

	static{Init_Nd(Code.class);}
}