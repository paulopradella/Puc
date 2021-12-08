insert into Geral.Pedido (Cliente_codigoCliente, dataEmissao, statusPedido, Entregador_codigoEntregador, nomeEntregador) values 
(1, 5,now() , 3, "Hulk"),
(2, 4,now() , 2, "War Machine"),
(3, 3, now(), 4, "Castiel"),
(4, 2,now() , 3, "Hulk"),
(1, now(), 5, "Scooby-Doo");

select * from Geral.Pedido;