import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.dao.StudentDAO;
import com.dto.ClassesDTO;
import com.dto.GradeDTO;
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
			System.out.println("2. 학생 이름 검색");
			System.out.println("3. 학생 입학년도 범위 검색");
			System.out.println("4. 학생 학번으로 다중 검색 (쉼표 구분자)");
			System.out.println("5. 학생 휴학 일괄 수정");
			System.out.println("6. 학과 정원 일괄 수정");
			System.out.println("7. 학생 학점 검색");
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
			} else if ("2".equals(input_num)) {
				System.out.printf("검색할 학생명을 입력하시오 => ");
				String StuName = scan.next();
				List<StudentDTO> list = service.findByLikeStuName(StuName);
				
				System.out.println("======================================================================");
				System.out.println("학번 \t 이름 \t 주민번호 \t\t 주소 \t\t 입학년도 \t\t 휴학여부");
				System.out.println("----------------------------------------------------------------------");
				
				for (StudentDTO studentDTO : list) {
					System.out.printf("%s\t%s\t%s\t%s\t%s\t%c",
							studentDTO.getStuNo(),studentDTO.getStuName(),
							studentDTO.getStuSsn(),studentDTO.getStuAddress(),
							studentDTO.getEntDate(),studentDTO.getAbsYn());
					System.out.println();
				}
				//전체 학생 수 출력
				System.out.println("총 학생수 : " + list.size()+" 명");
			} else if ("3".equals(input_num)) {
				System.out.printf("시작 입학년도를 입력하시오 => ");
				String StartYear = scan.next();
				System.out.printf("끝 입학년도를 입력하시오 => ");
				String EndYear = scan.next();
				
			    HashMap<String, String> map = new HashMap<>();
			    map.put("StartYear", StartYear);
			    map.put("EndYear", EndYear);
			    List<StudentDTO> list = service.findByEntDate(map);

				System.out.println("======================================================================");
				System.out.println("학번 \t 이름 \t 주민번호 \t\t 주소 \t\t 입학년도 \t\t 휴학여부");
				System.out.println("----------------------------------------------------------------------");
				for (StudentDTO studentDTO : list) {
					System.out.printf("%s\t%s\t%s\t%s\t%s\t%c",
							studentDTO.getStuNo(),studentDTO.getStuName(),
							studentDTO.getStuSsn(),studentDTO.getStuAddress(),
							studentDTO.getEntDate(),studentDTO.getAbsYn());
					System.out.println();
				}
				//전체 학생 수 출력
				System.out.println("총 학생수 : " + list.size()+" 명");
				
			} else if ("4".equals(input_num)) {
				System.out.printf("검색할 학생의 학번을 입력하시요 => ");
				String multiStuno = scan.next();
			    String [] StuNos = multiStuno.split(",");
			    List<String> noList = new ArrayList<String>();
			    //학번을 크기만큼 noList에 추가시키기
			    for(int i=0; i<StuNos.length; i++) {
			    	noList.add(StuNos[i]);
			    } //이 noList가 넘겨줄 파라미터가 됨
			    List<StudentDTO> list = service.findByStuNo(noList);
			    
				System.out.println("======================================================================");
				System.out.println("학번 \t 이름 \t 주민번호 \t\t 주소 \t\t 입학년도 \t\t 휴학여부");
				System.out.println("----------------------------------------------------------------------");
				for (StudentDTO studentDTO : list) {
					System.out.printf("%s\t%s\t%s\t%s\t%s\t%c",
							studentDTO.getStuNo(),studentDTO.getStuName(),
							studentDTO.getStuSsn(),studentDTO.getStuAddress(),
							studentDTO.getEntDate(),studentDTO.getAbsYn());
					System.out.println();
				}
				//전체 학생 수 출력
				System.out.println("총 학생수 : " + list.size()+" 명");


			} else if ("5".equals(input_num)) {
				System.out.printf("수정할 학생의 학번을 입력하시오 => ");
				String multiStuno = scan.next();
			    String [] StuNos = multiStuno.split(",");
			    List<String> noList = new ArrayList<String>();
			    //학번을 크기만큼 noList에 추가시키기
			    for(int i=0; i<StuNos.length; i++) {
			    	noList.add(StuNos[i]);
			    } //이 noList가 넘겨줄 파라미터가 됨
			    
			    int updateNum = service.UpdateAbsYn(noList);
			    
				System.out.println("================================================================");
				System.out.println("학번 \t 이름 \t 주민번호 \t\t 주소 \t\t 입학년도 \t\t 휴학여부");
				System.out.println("----------------------------------------------------------------");
				//변경 수 출력
				System.out.println("총 변경된 학생수 : "+updateNum+" 명");
			} else if ("6".equals(input_num)) {
				int updateCapacityNum = service.updateCapacity();
				System.out.println("총 변경된 학생수 : "+updateCapacityNum+" 명");
			} else if ("7".equals(input_num)) {
				System.out.printf("학생의 학번을 입력하시오 => ");
				String stuNo = scan.next();
				System.out.println("================================================================================");
				System.out.println("학기 \t 학번 \t\t 이름 \t\t 과목명 \t\t 점수 \t 학점");
				System.out.println("--------------------------------------------------------------------------------");
				List<StudentDTO> list = service.findGrade(stuNo);

			    for (StudentDTO studentDTO : list) {
			        for (GradeDTO gradeDTO : studentDTO.getGradeList()) {
			            // 각 학기의 학번, 이름, 학기, 과목명, 점수, 등급 출력
			            System.out.printf("%s \t %s \t %s \t\t %s \t %.2f \t%s\n", 
			                    gradeDTO.getTerm_no(), studentDTO.getStuNo(), studentDTO.getStuName(),
			                    gradeDTO.getClasses().getClass_name(), gradeDTO.getPoint(),gradeDTO.getGrade());
			        }
			    }
			}
			else {
				scan.close();
				System.out.println("프로그램 종료");
				System.exit(0); //프로그램 종료
			}
		
		} //end while

	}

}
