`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 02.10.2024 10:18:26
// Design Name: 
// Module Name: MOD_6_counter
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


module MOD_6_counter(
    output reg [2:0] dout,  // Declare dout as reg
    input clk,
    input reset
);
    
    always @(posedge clk) begin
        if (reset)
            dout <= 0;  // Reset dout to 0
        else if (dout < 5)
            dout <= dout + 1;  // Increment dout while it's less than 5
        else
            dout <= 0;  // Reset dout to 0 after it reaches 5
    end
endmodule

