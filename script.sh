for file in test-files/*.md;
do
  java MarkdownParse $file
  echo "Test file name is: ${file}"
done
