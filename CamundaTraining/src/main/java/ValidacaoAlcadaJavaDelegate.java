
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ValidacaoAlcadaJavaDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        execution.setVariable("ServiceVariable_ValidacaoAlcada", "N�o Escalar Pr�xima Al�ada");
        execution.setVariableLocal("ServiceVariable_ValidacaoAlcada", "N�o Escalar Pr�xima Al�ada");
    }

}
