# 5장

## 요약
1. 객체는, 협력 속에서 어떤 행동을 다하는 녀석이고, 그 행동은 협력을 디자인 하는 관점에서는 어떻게 이뤄지는 지 자체는 크게 중요하지 않다. 그것까지 생각하면 너무 내용이 많기도 하고.. 이게 곧 캡슐화이자 자율성이다
2. 그렇기 때문에, 우리는 그냥 그 객체가 무엇을 할 수 있는 지만 정하면 된다. 그것이 곧 책임이고, 메시지에 대한 처리이며, 그게 모이면 역할이자 인터페이스가 되는 것이다.
3. 그리고 우리는 그 객체가 누구인지도 중요하지 않다. 그냥 그 행동을 할 수 있다는 사실만이 중요할 뿐. 이게 곧 다형성이기도 하다.

## 방관자효과
객체가 많을 수록, 책임은 작아진다.

책임을 명확히 나누지 않으면, 망한다.

## 자율적인 책임
너무 구체적이지도, 너무 추상적이지도 않은 책임이 중요

너무 구체적이면 자율적이지 못하고, 너무 추상적이면 의도 전달이 모호함.

행동 = 책임의 이유는 요청을 수신했기 때문

그러면 어떤 책임이 적절한가? -> 객체만 따로 생각해서는 알 수 없음

어떤 협력의 맥락 속에 속해있느냐를 먼저 봐야 함.

## 메시지
요청을 전달할 때, 메시지의 형태만 존재.

메시지는 "어떻게"가 아니라 "무엇을" 해야할지에 대해 설명해야 함.

메시지 전송 : 객체의 행동을 유발하는 행위

메시지는 메시지 이름, 인자, 수신자로 구성됨

## 메시지, 책임, 방법
메시지가 곧 행동 = 책임을 유발하므로, 메시지는 책임과 깊은 관련이 있음.

메시지를 기준으로 객체의 외부와 내부가 구분됨.

객체는 메시지를 처리할 방법을 자율적으로 선택할 수 있음.

외부, 내부의 구분은 객체의 자율성을 보장함.

메시지는 "무엇을", 메서드는 "어떻게"

객체는 런타임에 어떤 메서드를 실행할 지 선택할 수 있음. 이는 절차지향과 대조적

수신자가 메시지를 받는다는 것은 해당 행동을 수행할 책임을 받아들인다는 것임.

## 다형성
메시지와 메서드를 구분하기 시작하면, 다형성이 쉽게 이해됨.

송신자는 메시지를 보내고, 해당 책임이 이행되기를 기대함. 수신자가 그 책임을 어떻게 처리할 지는 볼 수 없음.

수신자는 메시지에 대한 처리 방법을 자율적으로 선택함. 그리고 이 방법(=메서드)는 여러가지가 될 수 있음.

즉, 1 메시지 - N 메서드의 관계가 성립하는 것.

동일한 메시지를 수신하더라도, 수신자의 종류의 따라 그 처리 방법은 달라짐.

메시지 = "증언하라", 수신자의 종류 = "앨리스", "모자 장수"

## 다형성과 역할, 책임, 협력
서로 다른 객체들이 다형성을 만족한다 = 서로 다른 객체들이 동일한 책임을 공유한다

메시지 송신자의 관점에서, 이 책임을 다하는 객체에 대한 정보는 극히 제한되어있음

역할이라는 아주 추상적인 정보만 가지고 있음 = 대체가능성

"수신자의 종류"를 캡슐화한다 = 역할은 책임의 추상화

다형성은 송신자와 수신자 간에 객체 타입에 대한 결합도를 메시지에 대한 결합도로 낮춘다.

즉, 구체적인 객체가 아니라 같은 일을 하는 객체면 된다. 그 메시지를 이해할 수 있고 처리할 수 있는 객체면 된다는 이야기

다형성은 협력을 유연하게 만든다. 다른 객체와도 협력할 수 있게 해주기 때문에

1. 협력이 유연해진다
<br> 송신자에 대한 파급효과 없이 유연하게 협력 대상 객체 변경 가능. 그 뒤에 누가 있는 지는 송신자는 모르고 알 필요도 없음
2. 협력의 수행 방식 확장 가능
<br> 수행 방식 = 메서드, 서로 다른 객체가 서로 다른 그 요청의 수행 방식을 가지고 있기 때문
<br> 협력을 확장하고 싶으면, 새로운 유형의 객체를 추가하기만 하면 됨
3. 협력이 수행되는 방식 재사용 가능
<br> 협력을 다양한 곳에 재활용 가능(3가지의 재판을 하나로)

객체 지향 시스템은 객체들의 연결망이다.

객체가 어떻게 할 것인지보다는 무엇을 할 것인지에 초점을 맞추기 떄문에 쉽게 갈아끼울 수 있다.

## 메시지를 숭배하라
다형성의 기반은 메시지 -> 즉 행위에 대한 요청

송신자 수신자는 메시지라는 얇은 끈으로만 연결되어 있음 = 낮은 결합도

객체지향 애플리케이션은 메시지를 통해 정의된다.

클래스가 아니라 객체를 봐야하고, 객체보다는 메시지를 봐야한다.

데이터를 중심으로 설계하면, 객체의 내부 구조를 먼저 객체 정의에 반영(아마 외부에서 볼 수 있는 정의인 듯?)한다.

이러면 객체의 자율성이 저해됨 객체의 내부 구조가 감춰지지 않으면

이 객체와 협력하는 다른 객체들은, 이 객체가 수정됐을 때 수정이 필요해질 가능성이 높다.

데이터, 내부 구조에 대한 결정을 뒤로 미루고 협력에 대한 맥락 안에서의 객체 행동을 고려해야만 진짜 중요한 것에 집중할 수 있다.

객체가 가져야할 가장 중요한 내용은, 다른 객체에게 행위를 제공하는 것이기 때문이다.

이는 곧 훌륭한 책임으로 이어진다.

결국 훌륭한 객체지향적 설계 = 어떤 객체가 어떤 메시지를 전송할 수 있고, 어떤 객체가 어떤 메시지를 이해할 수 있느냐를 중심으로 협력 관계를 구성하는 것.

메시지가 객체를 선택하게 해야 한다.

## 책임 주도 설계 다시보기
기능 = 시스템의 책임 -> 객체의 책임으로 나누기

객체가 책임을 처리하다가 자기가 못하는 게 나오면 다른 객체에게 요청

다른 객체에게 요청할 때 어떤 메시지가 필요한 지를 결정, 그리고 그 메시지를 수신하기 적합한 객체 선택.

이렇게 메시지를 수신 받는 객체는 책임이 생김.

## What Who 사이클
객체를 설계할 때, 그 객체에 특징에 따라 행위를 제공하는 게 아니고, 행위를 보고 객체를 찾는 것이다.

나는 맨날 "이런 객체니까, 이걸 해야해" 라고 생각했었는데, 그게 아니라 "이런 행동이 있고 이걸 해야하는 건 누굴까? 너가 좋겠다"로 가야한다는 것

객체의 책임(=행동)을 결정하는 것은 메시지, 처리가능한 메시지를 모은게 인터페이스

메세지를 먼저 결정해야, 인터페이스를 발견할 수 있음

## 묻지 말고 시키기
What Who 사이클을 따르면 인터페이스가 특유의 스타일을 따를 수밖에 없게 되는데, 그게 바로 디미터 법칙 또는 tell, don't ask 법칙이다.

어떤 객체가 필요한지 생각하지말고, 어떤 메시지가 필요할지 부터 생각해라.

메시지부터 생각하면 누가 수신할 지 알 수 없으므로, 수신자의 내부 구조를 신경쓰지 않게 됨 = 캡슐화 = 느슨한 결합

다른 객체의 상태를 묻는 것은 자율성을 침해한다.

어떻게가 아니라 무엇을!

## 메시지를 믿어라
객체의 종류(타입)는 중요하지 않다.

메시지를 이해할 수 있느냐가 중요.

## 인터페이스
인터페이스란 어떤 사물과 상호작용할 수 있게 해주는 접점이다.

인터페이스의 특징
1. 내부 구조나 동작 방식을 몰라도 쉽게 대상을 조작 / 의사를 전달 할 수 있다.
2. 인터페이스 자체는 변경하지 않고 내부 구조를 변경하는 것은 사용자에게 아무 영향도 끼치지 않는다.
3. 사물이 바뀌더라도 같은 인터페이스를 제공한다면, 사용자는 문제없이 사용할 수 있다.

자동차를 위 3가지에 대입해보자.

## 메시지와 인터페이스
메시지가 인터페이스를 만든다. 메시지가 유일한 외부와의 접점이기 때문.

객체지향의 객체가 가지는 인터페이스는 메시지 전송을 통해서만 접근 가능하다.

또한 메시지 송신자가 다른 객체인지 나 자신인지에 따라 사적/공적 인터페이스가 구분된다.

이 중 공적 인터페이스인 공용 인터페이스는 외부에 공개된 인터페이스이다.

공용 인터페이스는 객체가 외부로부터 수신할 수 있는 메시지의 목록으로 구성된다.

## 정리
협력에 참여하는 객체는 자율적이어야 한다.

메시지는 객체의 공용 인터페이스를 구성하고, 객체의 책임을 결정한다.

메서드는 메시지와 구분되는, 요청에 대한 처리 방식을 의미한다.

메시지와 메서드의 구분은 다형성을 가져온다.

## 객체지향적 사고 방식
1. 좀 더 추상적인 인터페이스
<br> 좀 더 추상적인 인터페이스(=메시지)를 이용하면 객체의 자율성을 더 보장할 수 있음
<br> (그러나 의도의 모호성이 생길 정도로 추상적이면 곤란하다)
2. 최소 인터페이스
<br> 외부에서 사용할 필요가 없는 인터페이스는 최대한 노출하지 말라
<br> 객체의 내부를 수정하더라도 외부에 미치는 영향을 최소화 할 수 있음
3. 인터페이스와 구현의 차이를 인식
<br> 이 둘을 구분 짓는 것은 메시지이다

## 구현
객체의 내부 구조와 작동방식은 구현이라고 부른다. 그러니까 공용 인터페이스가 아닌 것은 모두 구현이다.

메서드의 본문은 구현이라고 볼 수 있다.

## 인터페이스와 구현의 분리
객체의 내부와 외부를 분리해라 = 객체의 인터페이스와 구현을 분리해라.

훌륭한 객체는 구현을 모르지만, 인테페이스만 알면 쉽게 상호작용할 수 있는 객체를 의미한다.

왜 분리해야하는가? -> 소프트웨어는 항상 변경되기 때문에 최대한 변경이 파급되는 것을 줄이기 위함

또한 객체의 자율성을 늘릴 수 있다.

## 캡슐화
인터페이스와 구현을 분리하기 위한 설계 방법을 의미한다.

정보 은닉이라고 부르기도 한다.

두 가지 관점이 있다.
1. 상태와 행위의 캡슐화
<br> 객체를 상태와 행위의 조합으로 봤을 때의 관점. 데이터 캡슐화라고도 부름
2. 사적인 비밀의 캡슐화
<br> 개인적이고, 불안정한 비밀 = 내부 구현을 의미한다.

## 객체의 자율성
좀 더 나은 협력이란, 객체들이 더 자율적인 협력이다.

객체가 자율적이면 협력이 이해하기 쉽고, 변경에 유연하다.

객체의 책임이 얼마나 자율적인지가 전체 협력의 품질을 결정한다.

1. 자율적인 책임은 협력을 단순하게 만든다
<br> "무엇을"에 집중한 적당히 추상적인 메시지는, 그 책임을 의도가 드러나는 단순한 문장으로 만들어준다.
2. 자율적인 책임은 외부와 내부를 명확하게 분리한다.
<br> 자율적이라는 것은 그 방식을 마음대로 정할 수 있다는 것이고 이는 외부 내부를 구분했다는 뜻이다
3. 자율적인 책임은 내부의 방식이 변경되어도 외부에 영향을 끼치지 않는다.
<br> 모자 장수 예시에서, 자율적이지 못한 너무 구체적인 책임은 방식이 하나라도 변경되면 협력이 무너진다.
4. 자율적인 책임은 협력의 대상을 다양하게 선택할 수 있는 유연성을 제공한다.
<br> 어떠한 방식으로든 책임을 다하면 되기 때문에 대체 가능해진다. 그리고 "협력"을 재활용하기 쉬워진다.
5. 자율적인 책임은 이해하기 쉬운 역할을 만든다.
<br> 객체는 동일한 목적을 달성하는 강하게 연관된 책임(=행동)으로 구성되므로, 그 객체의 존재 이유(=역할)을 쉽게 알아낼 수 있다.