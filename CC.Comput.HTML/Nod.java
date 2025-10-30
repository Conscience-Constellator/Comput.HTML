package CC.Encycloped.Abs.Org.Comput.Soft.Ling.HTML;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.List.Ara_Util;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.HTML.Template.Registry;
import CC.Util.Conect.Nod.Tre_Nod;
import CC.Util.Nam.Nam_Havr_Abs;
import CC.Util.Object_Plus;
import org.jetbrains.annotations.NotNull;

public class Nod extends Object_Plus implements Tre_Nod, Nam_Havr_Abs
{
	public static final Clas_Rap Class=Init_StRt(Nod.class
		,Clas_Rap.class
	);/*Dep !done*/

	public Nod(Template Tmplat){this.Tmplat=Tmplat;}

	private Nod Stem;
		@Override public void Set_StM(Tre_Nod Stem){this.Stem=(Nod)Stem;}
		@Override public Nod Get_StM(){return Stem;}

	public Template Tmplat;
		@Override public void Set_Nam(String Nam){Tmplat=Registry.Get(Nam);}
		@Override public String Nam(){return Tmplat.Nam;}
	public String Txt;
		@Override public @NotNull String toString(){return '<'+Nam()+' '+Txt+'>';}

	private Nod[] Branch_List;
		@Override public void Ad_Branch(Tre_Nod Branch){Branch_List=Ara_Util.Ad(Branch_List,(Nod)Branch);}
		@Override public void Rem_Branch(Tre_Nod Branch){Branch_List=Ara_Util.Ad(Branch_List,(Nod)Branch);}

	static{Init_Nd(Nod.class);}
}