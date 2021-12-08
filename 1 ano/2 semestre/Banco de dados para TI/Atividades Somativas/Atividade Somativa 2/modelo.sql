insert into MeusVinhos.Regiao (nomeRegiao, descricaoRegiao) values
(),
(),
(),
(),
();

insert into MeusVinhos.Vinicola (nomeVinicola, descricaoVinicola,foneVinicola,emailVinicola,Regiao_codRegiao) values
(),
(),
(),
(),
();

insert into MeusVinhos.Vinho (nomeVinho, tipoVinho, anoVinho, descricaoVinho,opniaoVinho, precoVinho, Vinicola_codVinicola) values
(),
(),
(),
(),
();

select nomeVinho, anoVinho, nomeVinicola, nomeRegiao from MeusVinhos.Vinho
	join MeusVinhos.Vinicola on Vinicola_codVinicola = codVinicola
		join MeusVinhos.Regiao on Regiao_codRegiao = codRegiao;

create user somellier@"localhost" identified by "1234"
	 with MAX_QUERIES_PER_HOUR 40;

grant select on MeusVinhos.Vinho to somellier@"localhost";
grant select (codVinicola, nomeVinicola) on MeusVinhos.Vinicola to somellier@"localhost";
