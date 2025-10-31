✅ 구조 설명

- [ ] Domain : Member 클래스
- [ ] DTO: create request와 update request에 대응
- [ ] Repository: JPA활용, H2 기반
- [ ] Service:  유효성 검사와 find 기능, join 기능 수행
- [ ] Controller: Service와 Respostiory 연결, API 요청 처리
- [ ] Test: 단순히 Serive 클래스와 Repostiory 클래스 test 작성 

```
weonhyeok/spring_study/src
├─ main/java/spring_study/spring_study 
      ├─ controlelr 
      ├─ domain
      ├─dto
      ├─ repository
      ├─ service
      ├─ SpringStudyApplication.java 
 ├─test/java/spring_study/repository
      ├─ MemberRepoTest.java
      ├─ MemberService.Testjava
 ├─SpringStudyApplicationTest.java 
```

---

페이지는 localhost:8080/weonhyeok 에서 시작한다.

  1. /weonhyeok 페이지에 접속 시 H2 DB의 데이터를 가져온다. (없으면 없는대로 가져온다) 
  2. /weonhyeok/create  Get 요청 시 dto객체를 이용해 service join method 인수로 보낸다.  repository에 저장 후 /weonhyeok 페이지로 redirect 시킨다.
  3.  /weonhyeok/delete Post 요청 시 삭제 버튼을 누르면 tymeleaf 템플릿 엔진을 이용해 Model 도메인 ID 값도 같이 pathvariable로 담아 보낸다. Controller를 통해d에 맞는 DB행을 삭제한다. 
  4.  /weonhyeok/edit 요청 시 수정할 수 있는 페이지를 전송한다.
  5.  /weonhyeok/update 요청 시 DTO의 새로운 값을 기존에 존재했던 DB에 존재한 사용자 정보와 바꾼다. (편의상 setter 이용)

---
<br>

#### 실행 사진

<img width="551" height="301" alt="image" src="https://github.com/user-attachments/assets/8c5173f0-913e-4828-8f3f-515dbe22820b" />
<br>
<img width="535" height="248" alt="image" src="https://github.com/user-attachments/assets/2ca0a2a4-7bf2-4162-a372-b5666ebb7449" />

<img width="562" height="147" alt="image" src="https://github.com/user-attachments/assets/459e3917-dfc7-4f4e-84d6-01389bb58923" />
삭제


<img width="1108" height="427" alt="image" src="https://github.com/user-attachments/assets/2ce7b870-19fd-4cf2-9b3d-8c8d217ef060" />
postman으로 존재하지 않는 id값 삭제 요청 시 스프링부트 자바코드 내에서 예외를 발생시킨다.

