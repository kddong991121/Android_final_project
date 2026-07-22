package kr.ac.hallym.afinal

data class Person(
    var name: String = "",
    var content: String = "",
    var description: String = "",
    var isExpanded: Boolean = false,
    var image: Int = -1,
    //정보를 저장할 데이터 클래스 isExpanded 변수에 현재 상태가 확장인지 아닌지를 저장.
    //Default값으로 false를 지정
)