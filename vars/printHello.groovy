def call(Map parameters = [:]) {
def printHelloScript = libraryResource '/print-hello.sh'
def name = parameters.name
  withEnv(["NAME=${name}"])
           sh(printHelloScript)
 }
