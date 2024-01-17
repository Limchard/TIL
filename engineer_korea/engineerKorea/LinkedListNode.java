//import java.util.LinkedList;
//
//class LinkedList2 {
//    Node2 header;
//
//    static class Node2 {
//        int data;
//        Node2 next = null;
//    }
//
//    LinkedList2() {
//        header = new Node2();
//    }
//}
//
//class Node2{
//    int data; // 보통 object를 넣는다.
//    Node2 next=null; // 마지막 node는 Null 값을 가지고 있어야 하니까(다음 node가 없기 때문) 초기값 null로 준다.
//    Node2(int d){ // Node를 생성할 때 값을 받아서 data에 넣겠다.
//        this.data=d;
//    }
//
//    void append(int d){
//        Node2 end = new Node2(d);
//        Node2 pointer=this; // 첫번째 노드를 선택하게 하고
//        while (pointer.next!=null){ // 가장 마지막 node를 찾기 위해서 반복문을 돌린다.
//            pointer=pointer.next;
//        }
//        pointer.next=end; // 새로 들어온 노드가 가장 마지막 노드가 된다.
//    }
//
//    void delete(int d){
//        Node2 pointer=this; // 임의의 포인터 생성... 일단 가장 처음을 선택하게 만든다.
//        while (pointer.next!=null){ // 지워야할 값을 찾기 위해 반복(마지막 노드가 아닐때 까지)
//            if (pointer.next.data==d){ // 내가 삭제해야할 node 라면
//                pointer.next=pointer.next.next; // node 주소를 다다음으로 넘기면 바로 다음 node는 사라진다.
//            } else { // 내가 삭제해야할 node가 아니라면
//                pointer=pointer.next; // 다음으로 넘어간다.
//            }
//        }
//    }
//
//    void retrieve(){
//        Node2 pointer=this;
//        while (pointer.next!=null){
//            System.out.print(pointer.data+"->");
//            pointer=pointer.next;
//        }
//        System.out.println(pointer.data);
//    }
//}
//
//
//public class LinkedListNode {
//    public static void main(String[] args) {
//        LinkedList ll=new LinkedList();
//
//
//
//
//
//    }
//}
//
//
