	Tem por objetivo receber um numero de CPF e atraves do calculo dos digitos verificadores dizer se é um CPF válido ou não.
	Para sso esta sendo seguida a seguinte sequência :

		==> Verificar se o numero passado possui 11 caracteres;
		==> Verificar se os 11 caracteres passados são todos numeros;
		==> Realizar o calculo dos digito verificadores conforme demonstrado abaixo :

			Calculo do 1º digito verificador 


				se (mod ( (10*a) + (9*b) + (8*c) + (7*d) + (6*e) + (5*f) + (4*g) + (3*h) + (2*i) )/11) < 2 )
				dig1=0

				senão dig1= 11-mod(resto da divisão)


				Calculo do 2º digito verificador

				se (mod ( (11*a) + (10*b) + (9*c) + (8*d) + (7*e) + (6*f) + (5*g) + (4*h) + (3*i) + (2*j) )/11) < 2 )
				dig2 = 0

				senão dig2 = 11-mod(resto da divisão)


		==> Obtido os valores dos digitos comparar coom o que foi passado e assim constatar a validado do CPF.