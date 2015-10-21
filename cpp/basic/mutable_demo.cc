/**
 * @author: wujiabin
 * @brief: 说明mutable关键字的用法
 *         mutable是可变的意思，可以突破const的限制，使变量可以在const函数中保持可变
 */

#include <iostream>

class TestMutable {
    public:
        TestMutable(): m_i(0) {}
        int Output() const {
            return m_i++;  // error when m_i is not mutable: read-only variable is not assignable
        }
    private:
        // int m_i;
        mutable int m_i;
};

int main() {
    TestMutable testMutable;
    std::cout << testMutable.Output() << std::endl;
    std::cout << testMutable.Output() << std::endl;
    return EXIT_SUCCESS;
}

