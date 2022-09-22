package day02.basic;

/*
 * 성적
 * result = 75 변수선언
 * 
 * 90점 이상이면 수
 * 90미만 80점 이상이면 우
 * 80미만 70점 이상이면 미
 * 70미만 60점 이상이면 양
 * 나머지 가
 * 
 * 성적 : 경과값 수,우,미,양,가 중 한개
 */

public class MainClass09 {
	public static void main(String[] args) {
		int num = 75;
		
		if(num >= 90) {
			System.out.println("수");
		}
		else if(num >= 80 ) {
			System.out.println("우");
		}
		else if(num >= 70 ) {
			System.out.println("미");
		}
		else if(num >= 60) {
			System.out.println("양");
		}
		else {
			System.out.println("가");
		}
	}

}
