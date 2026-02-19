->hello world
print("hello world")

->5개의 카드중 확률 랜덤 부여, 10.0%~50.0%
fn=card():list<:float>{
  of prob:list = which(x5:float)
  /**of = 변수 선언,
  which = null과 비슷, 타입 지정 가능, 위 코드를
  of prob:list<x5:float> = which() 로도 가능
  */
  return prob.foreach { i
    prob[i] = randomfloat(10.0, 50.0)
  }
}

->대미지, 체력, 능력등을 가진 캐릭터 생성 법
fn=character(which()) return itself
fn=summon(of param = which()) {
  if param.have(null or shuffle) return
  character(param.fix())
}


