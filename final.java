  import java.util.Scanner;
class menus {
	
	//Criação do vetor "vetorqtd" com 100 de espaço.
	int[] vetorqtd = new int[100];
	//Instanciei a classe mercadinho.
	Mercadinho a = new Mercadinho();
	//Instanciei a classe calculadora.
	calculo calc = new calculo ();
	//Abri o leitor
	Scanner leitor = new Scanner (System.in);
	
public void mostraMenu()
{
	//MENU PRINCIPAL
	System.out.println("Qual opção deseja?");		
	System.out.println("1 - Loja");
	System.out.println("2 - Checar carrinho");
	System.out.println("3 - Fechar pedido");
	System.out.println("4 - Remover item da lista");
	System.out.println("5 - Sair");
	a.vetor[0] = leitor.nextInt();
	
	//LER ESCOLHA
	if (a.vetor[0] == 1) {
		loja();
	}
	if (a.vetor[0] == 2) {
		carrinho();
	}
	if (a.vetor[0] == 3) {
		total();
	}
	if (a.vetor[0] == 4) {
		removerlista();
	}
}

public void loja()
{
	int escolha = 0;
	
	
	//ENQUANTO A ESCOLHA NÃO FOR 5, VAI DAR LOOP.
	while (escolha != 5) {

	

	System.out.println("O que você deseja comprar?");		
	System.out.println("1 - Macarrão  R$ 3,00");
	System.out.println("2 - Arroz 5kg  R$ 15,00");
	System.out.println("3 - Açúcar 5kg R$ 8,00");
	System.out.println("4 - Leite desnatado 1L R$ 3,50");
	System.out.println("5 - Voltar");
	
	escolha = leitor.nextInt();
	
	
		
	//Com base na escolha será chamado o bloco (posicaovetor) que retornará a posição de algum vetor
	//que está vazio, e logo será preenchido com o valor correspondente.
	
	
	if (escolha == 1) {
		a.vetor[(int) a.posicaovetor()] = (float) (3.0);
		
	}
	
	if (escolha == 2) {
		a.vetor[(int) a.posicaovetor()] = (float) (15.0);
		
	}
	if (escolha == 3) {
		a.vetor[(int) a.posicaovetor()] = (float) (8.0);
		
	}
	if (escolha == 4) {
		a.vetor[(int) a.posicaovetor()] = (float) (3.50);
		
	}
	
	if (escolha == 5) {
		mostraMenu();
		
	}
	System.out.println("Continuar comprando?");		
	System.out.println("1 - Sim");
	System.out.println("2 - Não");
	escolha = leitor.nextInt();
	
	if (escolha == 2) {
		mostraMenu();
		
	}
	
}
	
	
	
}
public void carrinho()
{
	
	
	
	
	//Variável X para saber o INDEX de cada item.
	//Vetorqtd posição 0 ao 3 é para sabermos a quantidade exata de cada produto.
	//Em seguida o FOR irá percorrer todas posições do vetor em busca de algum valor que corresponda
	//com os produtos escolhido, caso encontre, salvará dentro do vetorqtd.
	
	
	System.out.println("A lista de carrinho é:");	
	
	int x = 1;
	vetorqtd[0] = 0; vetorqtd[1] = 0; vetorqtd[2] = 0; vetorqtd[3] = 0;
	for (int i=0; i < 100; i++) {
		if (a.vetor[i] != 0.0) {
			
			//SOMAR A QUANTIDADE
			if (a.vetor[i] == (3.0)) { vetorqtd[0]++; }
			if (a.vetor[i] == (15.0)) { vetorqtd[1]++; }
			if (a.vetor[i] == (8.0)) { vetorqtd[2]++; }
			if (a.vetor[i] == (3.50)) { vetorqtd[3]++; }
		}}
	//CHECAR SE EXISTE ALGUM VALOR, SE EXISTE IRÁ SER EXIBIDO O NOME DO PRODUTO E A QUANTIDADE.
	if (vetorqtd[0] != 0) {
		System.out.println(x + " - Macarrão  R$ 3,00 Qtd: " + vetorqtd[0]);
		x++;
		
	}
	
	if (vetorqtd[1] != 0) {
		System.out.println(x + " - Arroz 5kg  R$ 15,00 Qtd: " + vetorqtd[1]);
		x++;
	}
	
	if (vetorqtd[2] != 0) {
		System.out.println(x + " - Açúcar 5kg  R$ 8,00 Qtd: " + vetorqtd[2]);
		x++;
	}
	
	if (vetorqtd[3] != 0) {
		System.out.println(x + " - Leite desnatado 1L  R$ 3,50 Qtd: " + vetorqtd[3]);
		x++;
	}
	System.out.println("Escolha uma opção");
	System.out.println("1 - Remover algum item da lista");
	System.out.println("2 - voltar");
	a.vetor[0] = leitor.nextInt();
	
	if (a.vetor[0] == 1) {
		removerlista();
		
	}
	
	if (a.vetor[0] == 2) {
		mostraMenu();
		
	}
	
}


public void removerlista()
{

	//O começo aqui funciona exatamente igual ao carrinho
	
	
	System.out.println("A lista de carrinho é:");	
	
	int x = 1;
	vetorqtd[0] = 0; vetorqtd[1] = 0; vetorqtd[2] = 0; vetorqtd[3] = 0;
	for (int i=0; i < 100; i++) {
		if (a.vetor[i] != 0.0) {
			
			//SOMAR A QUANTIDADE
			if (a.vetor[i] == (3.0)) { vetorqtd[0]++; }
			if (a.vetor[i] == (15.0)) { vetorqtd[1]++; }
			if (a.vetor[i] == (8.0)) { vetorqtd[2]++; }
			if (a.vetor[i] == (3.50)) { vetorqtd[3]++; }
			
		}}
	//CHECAR SE EXISTE ALGUM VALOR, SE EXISTE FALAR QUANTOS.
	if (vetorqtd[0] != 0) {
		System.out.println(x + " - Macarrão  R$ 3,00 Qtd: " + vetorqtd[0]);
		x++;
		
	}
	
	if (vetorqtd[1] != 0) {
		System.out.println(x + " - Arroz 5kg  R$ 15,00 Qtd: " + vetorqtd[1]);
		x++;
	}
	
	if (vetorqtd[2] != 0) {
		System.out.println(x + " - Açúcar 5kg  R$ 8,00 Qtd: " + vetorqtd[2]);
		x++;
	}
	
	if (vetorqtd[3] != 0) {
		System.out.println(x + " - Leite desnatado 1L  R$ 3,50 Qtd: " + vetorqtd[3]);
		x++;
	}
	

	
			//Aqui o usuário deve digitar qual produto será removido.
	
			//Em seguida entra o if para saber se existe algum valor nas quantidade com base na posição,
			//se existir será chamado o bloco REMOVE, que logo logo será explicado.
			
	
			System.out.println("Deseja remover qual item? (5 para voltar)");
			a.vetor[0] = leitor.nextInt();	
			
			if (a.vetor[0] == 1 ) {
				//Sabemos que o produto MACARRÃO só tem como estar na 1, já que é o primeiro da lista.
				//Então ele só vai aparecer aqui
				if (vetorqtd[0] != 0) { remove1();}else if (vetorqtd[1] != 0) { remove2();}else if (vetorqtd[2] != 0) { remove3();}else if (vetorqtd[3] != 0) { remove4();}}

				//e o 2 só pode estar na 1 ou 2, então foi adaptado para que possa ser removido com base no index.
			if (a.vetor[0] == 2 ) {
				 if (vetorqtd[1] != 0) { remove2();}else if (vetorqtd[2] != 0) { remove3();}else if (vetorqtd[3] != 0) { remove4();}}
				


			
			if (a.vetor[0] == 3 ) {
				
				if (vetorqtd[2] != 0) { remove3();}else if (vetorqtd[3] != 0) { remove4();}}


			
			if (a.vetor[0] == 4 ) {
				
				if (vetorqtd[3] != 0) { remove4();}}
			
			if (a.vetor[0] == 5 ) {
				
				mostraMenu();}

			
			
				
			
			System.out.println("Deseja remover mais algum item?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não, desejo voltar");
			a.vetor[0] = leitor.nextInt();
			
			
			if (a.vetor[0] == 1) {
				removerlista();
			}
			if (a.vetor[0] == 2) {
				mostraMenu();
			}
}

void total () {

//Aqui vai dizer o valor total das compras.
//Ele chama o bloco SOMARTUDO dentro da classe CALCULO, que irá fazer a soma e retornar o valor.	

System.err.println("O valor total é: R$ " + calc.somartudo());	

System.out.println("Deseja voltar?");
System.out.println("1 - Sim");
System.out.println("2 - Não");
a.vetor[0] = leitor.nextInt();


if (a.vetor[0] == 1) {
	mostraMenu();
}

if (a.vetor[0] == 2) {
	System.exit(0);
}
}



//Os blocos remove consiste em procurar o vetor referente ao produto escolhido pelo usuário para ser
//removido, e em seguida será deletado. Como a ideia é remover somente 1 quantidade, o loop é interrompido
//assim que a operação for executadda uma vez, devido ao BREAK.
void remove1 () {
	for (int i=0; i < 100; i++) {
	if (a.vetor[i] == (3.0)) {
		a.vetor[i] = (float) (0.0);
		break;
	}
	
}
}


void remove2 () {
	for (int i=0; i < 100; i++) {
	if (a.vetor[i] == (15.0)) {
		a.vetor[i] = (float) (0.0);
		break;
	}
	
}
}


void remove3 () {
	for (int i=0; i < 100; i++) {
	if (a.vetor[i] == (8.0)) {
		a.vetor[i] = (float) (0.0);
		break;
	}
	
}
}


void remove4 () {
	for (int i=0; i < 100; i++) {
	if (a.vetor[i] == (3.50)) {
		a.vetor[i] = (float) (0.0);
		break;
	}
	
}
	
}


class calculo {
		
		//Aqui será efetuado o calculo de todos os produtos que estão no carrinho.
		//O *FOR* procurará algum valor que corresponde ao valor de algum produto
		//caso encontrado, ele vai somar tudo dentro da variável TOTAL.
		//Essa variável será retornada para o bloco TOTAL, que irá dizer o valor final dos produtos.
	
		float somartudo() {
		float total = 0;
		for (int i=2; i < 100; i++) {
			if (a.vetor[i] != 0.0) {
				
				//SOMAR A QUANTIDADE
				if (a.vetor[i] == (3.0)) { total = total + (float) (3.0); }
				if (a.vetor[i] == (15.0)) { total = total + (float) (15.0); }
				if (a.vetor[i] == (8.0)) { total = total + (float) (8.0); }
				if (a.vetor[i] == (3.50)) { total = total + (float) (3.50); }
			}}
		return total;
	}

	

	
	}}
