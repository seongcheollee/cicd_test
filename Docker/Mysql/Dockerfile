# MySQL 8.0 공식 이미지를 기반으로 Dockerfile 작성
FROM mysql:8.0

# 환경 변수 설정 (비밀번호 및 데이터베이스 이름을 설정할 수 있습니다.)
ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=BBdb

# 도커 컨테이너가 실행될 때 MySQL 서버가 자동으로 시작되도록 설정
CMD ["mysqld"]
