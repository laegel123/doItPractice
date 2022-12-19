package part12_3.collection.treeSet;

import part12_3.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(1000, "이가을");
        Member memberNa = new Member(1001, "나유리");
        Member memberChoi = new Member(1002, "최정현");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberChoi);
        memberTreeSet.addMember(memberNa);
        memberTreeSet.showAllMember();

        Member memberChoi2 = new Member(1002, "최정현");
        memberTreeSet.addMember(memberChoi2);
        memberTreeSet.showAllMember();
    }
}
