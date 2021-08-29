export default [
    {
        path: 'service',
        name: 'Service',
        component: () => import('../views/webpage/index'),
        meta: {
            model: 'Login',
        }
    }
]