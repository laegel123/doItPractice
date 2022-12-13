package part12_3.collection.arrayList;

import part12_3.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();
        Member memberLee = new Member(1001, "이가을");
        Member memberNa = new Member(1002, "나유리");
        Member memberChoi = new Member(1003, "최정현");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberNa);
        memberArrayList.addMember(memberChoi);


        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberChoi.getMemberId());
        memberArrayList.showAllMember();

        memberArrayList.insertMember(memberChoi, 0);
        memberArrayList.showAllMember();
    }
}
