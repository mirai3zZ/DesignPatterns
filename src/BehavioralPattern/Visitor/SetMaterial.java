package BehavioralPattern.Visitor;
import java.util.*;
//对象结构角色：材料集
public class SetMaterial {
    private List<Material> list=new ArrayList<Material>();
    public String accept(Company visitor)
    {
        Iterator<Material> i=list.iterator();
        String tmp="";
        while(i.hasNext())
        {
            tmp+=((Material) i.next()).accept(visitor)+" ";
        }
        return tmp; //返回某公司的作品集
    }
    public void add(Material element)
    {
        list.add(element);
    }
    public void remove(Material element)
    {
        list.remove(element);
    }
}
