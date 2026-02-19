->hello world
print("hello world")

->5개의 카드중 확률 랜덤 부여, 10.0%~50.0%
fn=card():list<:float>{
  of prob:list = which:float(it_amount(5))
  /**of = 변수 선언,
  which = null과 비슷, 타입 지정 가능, 위 코드를
  of prob:list<:float> = which()
  로도 가능
  */
  return prob.foreach { i
    prob[i] = random_float(10.0, 50.0)
  }
}

->대미지, 체력, 능력등을 가진 캐릭터에
이름 생성칸 넣기, 함수 작동
fn=character(which:list()) {
  it.add_in_list(of name:string =null)
  set_name(it.fix)
}


