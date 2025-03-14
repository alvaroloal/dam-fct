FROM wordpress:latest

# Instalar dependencias adicionales si es necesario
RUN apt-get update && apt-get install -y \
    nano \
    vim \
    curl \
    unzip \
    && rm -rf /var/lib/apt/lists/*

# Copiar archivos personalizados
COPY ./wp-content /var/www/html/wp-content

# Dar permisos adecuados
RUN chown -R www-data:www-data /var/www/html/wp-content

# Exponer el puerto 80
EXPOSE 80

CMD ["apache2-foreground"]
