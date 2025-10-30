package CC.Encycloped.Abs.Org.Comput.Soft.Ling.HTML;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Util.Reg.Reg_Nam_Abs;
import CC.Util.Reg.Reg_Abs.Registry;

public class Template extends Reg_Nam_Abs.Reg_Nam
{
	public static final Clas_Rap Class=Init_StRt(Template.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Template(String Nam){super(Nam);}

	public static final Registry<Template> Registry=new Registry<>
	(
		"HTML template"
	);

	static{Init_Nd(Template.class);}
}