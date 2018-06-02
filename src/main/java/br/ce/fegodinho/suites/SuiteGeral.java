package br.ce.fegodinho.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.fegodinho.tests.ContaTest;
import br.ce.fegodinho.tests.MovimentacaoTest;
import br.ce.fegodinho.tests.RemoverMovimentacaoContaTest;
import br.ce.fegodinho.tests.ResumoTest;
import br.ce.fegodinho.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class	
})
public class SuiteGeral {	
}
