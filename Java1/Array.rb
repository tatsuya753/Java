# 点数
score = [80, 100, 75]
# 名前
name = ["鈴木", "田中", "宗像"]

puts name[0] + "さん" + "#{score[0]}" + "点"
puts name[1] + "さん" + "#{score[1]}" + "点"
puts name[2] + "さん" + "#{score[2]}" + "点"
puts "受験者数" + score.length.to_s + "名"
puts "得点合計：" + "#{score[0] + score[1] + score[2]}"