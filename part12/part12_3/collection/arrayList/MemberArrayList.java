package part12_3.collection.arrayList;

import part12_3.collection.Member;

import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public void insertMember(Member member, int index) {
        ArrayList<Member> tempList = new ArrayList<>();
        for (int i = 0; i < index; i++) {
            tempList.add(arrayList.get(i));
        }
        tempList.add(member);
        for (int i = index; i < arrayList.size(); i++) {
            tempList.add(arrayList.get(i));
        }

        arrayList = tempList;
    }

    public boolean removeMember(int memberId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(i);
                return true;
            }
        }

        System.out.println(memberId + " 가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }

        System.out.println();
    }
}
