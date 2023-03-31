# springTest
Spring으로 간단한 게시판 만들어보기 

- 부족한 점 & 공부할 거
    - Spring 전체 파일 구성하기 (어노테이션 설정 등)
    - DBManager에서 sqlSessionFactory 설정하기
      - thymeleaf 에서 String 형태로 되어있는 날짜 데이터 포맷 설정하기 (#temporals 쓰는 건데 왜 안됨)
        - 일단 TeamVO에서 데뷔 날짜를 Date 형식으로 하기로 했다. 사실 뭘로 해도 상관없긴 한데 왜 String을 temporals로 하는 건 안 되는지.
        - 년/월/일로 되어있는 String을 temporals로 표기는 되는데, 시분초가 있으면 안 된다. 겁나 불편하게 만듬.

* 해보고 싶은 거
    * list에서 이름에 마우스 올리면 해당 이미지가 나오도록 하기 (Ajax로)
    * member 테이블에서 데이터 지우면 team 테이블의 total 인원이 반영되도록 하기
    * 