# サンプルの説明
選択された画像をフロントエンドで縮小するサンプル。
Jimpというライブラリを使用した場合と、ライブラリ未使用の場合をそれぞれ作成。

それぞれ同一条件で画像を縮小しているはずが、なぜ縮小後のファイルサイズが異なるのかは謎。（ライブラリ未使用の方が軽い）

# サンプル実行方法
1. プロジェクトをローカルにチェックアウトする
1. コマンドプロンプトでプロジェクト直下に移動し以下のコマンドを実行  
`gradlew bootJar`
1. プロジェクト直下のbuild\libsディレクトリにdb-session.jarが作成されていることを確認
1. 以下のコマンドでjarを実行する  
`java -jar image-resize.jar`
1. 以下のurlにアクセスする  
`http://localhost:8080/test`