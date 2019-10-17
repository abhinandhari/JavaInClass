package hash;

public class HashTable {

	int size=997;
	HashNode[] harr=new HashNode[size];
	
	public int Hash(int x){
		return(x*x*x+3*x*x*x+x+1)%size;
		
	}
	
	public void put(int k,int v)
	{
		int index=Hash(k);
		HashNode hn=new HashNode(k,v);
		harr[index]=hn;
		
	}
	
	public int get(int k) {
	HashNode hn= harr[Hash(k)];
	if(hn==null)
		return -1;
	else
		return hn.value;
	}
	
	public boolean contains(int k) {
		if(harr[k]!=null ) {
			return true;
		}
		else 
			return false;
	}
		 
		public void print(int k){
          for(int i=0;i<harr.length;i++) {
				if(harr[i]!=null)
					System.out.println("<"+harr[i].key + ","+harr[i].value);
			}
		
		}
		}

