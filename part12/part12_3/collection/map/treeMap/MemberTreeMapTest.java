package part12_3.collection.map.treeMap;

import part12_3.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap map = new MemberTreeMap();

        Member memberLee = new Member(1001, "이가을");
        Member memberNa = new Member(1002, "나유리");
        Member memberChoi = new Member(1003, "최정현");

        map.addMember(memberLee);
        map.addMember(memberNa);
        map.addMember(memberChoi);

        map.showAllMember();

        map.removeMember(1003);
        map.showAllMember();
    }
}
