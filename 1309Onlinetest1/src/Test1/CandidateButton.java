package Test1;

public class CandidateButton extends Button {
CandidateIDScreen cs=new CandidateIDScreen();
CandidateLamp cl=new CandidateLamp();
@Override
void press(int id) {
	cs.c.setTotal(cs.c.getTotal()+1);
	cl.on();
	System.out.println("You voted for "+ cs.c.getCandidateNme() );
	cl.off();
}
}
