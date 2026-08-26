# 깃 초기화 & 브랜치 설정
git init -b main
# 저장소 생성
gh repo create homepick_be --public --source=. --remote=origin
# 저장소에 푸시
git add .
git commit -m "메시지"
git push origin main