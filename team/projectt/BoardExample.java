package team.projectt;

import java.util.Scanner;

public class BoardExample {

	public static void main(String[] args) {
		String[][] board = new String[100][4];
		boolean loop = true;
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		
		while(loop) {
			System.out.println("--------------------------------------------");
			System.out.println("번호  제목\t\t\t글쓴이");
			System.out.println("--------------------------------------------");
			for(int i = idx-1; i>=0; i--) {
				if(board[i][0] == null) {
					continue;
				}
				System.out.println(board[i][0] + " " + board[i][1] + "\t\t\t" + board[i][3]);
			}
			System.out.println("--------------------------------------------");
			System.out.println("메뉴: 1. 생성 | 2. 보기 | 3. 수정 | 4. 삭제 | 5. 종료");
			System.out.print("선택: ");
			String selectNo = sc.nextLine();
			System.out.println("");
			
			if(selectNo.equals("1")) {
				System.out.println("[새글쓰기]");
				System.out.print("제목: ");
				board[idx][1] = sc.nextLine();
				System.out.print("글쓴이: ");
				board[idx][3] = sc.nextLine();
				System.out.print("내용: ");
				board[idx][2] = sc.nextLine();
				board[idx][0] = String.valueOf(++idx);
			}else if(selectNo.equals("2")) {
				System.out.print("게시물 번호: ");
				String contentNo = sc.nextLine();
				System.out.println("");
				System.out.println("[글 보기]");
				int contentNoInt = Integer.parseInt(contentNo) - 1;
				System.out.println("번호: " + board[contentNoInt][0]);
				System.out.println("제목: " + board[contentNoInt][1]);
				System.out.println("글쓴이: " + board[contentNoInt][3]);
				System.out.println("내용: " + board[contentNoInt][2]);
			}else if(selectNo.equals("3")) {
				System.out.print("게시물 번호: ");
				String contentNo = sc.nextLine();
				System.out.println("");
				System.out.println("[글 수정]");
				int contentNoInt = Integer.parseInt(contentNo) - 1;
				System.out.print("제목: ");
				board[contentNoInt][1] = sc.nextLine();
				System.out.print("내용: ");
				board[contentNoInt][2] = sc.nextLine();
			}else if(selectNo.equals("4")) {
				System.out.print("게시물 번호: ");
				String contentNo = sc.nextLine();
				int contentNoInt = Integer.parseInt(contentNo)- 1;
				board[contentNoInt][0] = null;
				board[contentNoInt][1] = null;
				board[contentNoInt][2] = null;
				board[contentNoInt][3] = null;
				
				if(idx-1 == contentNoInt) {
					--idx;
				}
				
//				for(int i = idx; i >= 1; i--) {
//					for(int j = idx-1; j >= 0; j--) {
//						if(board[j][0].equals(null)) {
//							board[j][0] = board[i][0];
//							board[j][1] = board[i][1];
//							board[j][2] = board[i][2];
//							board[j][3] = board[i][3];
//							board[i][0] = null;
//							board[i][1] = null;
//							board[i][2] = null;
//							board[i][3] = null;
//						}
//					}
//				}
				
			}else if(selectNo.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("선택 번호 다시 입력해주세요.");
			}
			
			
		}
		
		
	}

}
