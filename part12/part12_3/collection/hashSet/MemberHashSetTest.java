package part12_3.collection.hashSet;

import part12_3.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이가을");
        Member memberNa = new Member(1002, "나유리");
        Member memberChoi = new Member(1003, "최정현");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberNa);
        memberHashSet.addMember(memberChoi);

        memberHashSet.showAllMember();

        Member memberChoi2 = new Member(1003, "최정현");
        memberHashSet.addMember(memberChoi2);
        memberHashSet.showAllMember();
    }
}
