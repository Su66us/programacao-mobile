\\ex(14/8)
class Conta constructor(cliente: String, numero: Int, agencia: Int) {

    private var _Cliente: String = cliente
    private var _numero: Int = numero
    private var _agencia: Int = agencia
    private var _saldo: Int = 0


    init {
        println("executar o construtor")
    }

    fun depositar(quantia: Double) {
        _saldo += (quantia * 100).toInt()
    }

    fun sacar(quantia: Double) {
        _saldo -= (quantia * 100).toInt()
    }

    fun extrato(){
        println(_Cliente)
        println("$_numero - $_agencia")
        println("${_saldo / 100}")
    }

    fun transferir(outraConta: Conta, quantia: Double) {
        this.sacar(quantia)
        outraConta.depositar(quantia)
    }
}

fun main() {
    val conta1 = Conta(cliente = "Jose", numero = 1234, agencia = 789)
    conta1.depositar(quantia = 1000.00)
    conta1.extrato()

    val conta2 = Conta(cliente = "joao", numero = 5678, agencia = 456)
    conta2.transferir(conta1, quantia = 500.00)
    conta2.extrato()
}
