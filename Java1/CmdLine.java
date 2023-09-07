class CmdLine{
  public static void main(String[] args){
    System.out.println("args[0]：" + args[0]);
    System.out.println("args[1]：" + args[1]);
    System.out.println("args.length：" + args.length);
  }
}

//コマンドラインからのデータ入力
//例..コンパイル後..java CmdLine Hello Java
//Hello = args[0], Java = args [1] に格納される