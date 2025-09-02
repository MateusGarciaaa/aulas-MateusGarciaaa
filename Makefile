run: build
	java -cp bin Main 
#  "AED" IFPR Algoritmo e Estrutura de Dados TADS

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