def call(Map config = [:]) {
loadLinuxScript(name: 'print-hello.sh')
sh "./print-hello.sh ${config.name} ${config.dayOfWeek}"
}
