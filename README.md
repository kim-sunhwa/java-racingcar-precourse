# 자동차 경주 게임

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정

* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

<br>

## 기능 목록

#### 입력

* 사용자가 입력한 자동차는 이름목록
    * 쉽표 기준으로 분리 한다. - 기능
    * 경주를 위해 최소 2대 이상의 이름을 입력해야 한다. - 예외
    * 2대 이상은 쉼표로 분리된 이름이 2개이상 있어야 한다. - 예외 (pobi,)
    * 중복된 이름은 허용하지 않는다. - 예외
    * (쉼표로 분리된) 각 자동차 별 이름 입력
        * 최소 한글자에서 5자 이하여야 한다. - 예외
        * 자동차 이름에는 한글, 영어 대소문자, 숫자 외 특수문자("  "), 공백, 스페이스 등은 허용하지 않는다. - 예외
        * null 에 대한 방어코드 작성 - 예외


* 경주 회수를 입력받는다.
    * ~~최소 3회 이상(랜덤값으로 게임의 자동차 전진 위해 일정 회수 이상 필요), 20회를 최대 회수로 한다.~~
        * ApplicationText에 맞춰 경주 회수 최소 1로 변경
        * 최소 1회에서 20회 최대 회수를 플레이한다.
    * 1이상 20회 미만의 수 외, null, 공백, 글자 등의 입력은 받지 않는다. - 예외
    * 1이상 20회 미만의 수를 입력받는다. - 예외
    * 숫자 타입 입력을 검증한다. - 예외

  <br>

#### 레이싱

* 자동차는 검증된 이름과 현재 위치를 가지고 있다
* 자동차는 입력한 횟수의 사이클 동안, 전진 하거나 멈추는 상태를 반복한다.
    * 0~9범위의 Random 결과 4 이상이면 전진
    * 0~9범위의 Random 결과 4 미만이면 멈춤
* 게임 완료 후 전진 횟수 기록을 통해 가장 많은 횟수를 가진 자동차들을 우승목록에 담는다.
    * 가장 높은 전진 기록은 1대의 차 또는 공동 우승이 가능하다.

<br>

#### 출력

* 자동차 경주 진행 동안 각각 자동차 별 전진기록을 출력한다.
    * "자동차 이름 : -" 형태
* 우승자/공동우승자 이름을 쉼표(,) 를 구분자로 출력한다.
* 잘못된 값의 입력에 대해 [ERROR]와 함께 재입력을 요청한다.

