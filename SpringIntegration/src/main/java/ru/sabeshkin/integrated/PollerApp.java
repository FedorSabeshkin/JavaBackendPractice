/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.sabeshkin.integrated;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PollerApp {

    /**
     * Приложение, которое получает текущее системное время 2 раза каждые
     * 20 секунд (20000 миллисекунд).
     * <p>
     * Результирующее сообщение содержит время в миллисекундах и сообщение
     * перенаправляется на адаптер канала регистрации, который будет печатать время на
     * в командной строке.
     *
     * @param args Not used.
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        new ClassPathXmlApplicationContext("META-INF/spring/integration/delay.xml");
    }

}
