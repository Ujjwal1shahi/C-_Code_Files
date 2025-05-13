`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 02.10.2024 10:39:21
// Design Name: 
// Module Name: MOD_6_counter_test
// Project Name: 
// Target Devices: 
// Tool Versions: 
// Description: 
// 
// Dependencies: 
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
//////////////////////////////////////////////////////////////////////////////////


module MOD_6_counter_test();

    reg clk, reset;
    wire [2:0] dout;

    // Instantiate the MOD_6_counter and connect the ports
    MOD_6_counter uut (
        .dout(dout), 
        .clk(clk), 
        .reset(reset)
    );

    // Clock generation: 50 MHz clock with 20ns period
    initial begin
        clk = 0;
        forever #10 clk = ~clk;  // Toggle clk every 10ns
    end

    // Reset logic and test stimulus
    initial begin
        reset = 1;         // Assert reset initially
        #30 reset = 0;     // Deassert reset after 30ns
        #150 reset = 1;    // Assert reset again after 150ns
        #30 reset = 0;     // Deassert reset after 30ns
    end
endmodule

