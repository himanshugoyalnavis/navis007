import java.util.*;

public class CreateUsers {
    public static void main(String[] args) {
        User user1=new User("user1","user1@gmail.com");
        User user2=new User("user2","user2@gmail.com");
        User user3=new User("user3","user3@gmail.com");
        User user4=new User("user4","user4@gmail.com");
        User user5=new User("user5","user5@gmail.com");
        User user6=new User("user6","user6@gmail.com");
        User user7=new User("user7","user7@gmail.com");
        User user8=new User("user8","user8@gmail.com");
//        User[] user =new User[5];
        ArrayList list=new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        System.out.println(list.size());
        List<User> l=list.subList(0,1);
        System.out.println(l.size());
        l.add(new User("user9","user9@gmail.com"));
        System.out.println(l.size());
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(l);
      //  list.remove(0);
        System.out.println(list);
     //   System.out.println(l);
        //list.remove(2);
        l.remove(0);
        System.out.println(list);
        System.out.println(l);
        Object obj=list.get(3);
     //   System.out.println(obj);
        User u=(User)list.get(3);
        System.out.println();
        //list.add(new Integer(10));
        Iterator<User> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getMailId());
        }
        TreeSet<User> tree=new TreeSet<>();
        tree.add(user1);
        tree.add(user2);
        tree.add(user3);
        tree.add(user4);
        System.out.println(tree.size());
        System.out.println(tree);
        HashMap<String,String> hash=new HashMap<>();
        hash.put("him","her");
      //  System.out.println(hash.put("him","her1"));
        System.out.println(hash);
       // <Map.Entry<String,String> s= hash.entrySet();
//        for(Map.Entry s1:s){
//            String key=s1.getKey()
//        }

    }
}
