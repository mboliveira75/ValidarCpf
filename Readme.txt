	Tem por objetivo receber um numero de CPF e atraves do calculo dos digitos verificadores dizer se � um CPF v�lido ou n�o.
	Para sso esta sendo seguida a seguinte sequ�ncia :

		==> Verificar se o numero passado possui 11 caracteres;
		==> Verificar se os 11 caracteres passados s�o todos numeros;
		==> Realizar o calculo dos digito verificadores conforme demonstrado abaixo :

			Calculo do 1� digito verificador 


				se (mod ( (10*a) + (9*b) + (8*c) + (7*d) + (6*e) + (5*f) + (4*g) + (3*h) + (2*i) )/11) < 2 )
				dig1=0

				sen�o dig1= 11-mod(resto da divis�o)


				Calculo do 2� digito verificador

				se (mod ( (11*a) + (10*b) + (9*c) + (8*d) + (7*e) + (6*f) + (5*g) + (4*h) + (3*i) + (2*j) )/11) < 2 )
				dig2 = 0

				sen�o dig2 = 11-mod(resto da divis�o)


		==> Obtido os valores dos digitos comparar coom o que foi passado e assim constatar a validado do CPF.