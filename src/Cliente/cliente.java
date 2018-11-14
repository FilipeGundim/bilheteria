package Cliente;

import main.main;

public class cliente extends Thread{

 int pessoaid;

 int ingresso;

 main m=new main();

    public cliente(int i) {
        pessoaid = i+1;
    }

public void run() {
  
    if (login() == false)
    {
	System.out.println("Cliente "+pessoaid+ " não consegiu efetuar o login.(TIMEOUT)");
    }
    else
    {
	System.out.println("Cliente "+pessoaid+" efetuou login");

	if(compra() == false)
	{
		System.out.println("Cliente "+pessoaid+ " não consegiu efetuar a compra.(TIMEOUT)");
	}
	else{
	System.out.println("Cliente "+pessoaid+" compra em andamento.");

	if(coldzera() == true){
		System.out.println("Cliente " +pessoaid +" comprou " +ingresso +" ingressos.");
	}

	else{
		System.out.println("Esgotou os ingresso.");
	}
	}
}
}

private static boolean login(){

	int tempo =(int) ((Math.random()*2500) + 500);

	// System.out.println(tempo);

	if (tempo>1000){
		return false;
	}

	else{

	try {
		Thread.sleep(tempo);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return true;
	}
}

private static boolean compra (){
    
	int tempo =(int) ((Math.random()*2500) + 1000);
        
	if (tempo>2500){
		return false;
	}
	else{
	try {
		Thread.sleep(tempo);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return true;
    }
}

// metodo para matar a thread

public boolean coldzera(){

	ingresso=(int)(Math.random()*4)+1;

	if (m.qtd<=ingresso)

	{

	m.qtd=m.qtd-ingresso;

	return true;
	}
	else
	{
	return false;

    }
}

}
