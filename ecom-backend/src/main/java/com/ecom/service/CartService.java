package com.ecom.service;

import com.ecom.model.Cart;
import com.ecom.model.CartItem;

public interface CartService {
    Cart getCart(Long userId);
    Cart addToCart(Long userId, CartItem cartItem);
    Cart updateCartItem(Long userId, CartItem cartItem);
    Cart removeFromCart(Long userId, Long productId);
    void clearCart(Long userId);
} 