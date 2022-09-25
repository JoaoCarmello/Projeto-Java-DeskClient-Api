public class Atividade1 {
	
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
     //  1 - Refatorar o if abaixo para uma forma que seja mais legível.
     //  if (
     //  ((formaPagamentoOutrosCartoes || formaPagamentoCartaoProprio) && !cancelarVenda &&
     //  !isConfirmarVenda && !vendaExterna)
     //  || (paramUtilizaTEF.getValorString().equals(Constantes.NAO) && !cancelarVenda &&
     //  isConfirmarVenda && !vendaExterna)
     //  || (formaPagamentoOutrosCartoes && vendaExterna && !cancelarVenda)
     //  || (nfce && formaPagamentoOutrosCartoes)
     //   )

     Foi feito dois modos de refatoração do if apresentado 

        if(&& !cancelarVenda && !isConfirmarVenda && !vendaExterna){
            if((formaPagamentoOutrosCartoes || formaPagamentoCartaoProprio) || (paramUtilizaTEF.getValorString().equals(Constantes.NAO)){
                  
            }
            else if(nfce && formaPagamentoOutrosCartoes){

            }else{

            }
        }else{

        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if((formaPagamentoOutrosCartoes || formaPagamentoCartaoProprio ) && !cancelarVenda &&
          !isConfirmarVenda && !vendaExterna){

        }
        else if(paramUtilizaTEF.getValorString().equals(Constantes.NAO) && !cancelarVenda &&
          isConfirmarVenda && !vendaExterna){
            
        }
        else if(formaPagamentoOutrosCartoes && vendaExterna && !cancelarVenda){
        
        }
        else if(nfce && formaPagamentoOutrosCartoes){

        }else{
            return;
        }
    }	
}