package part12_3.collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
    private int memberId;
    private String memberName;

    public Member2(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + " 입니다.";
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public int compare(Member2 o1, Member2 o2) {
        return o1.getMemberId() - o2.getMemberId();
    }

}
