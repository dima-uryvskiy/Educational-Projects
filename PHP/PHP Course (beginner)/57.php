<?php

namespace HexletBasics\Conditionals\ElseIfStatement;

// BEGIN
function whoIsThisHouseToStarks($surname)
{
    if ($surname === 'Karstark' || $surname == 'Tully') {
        return 'friend';
    } elseif ($surname === 'Lannister' || $surname == 'Frey') {
        return 'enemy';
    }
    
    return 'neutral';
}
// END
