# 入力させるgetsメッソド
line = gets.to_i  #to_iでint型に変換
# line(指定回数分繰り返すtimesメッソド)
line.times do |line_count| #繰り返しの回数を知る為
# 出力、繰り返し回数の表示
  puts "Hello : " + "#{line_count + 1}"  #繰り返し回数を1から表示
end
