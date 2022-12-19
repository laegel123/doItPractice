package part12_3.collection.map.hashMap;

import part12_3.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이가을");
        Member memberNa = new Member(1002, "나유리");
        Member memberChoi = new Member(1003, "최정현");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberNa);
        memberHashMap.addMember(memberChoi);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1003);
        memberHashMap.showAllMember();
    }
}
