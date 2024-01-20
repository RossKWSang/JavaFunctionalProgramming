### HTTP

- 총 재구성 연습 횟수 : 0
- 서버와 클라이언트가 웹에서 데이터를 주고받기 위한 프로토콜(규약)
- 참고
  - HTTP/1.1, HTTP/2는 TCP 기반 위에서 동작
  - HTTP/3는 UDP 기반 위에서 동작

- HTTP 특징
  - 클라이언트-서버 모델
  - 무상태 프로토콜(Stateless)
    - 서버가 클라이언트 상태를 유지하지 않음
    - 해결책 : Keep-Alive 속성 사용

- 비연결성(Connectionless)
  - 서버가 클라이언트 요청에 대해 응답을 마치면 맺었던 연결을 끊어 버림
  - 웹 상에서 불특정 다수와 통신이 가능하도록 만들어짐 -> 연결을 유지하여 생기는 자원낭비를 방지
  - 해결책 : 쿠키(클라이언트에 정보 저장), 세션(서버에 정보 저장), JWT
  
- HTTP 요청 메서드
  - GET, POST, PUT, DELETE 등
  - HTTP 응답 코드
    - 2XX, 3XX, 4XX, 5XX 등
  - HTTP 헤더
    - Content-type, Accept, Cookie, Set-Cookie, Authorization 등
