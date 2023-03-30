CREATE TABLE IF NOT EXISTS movies(
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    duration INTEGER NOT NULL CHECK (duration IN (60, 90, 120))
);

INSERT INTO movies (title, duration) VALUES
    ('Чебурашка', 113),
    ('Вызов', 137),
    ('Праведник', 140),
    ('Непослушная', 88),
    ('Нюрнберг', 131);

CREATE TABLE IF NOT EXISTS showtimes (
    id SERIAL PRIMARY KEY,
    movie_id INTEGER REFERENCES movies(id) ON DELETE CASCADE,
    start_time TIMESTAMP NOT NULL,
    price DECIMAL(6,2) NOT NULL CHECK (price > 0)
);

INSERT INTO showtimes (movie_id, start_time, price) VALUES
    (1, '2023-03-27 14:00:00', 410.00),
    (1, '2023-03-27 17:00:00', 450.00),
    (2, '2023-03-27 13:30:00', 550.00),
    (2, '2023-03-27 16:30:00', 610.00),
    (3, '2023-03-27 15:00:00', 370.00),
    (4, '2023-03-27 19:00:00', 400.00),
    (5, '2023-03-27 18:00:00', 490.00);

CREATE TABLE IF NOT EXISTS tickets (
    id SERIAL PRIMARY KEY,
    showtime_id INTEGER REFERENCES showtimes(id) ON DELETE CASCADE
);

INSERT INTO tickets (showtime_id) VALUES
    (1),
    (1),
    (1),
    (2),
    (2),
    (3),
    (3),
    (3),
    (4),
    (4),
    (5),
    (5),
    (5),
    (5),
    (5),
    (7),
    (7),
    (7),
    (7);