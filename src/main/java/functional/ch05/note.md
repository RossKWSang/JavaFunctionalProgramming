메서드를 그대로 넘기는 방법
Method Reference


기존에 이미 선언되어있는 메서드를 지정하고 싶을 때
:: 오퍼레이터 사용

생략이 많기 때문에 사용할 메서드의 매개변수의 타입과 리턴 타입을 미리 숙지해야 함

ClassName::staticMethodName
    - 클래스의 static method를 지정할 때

objectName::instanceMethodName
    - 선언된 객체의 instance method를 지정할 때

ClassName::instanceMethodName
    - 객체의 instance method를 지정할 때

ClassName::new
    - 클래스의 constructor를 지정할 때
