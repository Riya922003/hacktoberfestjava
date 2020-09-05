public class link{
    Node head;
    link(){
        head = null;
    }
    public void insert(int a){
        Node newnode = new Node();
        newnode.data = a;
        newnode.next = null;
        if(this.head==null){
            this.head = newnode;
        }
        else{
            Node temp = this.head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newnode; 
        }
    }
    public void show(){
        Node itr;
        itr = this.head;
        while(itr!=null){
            System.out.print(itr.data+"-->");
            itr = itr.next;
        }
        
        System.out.println();
    }
    public void delete(int a){
        Node temp, prev;
        temp = this.head;
        prev = this.head;
        while(temp.next!=null){
            if(temp.data==a){
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Data not found Please Try again");
        }
        else if(temp.next==null){
            prev.next=null;
            // temp=null;
            show();
        }
        else{
            prev.next=temp.next;
            // temp=null;
            show();
        }
    }
}
