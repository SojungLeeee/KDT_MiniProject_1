# 📖 신세계 아이앤씨 7차수_1차 미니프로젝트
<br>

## ✍🏻 프로젝트 소개

* **🗓 개발 기간** : 2024.12.04 ~ 2024.12.09  
* 신세계 아이앤씨 교육 과정 중 미니 프로젝트로 진행한 개인 프로젝트입니다.
* Java 환경 내에서 학생 정보 및 학과 정보를 가져오는 콘솔 기반 프로젝트입니다.  
* 본 프로젝트는 Java 및 MyBatis 기반으로 데이터베이스 CRUD 및 JOIN, 페이징 처리 등 실무 핵심 기능을 익히고자 진행했습니다.

<br>

### 🔍 구현 기능 목록

1. `tb_student` 학생 정보 전체 조회  
2. `tb_student` 학생 이름으로 조회  
3. `tb_student` 학생 입학년도 기준 조회  
4. `tb_student` 학생 학번 다중 조건 조회  
5. `tb_student` 학생 휴학 상태 일괄 수정  
6. `tb_department` 학과 정원 수정  
7. `tb_student` + `tb_class` + `tb_grade` 학생 학점 조회 (JOIN)  
8. `tb_student` 페이징 처리된 학생 정보 조회  

<br>

## 👥 팀원 구성 : 개인 프로젝트
| 이름 | 역할 | GitHub | 이메일 |
|------|------|--------|--------|
| 이소정 | 백엔드 개발 | [@SojungLeeee](https://github.com/SojungLeeee) | dlthwjd1118@gmail.com | 

<br>

## 🛠 개발 환경
<div> 
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white" /> 
  <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white" />
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white" />
  <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white" />
  <img src="https://img.shields.io/badge/mybatis-3DDC84?style=for-the-badge&logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIyNCIgaGVpZ2h0PSIyNCIgZmlsbD0id2hpdGUiPjxwYXRoIGQ9Ik0xMiAxYTIgMiAwIDEgMSAwIDQgMiAyIDAgMCAxIDAtNHptMC0xQTYgNiAwIDAgMC41IDggNiA2IDAgMCAwIDExIDIxYTQgNCAwIDAgMC0xLTJBNCA0IDAgMCAxIDEyIDF6Ii8+PC9zdmc+" />
</div>


- **언어** : Java 17  
- **빌드 도구** : Maven  
- **라이브러리** : MyBatis 3.5.14
- **데이터베이스** : MySQL 8.0.33  
- **실행 환경** : 콘솔 기반(CLI)  
- **IDE** : Spring Tool Suite 4 (STS)

<br>

## 💬 프로젝트 구조
```
KDT_MiniProject_1/
├── .classpath
├── .project
├── .settings/
├── bin/
├── src/
│   └── com/
│       └── example/
│           └── student/
│               ├── Main.java
│               ├── dao/
│               │   ├── DepartmentDAO.java
│               │   ├── GradeDAO.java
│               │   ├── StudentDAO.java
│               │   └── ClassDAO.java
│               ├── dto/
│               │   ├── DepartmentDTO.java
│               │   ├── GradeDTO.java
│               │   ├── StudentDTO.java
│               │   └── ClassDTO.java
│               ├── mapper/
│               │   ├── DepartmentMapper.java
│               │   ├── GradeMapper.java
│               │   ├── StudentMapper.java
│               │   └── ClassMapper.java
│               └── util/
│                   └── MyBatisUtil.java
├── resources/
│   ├── mybatis-config.xml
│   └── mapper/
│       ├── DepartmentMapper.xml
│       ├── GradeMapper.xml
│       ├── StudentMapper.xml
│       └── ClassMapper.xml
└── README.md

```


<br>

## 🗃 사용 테이블

- **tb_student** : 학생 정보
- **tb_department** : 학과 정보
- **tb_grade** : 학생별 성적 정보  
- **tb_class** : 강의 정보 및 수업 관련 데이터

<br>

---

<br>

### 메인 선택 화면

<img src="https://github.com/user-attachments/assets/78a90878-6bb8-4c7d-b22f-ebd7bfd12dca" width="500" /><br><br>

### 1. 학생 정보 조회

<img src="https://github.com/user-attachments/assets/0156216a-2b4d-4785-9d6e-5717395ef255" width="500" /><br><br>
<img src="https://github.com/user-attachments/assets/0d18fff1-d20a-42f3-bc96-f921b7589a12" width="500" /><br><br>

### 2. 학생 이름 조회

<img src="https://github.com/user-attachments/assets/17dd0839-f0d0-4d1d-a435-46c2e307159f" width="500" /><br><br>
<img src="https://github.com/user-attachments/assets/d90d1ace-575c-4916-8a14-d4cbfd3d68c6" width="500" /><br><br>

### 3. 학생 입학년도 조회

<img src="https://github.com/user-attachments/assets/1881e5b0-a966-43f1-b248-4ed16bd1fb2e" width="500" /><br><br>
<img src="https://github.com/user-attachments/assets/df1b160e-0b37-42b9-b307-bb934fcbb1d6" width="500" /><br><br>

### 4. 학생 학번 다중 조회

<img src="https://github.com/user-attachments/assets/e2ee58e2-c1bf-424c-ac9c-5b9a09136ea1" width="500" /><br><br>

### 5. 학생 휴학 일괄 수정

<img src="https://github.com/user-attachments/assets/39336be1-0f54-444b-b71b-1b37b8c0b689" width="500" /><br><br>
<img src="https://github.com/user-attachments/assets/eb44f133-ebf7-4508-afc5-db5bd5a1e178" width="500" /><br><br>

### 6. 학과 정원 수정

<img src="https://github.com/user-attachments/assets/02063e5a-f0b5-47f1-8329-7de856bf0572" width="500" /><br><br>

### 7. 학생 학점 조회

<img src="https://github.com/user-attachments/assets/357a8190-d209-479d-9233-ab5d4edd1ca3" width="500" /><br><br>

### 8. 학생 정보 조회 (페이징)

<img src="https://github.com/user-attachments/assets/21588922-9438-40a2-92d5-c82bd3e445d5" width="500" /><br><br>
<img src="https://github.com/user-attachments/assets/485e16b9-d449-4e34-bde1-d676de1d974b" width="500" /><br><br>

### 0. 종료

<img src="https://github.com/user-attachments/assets/4e8d09bb-4be2-4be5-ab7c-6bcf603bf4fe" width="500" /><br><br>


---
