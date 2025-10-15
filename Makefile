run: build
	java -cp bin Main 

build:
	javac -d bin Main.java

clean:
	rm -r bin

git:
	git config --global user.name "MateusGarciaaa"
	git config --global user.email "mateusgarcia3081@gmail.com"

git-clean:
	git config --global user.name ""
	git config --global user.email ""

tesouro: build-tesouro
	java -cp bin avaliacoes.trabalhos.T3.tesouro

build-tesouro:
	javac -d bin avaliacoes/trabalhos/T3/tesouro.java

imagem: build-imagem
	java -cp bin avaliacoes.trabalhos.T3.ManipuladorImagens

build-imagem:
	javac -d bin avaliacoes/trabalhos/T3/ManipuladorImagens.java
