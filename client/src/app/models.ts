export interface CardDetails{
    product_id: number
    name: string
    description: string
    price: number
    image_url: string
    category: string
}

export interface Customer{
    firstname: string 
    lastname: string
    password: string
    email: string
    address: string

}