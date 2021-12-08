insert into Geral.Pedido (codigoPedido, Cliente_codigoCliente, dataEmissao, statusPedido,Entregador_codigoEntregador, nomeEntregador) values 
(1, 5, now(), 1, 3, "Hulk"),
(2, 2, now(), 0, 5, "Scooby-Doo"),
(3, 1, now(), 1, 3, "Hulk"),
(4, 4, now(), 0, 5, "Scooby-Doo"),
(5, 3, now(), 2, 4, "Castiel");

select * from Geral.Pedido;