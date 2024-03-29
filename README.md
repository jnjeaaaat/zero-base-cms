## 개요
간단한 커머스 프로젝트

Use : Spring, Jpa, Mysql, Redis, Docker, AWS

### 목표
셀러와 구매자 사이를 중개해 주는 커머스 서버를 구축한다.

## 회원 서버
### 공통
- [x] 이메일을 통해서 인증번호를 통한 회원가입

### 고객
- [x] 회원 가입
- [x] 인증 (이메일)
- [x] 로그인 토큰 발행
- [x] 로그인 토큰을 통한 제어 확인 ( JWT, Filter를 사용해서 간략하게 )
- [ ] 예치금 관리

### 셀러
- [ ] 회원가입

## 주문 서버

### 셀러
- [ ] 상품 등록, 수정
- [ ] 상품 삭제

### 구매자
- [ ] 장바구니를 위한 Redis 연동
- [ ] 상품 검색 & 상세 페이지
- [ ] 장바구니에 물건 추가
- [ ] 장바구니 확인
- [ ] 주문하기
- [ ] 주문내역 이메일로 발송하기


# 📝 Pull Request Review example

Background
-
배경 : 인증에 **메일 서비스를 연동**하기로 하여 리서치 후 `mailgun`을 사용하기로 했다.

Change
-
기존 회원가입 로직에 이메일 인증을 통해 가입해야 하는 한 1step을 더 추가하였다.  
스크린샷.

Test
-
이메일 발송을통한 실 테스트 확인,  
테스트 코드 함께 작성

Analatics
-
성능 테스트 결과, 비용  
이메일 발송에 한건당 30원필요. 현재 가입추이로

Discuss
-
`ServiceA.java`에서  
`for문` 여러개로 작성 하였지만, 좋은 방법이라고 생각하지는 않습니다.  
혹시나 더 좋은 방법이 있으면 말씀해 주시면 적응 반영해 보겠습니다.