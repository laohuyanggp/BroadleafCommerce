/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.core.offer.domain;

import org.broadleafcommerce.core.order.domain.OrderItem;
import org.broadleafcommerce.money.Money;

public interface OrderItemAdjustment extends Adjustment {

    public OrderItem getOrderItem();

    public void init(OrderItem orderItem, Offer offer, String reason);

    public void setOrderItem(OrderItem orderItem);

    /**
     * Value of this adjustment relative to the retail price.
     * @return
     */
    public Money getRetailPriceValue();

    public void setRetailPriceValue(Money retailPriceValue);

    /**
     * Value of this adjustment relative to the sale price.
     *
     * @return
     */
    public Money getSalesPriceValue();

    public void setSalesPriceValue(Money salesPriceValue);
}
