### CGI (Common Gateway Interface)

- 웹 서버와 어플리케이션 사이에 데이터를 주고받는 규약
- CGI 규칙에 따라 만들어진 프로그램을 CGI 프로그램이라고 함
- CGI 프로그램의 종류로는 컴파일 방식(C, C++, Java 등)과 인터프리터 방식(PHP, Python 등)이 있음

---

아래방식 모두 CGI 방식을 사용하여 데이터를 주고 받는다.

- 인터프리터 방식 CGI 프로그램
  - [웹 서버] <-> [Script engine] <-> [Script 파일]
  
  <br>

- 서블릿과 서블릿 컨테이너
  - [웹 서버] <-> [Servlet Container] <-> [Servlet 파일]

---

### Servlet (Server + Applet의 합성어)

- 자바에서 웹 어플리케이션을 만드는 기술
- 자바에서 동적인 웹 페이지를 구현하기 위한 표준

---

### Servlet 컨테이너

- Servlet의 생성부터 소멸까지의 라이프 사이클을 관리하는 역할
- Servlet 컨테이너는 웹 서버와 소켓을 만들고 통신하는 과정을 대신 처리해준다. 개발자는 비즈니스 로직에만 집중하면 된다. (그럼 이걸 왜 알고 있어야하지?)
- Servlet 객체를 싱글톤으로 관리 (인스턴스 하나만 생성하여 공유하는 방식)
  - 상태를 유지(stateful)하게 설계하면 안됨
  - Thread safety하지 않음

---

### WAS vs. Servlet 컨테이너

  - WAS는 서블릿 컨테이너를 포함하는 개념
  - WAS는 매 요청마다 스레드 풀에서 기존 스레드를 사용함
  - WAS의 주요 튜닝 포인트는 max thread 수
  - 대표적인 WAS로는 톰캣이 있음

---

### Counter 예제

  - Counter는 스레드이다
  - 싱글톤 스레드 인스턴스가 생태값을 가진다면 Race Condition이 생길 여지가 많음


### Servlet 인터페이스
  - Servlet 컨테이너가 Servlet 인터페이스에 있는 메서드들을 호출함
  - Servlet 생명주기와 관련된 메서드
    - init(), service(), destroy()
  - Servlet 기타 메서드
    - getServletConfig()
    - getServletInfo()

  - 왜 Servlet를 학습해야할까?
    - Spring MVC의 핵심이 되는 Dispatcher Servlet을 이해하기 위함