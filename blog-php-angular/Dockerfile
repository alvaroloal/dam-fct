FROM wordpress:latest

RUN apt-get update && apt-get install -y \
    nano \
    vim \
    curl \
    unzip \
    && rm -rf /var/lib/apt/lists/*


COPY ./wp-content /var/www/html/wp-content

RUN chown -R www-data:www-data /var/www/html/wp-content

EXPOSE 80

CMD ["apache2-foreground"]
