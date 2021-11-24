## Projeto Intermedio De P2


<li>
Uma encomenda é genericamente caraterizada pela seguinte informação: número de encomenda (int), data (Date).
</li>
<li>
Uma encomenda pode agregar várias bicicletas.
Uma bicicleta, em abstrato tem apenas os atributos código (String), marca (String), modelo (String) e preço (float). No entanto, uma bicicleta pode ser uma bicicleta não elétrica, sendo os atributos adicionais o número de velocidade (int) e tipo de suspensão (String), ou um bicicleta elétrica, sendo os seus atributos adicionais a potência do motor (int) em Wats e autonomia (float) em Kms.
</li>
<li>
Uma bicicleta só pode ser bicicleta não elétrica ou bicicleta elétrica, não havendo outros tipos.
</li>
<li>
Uma mesma encomenda pode ter bicicletas de ambos os tipos.
</li>
<br>
<div>
a) Esboce o diagrama de classes do problema descrito (classes, atributos e relações). [em papel e entregue fisicamente]
</div>
<br>
<div>
b) Codifique as classes Encomenda, Bicicleta, BicicletaNaoEletrica e BicicletaEletrica, que representam respetivamente uma encomenda, uma bicicleta genérica, uma bicicleta não elétrica, e uma bicicleta elétrica. Incluir os respetivos construtores, métodos de acesso (getters) e mutação (setters). Não deve ser implementado um método de mutação para o número da encomenda, devendo este ser atribuído apenas no construtor da classe). [em papel o código para uma classe à sua escolha e entregue fisicamente]
</div>
<br>
<div>
c) Elabore uma classe de teste e efetue pelo menos 2 encomendas contendo estas mais de que 1 bicicleta.
</div>
