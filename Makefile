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
tesouro:
	java -cp bin avaliacoes.trabalhos.T3.tesouro;
imagem:
	java -cp bin avaliacoes.trabalhos.T3.ManipuladorImagens;