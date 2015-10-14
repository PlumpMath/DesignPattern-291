/**
 * @author: wujiabin
 * @brief: singleton demo
 * @refer: http://www.jellythink.com/archives/82
 */

#include <iostream>

class Singleton {
    public:
        static Singleton* GetInstance() {
            static Singleton instance;
            return &instance;
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
};

int main(int argc, char* argv[]) {
    Singleton* singletonObj = Singleton::GetInstance();
    std::cout << singletonObj->GetCounter() << std::endl;

    Singleton* singletonObj1 = Singleton::GetInstance();
    std::cout << singletonObj1->GetCounter() << std::endl;
}
