public class SeparateChainingHashSTTest{
	public static void main(String[] args) { 
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        st.put("S",0);
        st.put("E",1);
        st.put("A",2);
        st.put("R",3);
        st.put("C",4);
        st.put("H",5);
        st.put("E",6);
        st.put("X",7);
        st.put("M",8);
        assert(st.size()==8);
        assert(st.isEmpty()==false);
        st.delete("M");
        assert(st.size()==7);
        System.out.println(st.get("A"));
        System.out.println(st.contains("Z"));
        System.out.println("All Test Passed!!!");



    }
}