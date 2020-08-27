<?php

namespace HexletBasics\Conditionals\IfStatement;

// BEGIN
function getSentenceTone($str)
{
    if (strtoupper($str) == $str) {
        return 'scream';
    }

    return 'normal';
}
// END
