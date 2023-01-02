package com.ramonguimaraes.testesandroid

class CalculatesOvertimeUseCase {

    fun calculate(overtime: Float, wage: Float) : Float {
        return overtime * wage * 2
    }
}
