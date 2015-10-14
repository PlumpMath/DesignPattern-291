/**
 * @author: wujiabin
 * @brief: singleton demo
 * @refer: http://www.jellythink.com/archives/82
 */

#include <iostream>

class Singleton {
    public:
        static Singleton* GetInstance() {
            return m_instance;
        }

        int GetCounter() {
            return m_counter++;
        }
    private:
        Singleton():m_counter(0) {
            std::cout << "singleton's constructor" << std::endl;
        }
        ~Singleton() {
            std::cout << "singleton's desctuctor" << std::endl;
        }
        int m_counter;
        static Singleton* m_instance;

        // internal raii
        class GC {
            public:
                ~GC() {
                    if (m_instance != NULL) {
                        std::cout << "destroy singleton" << std::endl;
                        delete m_instance;
                        m_instance = NULL;
                    }
                }
        };

        static GC gc;
};

Singleton* Singleton::m_instance = new Singleton();
Singleton::GC Singleton::gc;

int main(int argc, char* argv[]) {
    Singleton* singletonObj = Singleton::GetInstance();
    std::cout << singletonObj->GetCounter() << std::endl;

    Singleton* singletonObj1 = Singleton::GetInstance();
    std::cout << singletonObj1->GetCounter() << std::endl;
}
