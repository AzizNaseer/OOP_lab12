package S2;

import java.util.ArrayList;
import java.util.Arrays;

public class HumanResource {
    ArrayList <Association> arrayList=new ArrayList<>();
    private Association[] resources;

     public void add(Association a){
         arrayList.add(a);
        /*extend();
        for (int i=0;i<resources.length;i++){
            if (resources[i]!=null) resources[i]=resource;
        }
*/
    }
    public boolean delete(Association a) {
        return arrayList.remove(a);
      /*  Association temp[]= new Association[resources.length-1]; int i2=0; boolean removed = false;
        for (int i = 0; i < resources.length; i++) {
            if (resources[i].equals(a)){
               removed = true ;
            }
            else {if(i2<resources.length-1)
                temp[i2]=resources[i]; i2++;
            }

        }
        if(removed==true){
            resources = temp;
            return true;
        }
        return false;*/
    }
    private void extend(){
        if (resources==null) resources= new Association[1];
        else {
            Association temp[];
            temp=new Association[resources.length+1];
            for (int i=0;i< resources.length;i++){
                temp[i]=resources[i];
            }
            resources=temp;
        }

    }

    @Override
    public String toString() {
       // return "resources=" + Arrays.toString(resources);
        return new String()+arrayList;
    }
}
