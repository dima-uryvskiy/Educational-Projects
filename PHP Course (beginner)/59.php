<?php

namespace HexletBasics\Conditionals\SwitchStatement;

// BEGIN
function getNumberExplanation($number) {
    switch ($number) {
        case 666:
            return 'devil number';
        case 42:
            return 'answer for everything';
        case 7:
            return 'prime number';
        default:
            return null;
    }
}
// END
