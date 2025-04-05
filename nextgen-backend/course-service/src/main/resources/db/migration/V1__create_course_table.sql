-- Create enum type
CREATE TYPE level AS ENUM ('BEGINNER', 'INTERMEDIATE', 'ADVANCED');

-- Create course table
CREATE TABLE course (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    title VARCHAR(100) NOT NULL,
    description VARCHAR(500),
    topics JSONB NOT NULL,
    price DECIMAL(19, 2) NOT NULL CHECK (price >= 0),
    duration_hours INTEGER NOT NULL CHECK (duration_hours > 0),
    difficulty_level level NOT NULL,
    published BOOLEAN NOT NULL DEFAULT false,
    created_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Create indexes
CREATE INDEX idx_course_published ON course(published);
CREATE INDEX idx_course_difficulty ON course(difficulty_level);
CREATE INDEX idx_course_created ON course(created_at);
CREATE INDEX idx_course_topics ON course USING GIN (topics);