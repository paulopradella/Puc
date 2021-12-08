#Inserir Sanduiches no cardápio
insert into Geral.Cardapio (nomeSanduiche, precoSanduiche) values 
("Black Widow", 35.50),
("Loki", 29.50),
("Batman", 105.50),
("Superman", 10.50),
("Harley Queen", 45.50),
("Poison Eve", 35.50),
("Lobo", 37.50),
("Darth Vader", 135.50),
("Yoda", 100.50),
("Valquiria", 35.50);

#Inserir Entregadores
insert into Geral.Entregador (codigoEntregador, nomeEntregador, telefoneEntregador) values 
(1, "Robin", 976543281),
(2, "War Machine", 976843281),
(3, "Hulk", 956543281),
(4, "Castiel", 976543458),
(5, "Scooby-Doo", 093543281);

#Inserir Clientes
insert into Geral.Cliente (codigoCliente, nomeCliente, telefoneCliente, enderecoLogradouro, enderecoNumero, EnderecoCEP) values 
(1, "Tony Stark", 998765432, "Malibu Point", 10880, 90265),
(2, "Steve Jobs", 998765431, "Crist Drive", 2066, 94024),
(3, "Bill Gates", 998765412, "73rd Ave", 1835, 98039),
(4, "Lucifer", 998165432, "Sunset Blvd", 8358, 90069),
(5, "Mister Bean", 988765432, " Arbour Road", 12, 512371821);

#Inserir Sanduiches no pedido
insert into Geral.CardapioPedido (codigoCardapioPedido, quantidadeSanduche, Cardapio_CodigoSanduiche, Pedido_codigoPedido) values 
(1, 4, 3, 1),
(2, 7, 9, 2),
(3, 9, 6, 3),
(4, 10, 1, 4),
(5, 5, 6, 5);

#Inserir dados do Pedido
insert into Geral.Pedido (codigoPedido, Cliente_codigoCliente, dataEmissao, statusPedido,Entregador_codigoEntregador, nomeEntregador) values 
(1, 5, now(), 1, 3, "Hulk"),
(2, 2, now(), 0, 5, "Scooby-Doo"),
(3, 1, now(), 1, 3, "Hulk"),
(4, 4, now(), 0, 5, "Scooby-Doo"),
(5, 3, now(), 2, 4, "Castiel");

#Consulta status do pedido
select * from geral.pedido where statusPedido = 0;