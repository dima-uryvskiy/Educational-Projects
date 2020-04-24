<?php

use PHPUnit\Framework\TestCase;

class ExampleTest extends TestCase
{
    private $calculator;

    /**
     * Create new object Example
     *
     * @return void
     */
    protected function setUp(): void
    {
        $this->calculator = new Example();
    }



    public function testAdd()
    {
        $result = $this->calculator->add(1, 2);
        $this->assertEquals(3, $result);
    }

}
