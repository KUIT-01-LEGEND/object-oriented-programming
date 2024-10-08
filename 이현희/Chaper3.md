# 3장
## 추상화란
지하철 노선도와 "추상화" 예시

"추상화"는 
1. 공통점의 일반화와 
2. 복잡한 디테일을 버리는 것으로 이루어진다.

## 개념
"객체"들은 "개념"이라는 것으로 묶인다.

"개념"이란 일반적으로 우리가 인식하고 있는 다양한 사물이나 "객체"에 적용 가능한, 아이디어나 관념을 의미한다.
예를 들면 자동차, 핸드폰 같은 것이다.

"개념"을 이용하면 "객체"를 "분류"할 수 있다.
"개념"은 "객체"를 "분류"하는 일종의 체이다.

"객체"에 어떤 "개념"을 적용해서 해당 "개념" 그룹의 일원이 되었을 때, 그 "객체"를 그 "개념"의 "인스턴스"라고 부른다.

"개념"은 
1. 심볼
2. 내연
3. 외연으로 이루어진다.

책의 예시에서 심볼은 이름, 즉 *트럼프*이고
내연은 그 "개념"의 특징, 즉 *납작하고 어쩌고 저쩌고 팔다리 있고*이고
외연은 해당 "개념"을 가진 "객체"의 집합, 즉 *하트 공주 정원사 어쩌고 저쩌고*이다.

"개념"을 통해 "분류", classficiation 할 수 있고, 여기서 class라는 이름이 나왔다.
"분류"라는 것은 어떤 "객체"를 어떤 개념 집합에 포함시킬 지를 의미하는 것이다.

"개념"을 통한 "분류"는 "추상화"의 두 가지 방식을 만족한다.
1. 공통점으로 묶어 일반화하고, 
2. 트럼프의 몇 가지 특징을 제외하곤 내다버렸다.

## 타입
"타입"이라는, "개념"과 같은 의미의 용어가 있다.

기계 레벨로 들어가면 같은 의미이긴 한데 좀 잿빛이 된다.
데이터가 메모리에 저장되면 010101011로 저장되고, 이를 어떻게 해석할 지를 정하며 타입 시스템이 생겼다.

1. "타입"은 데이터가 어떻게 사용되느냐에 관한 것. 즉 해당 데이터에 적용될 수 있는 연산이 무엇인지를 알아야 함.
2. "타입"에 속한 데이터를 메모리에 어떻게 표시하는 지는 철저히 "캡슐화"된다.

따라서 데이터 타입은 메모리에 저장된 데이터를 분류하는 데 사용하는 메타데이터이다. 데이터 타입으로 분류한다는 것은 어떤 종류의 연산이 해당 데이터에 적용될 수 있는 지를 암시한다.
전통적인 데이터 타입과 객체지향의 타입은 매우 유사하다.

우리가 객체지향에서 활용하는 "객체"는 데이터처럼 사용된다.
"객체"를 "타입"에 따라 "분류"하고 이름을 붙인다.

데이터 타입에 대한 두 가지 조건은 "객체"의 "타입"에도 정확히 적용된다.

1. "객체"가 어떤 "타입"인지를 정하는 것은 "객체"가 수행하는 "행동"이다. 같은 "행동"을 하는 두 "객체"는 같은 "타입"으로 분류될 수 있다.
2. "객체"의 내부적인 표현은 "캡슐화"된다. "상태"에 대한 이야기다.

*헉 객체가 행동으로만 분류된다고?? 이거 완전 인터페이스 아니냐?*
동일한 "행동" = 동일한 "책임" = 동일한 "메시지" 수신 ⇒ "다형성" ㄷㄷ

## 행동이 중요하다 2
"객체"는 "행동"으로만 "분류"된다.(Responsibility Driven Design)
전통적인 Data Driven Design과 달리.

"객체"를 결정하는 것은 "행동"이다.
데이터는 "행동"을 따를 뿐

## 슈퍼타입/서브타입, 일반화/특수화
사실 거기 등장인물들은 트럼프보다 좀 더 특화된 행동(걷기)를 하는 트럼프 인간이다.
트럼프가 트럼프 인간의 필요조건인 셈이다.
(개념 *집합* 이니까~)

이 집합에서의 포함관계는 "일반화"와 "특수화"의 개념이고 이 것은 순수하게 "행동"으로만 결정된다.
쟤랑 할 줄 아는 게 동일한데 내가 할 줄 아는 게 몇 개 더 많으면 내가 쟤의 "특수화"고 쟤는 나의 "일반화"임

"상태"가 더 있다고 해서 "특수화"가 아님!

이거 뭐 우리한테 익숙한 말로 "슈퍼타입"/"서브타입"이라고 부르는데
"서브타입"은 "슈퍼타입"보다 할 수 있는 게 많으니까, 대체할 수 있다.

"객체"들을 "슈퍼타입"의 관점으로 보는 것이 "일반화", "추상화"가 된다.
예를 들면 트럼프 인간 친구들을 트럼프라고 보는 것

"타입"은 "객체"에서 시간이라는 축을 제거하는, "추상화"이다.
동적인 "객체"를 정적으로 볼 수 있게 해준다는데... *정확히 이해가 안됨*
이로인해 복잡성이 매우 감소한다.

"객체"에 대한 모델은 정적모델(설계)와 동적모델(실제)로 어떻게 동작하는지 2가지가 있다.

"타입"을 구현하는 가장 대표적인 방법이 클래스. 다른 여러 방법도 있다.
클래스로 "타입" 구현 말고 다른 걸 하기도 한다.

**"객체"를 분류하는 기준은 "타입"이고, "타입"을 나누는 기준은 "행동"이다.**
"타입"을 결정했으면, 그걸 구현하는 방식 중 하나가 클래스이다.