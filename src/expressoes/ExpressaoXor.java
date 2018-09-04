package expressoes;

import java.util.Map;

public class ExpressaoXor extends ExpressaoBinaria {
	public ExpressaoXor(ExpressaoLogica lhs, ExpressaoLogica rhs) {
		super(lhs, rhs);
	}
	
	@Override
	public boolean eval(Map<String, Boolean> valoresVariaveis) {
		// TODO Auto-generated method stub
		if(super.getLHS().eval(valoresVariaveis))
			if(super.getRHS().eval(valoresVariaveis))
				return false;
			else return true;
		else if(super.getRHS().eval(valoresVariaveis))
			return true;
		else return false;
	}

}
