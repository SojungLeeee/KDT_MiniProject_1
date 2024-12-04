import java.util.List;
import java.util.Scanner;

import com.dao.StudentDAO;
import com.dto.StudentDTO;
import com.service.StudentService;
import com.service.StudentServiceImpl;


public class StudentMain {

	public static void main(String[] args) {
		//코드 한번만 작성하도록 while 문 밖에 작성
		StudentService service = new StudentServiceImpl();
		service.setDAO(new StudentDAO());
	
		//Scanner 로 얻어와야 함
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("*****************************************");
			System.out.println("\t [학생 정보 관리 메뉴]");
			System.out.println("*****************************************");
			System.out.println("1. 전체 학생 목록");
			System.out.println("0. 종료");
			System.out.println("*****************************************");
			System.out.printf("메뉴 입력 => ");
			
			String input_num = scan.next();
			if("1".equals(input_num)) {
				System.out.println("======================================================================");
				System.out.println("학번 \t 이름 \t 주민번호 \t\t 주소 \t\t 입학년도 \t\t 휴학여부");
				System.out.println("----------------------------------------------------------------------");
				List<StudentDTO> list = service.findAll();
				
				for (StudentDTO studentDTO : list) {
					System.out.printf("%s\t%s\t%s\t%s\t%s\t%c",
							studentDTO.getStuNo(),studentDTO.getStuName(),
							studentDTO.getStuSsn(),studentDTO.getStuAddress(),
							studentDTO.getEntDate(),studentDTO.getAbsYn());
					System.out.println();
				}
				//전체 학생 수 출력
				System.out.println("총 학생수 : " + list.size()+" 명");
			}
			else if ("2".equals(input_num)) {
				System.out.println("2번 클릭");
			}
			else {
				scan.close();
				System.out.println("프로그램 종료");
				System.exit(0); //프로그램 종료
			}
		
		} //end while

	}

}