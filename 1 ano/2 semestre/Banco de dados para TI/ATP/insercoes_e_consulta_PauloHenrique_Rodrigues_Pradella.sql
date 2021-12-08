
insert into mydb.Cardapio (nomeSanduiche, precoSanduiche) values 
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

#insert Clientes
insert into mydb.Cliente (nomeCliente, telefoneCliente, enderecoLogradouro, enderecoNumero, enderecoCep) values 
("Tony Stark", 998765432, "Malibu Point", 10880, 90265),
("Steve Jobs", 998765431, "Crist Drive", 2066, 94024),
("Bill Gates", 998765412, "73rd Ave", 1835, 98039),
("Lucifer", 998165432, "Sunset Blvd", 8358, 90069),
("Mister Bean", 988765432, " Arbour Road", 12, 512371821);

#insert Escolhas
insert into mydb.Escolhas (codigoEscolha, quantidadeSanduiche, Cliente_codigoCliente, Cardapio_codigoSanduiche) values 
(1, 20, 1, 1),
(1, 4, 1, 10),
(2, 1, 4, 2),
(3, 1, 5, 10),
(4, 5, 3, 5),
(5, 1, 2, 3);

#insert Pedido
insert into mydb.Pedido (dataPedido, statusPedido, Escolhas_codigoEscolha, Escolhas_Cliente_codigoCliente) values 
(now(), 0, 1, 1),
(now(), 0, 2, 4),
(now(), 1, 3, 5),
(now(), 1, 4, 3),
(now(), 2, 5, 2);

#insert Entregadores
insert into mydb.Entregor (nomeEntregador, telefoneEntregador, Pedido_Pedidocol) values 
("Robin", 976543281, 5),
("War Machine", 976843281, 3),
("Hulk", 956543281, 1),
("Castiel", 976543458, 2),
("Scooby-Doo", 093543281, 4);

#Consulta pedidos em preparação
select * from mydb.Pedido where statusPedido = 0;