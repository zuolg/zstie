utils = {
    setParam : function (name,value){
        localStorage.setItem(name,value)
    },
    getParam : function(name){
        return localStorage.getItem(name)
    }
}
productInfo = {
    name:"",
    imgUrl:"",
    shopID:2,
    shopName:"我是店铺名称"
};

product={
    id:0,
    name:"",
    num:0,
    price:0.00
};
orderdetail={
    username:"",
    phone:"",
    address:"",
    zipcode:"",
    totalNumber:0,
    totalAmount:0.00    
}
cart = {
    //向购物车中添加商品
    addproduct:function(product){
        var ShoppingCart = utils.getParam("ShoppingCart");
        if(ShoppingCart==null||ShoppingCart==""){
            //第一次加入商品
            var jsonstr = {"productCartList":[{"id":product.id,"name":product.name,"num":product.num,"price":product.price}],"totalNumber":product.num,"totalAmount":(product.price*product.num)};
            utils.setParam("ShoppingCart","'"+JSON.stringify(jsonstr));
        }else{
            var jsonstr = JSON.parse(ShoppingCart.substr(1,ShoppingCart.length));
            var cartlist = jsonstr.productCartList;
            var result=false;
            //查找购物车中是否有该商品
            for(var i in cartlist){
                if(cartlist[i].id==product.id){
                    cartlist[i].num=parseInt(cartlist[i].num)+parseInt(product.num);
                    result = true;
                }
            }
            if(!result){
                //没有该商品就直接加进去
                cartlist.push({"id":product.id,"name":product.name,"num":product.num,"price":product.price});
            }
            //重新计算总价
            jsonstr.totalNumber=parseInt(jsonstr.totalNumber)+parseInt(product.num);
            jsonstr.totalAmount=parseFloat(jsonstr.totalAmount)+(parseInt(product.num)*parseFloat(product.price));
            orderdetail.totalNumber = jsonstr.totalNumber;
            orderdetail.totalAmount = jsonstr.totalAmount;
            //保存购物车
            utils.setParam("ShoppingCart","'"+JSON.stringify(jsonstr));
        }
    },
    //修改给买商品数量
    updateproductnum:function(id,num){
        var ShoppingCart = utils.getParam("ShoppingCart");
        var jsonstr = JSON.parse(ShoppingCart.substr(1,ShoppingCart.length));
        var cartlist = jsonstr.productCartList;
        
        for(var i in cartlist){
            if(cartlist[i].id==id){
                jsonstr.totalNumber=parseInt(jsonstr.totalNumber)+(parseInt(num)-parseInt(cartlist[i].num));
                jsonstr.totalAmount=parseFloat(jsonstr.totalAmount)+((parseInt(num)*parseFloat(cartlist[i].price))-parseInt(cartlist[i].num)*parseFloat(cartlist[i].price));
                cartlist[i].num=parseInt(num);
                
                orderdetail.totalNumber = jsonstr.totalNumber;
                orderdetail.totalAmount = jsonstr.totalAmount;
                utils.setParam("ShoppingCart","'"+JSON.stringify(jsonstr));
                return;
            }
        }
    },
    //获取购物车中的所有商品
    getproductlist:function(){
        var cartlist = null;
        try{
            var ShoppingCart = utils.getParam("ShoppingCart");
            var jsonstr = JSON.parse(ShoppingCart.substr(1,ShoppingCart.length));
            cartlist = jsonstr.productCartList;
            orderdetail.totalNumber = jsonstr.totalNumber;
            orderdetail.totalAmount = jsonstr.totalAmount;
        }catch(e){
            cartlist = null;
        }
        
        return cartlist;
    },
    //判断购物车中是否存在商品
    existproduct:function(id){  
        var result=false;
        try{
            var ShoppingCart = utils.getParam("ShoppingCart");
            var jsonstr = JSON.parse(ShoppingCart.substr(1,ShoppingCart.length));
            var cartlist = jsonstr.productCartList;
            for(var i in cartlist){
                if(cartlist[i].id == id){
                    result = true;
                }
            }
        }catch(e){
            result = false;
        }
        return result;
    },
    //删除购物车中商品
    deleteproduct:function(id){
        var ShoppingCart = utils.getParam("ShoppingCart");
        var jsonstr = JSON.parse(ShoppingCart.substr(1,ShoppingCart.length));
        var cartlist = jsonstr.productCartList;
        var list=[];
        for(var i in cartlist){
            if(cartlist[i].id==id){
                jsonstr.totalNumber=parseInt(jsonstr.totalNumber)-parseInt(cartlist[i].num);
                jsonstr.totalAmount=parseFloat(jsonstr.totalAmount)-parseInt(cartlist[i].num)*parseFloat(cartlist[i].price);
            }else{
                list.push(cartlist[i]);
            }
        }
        jsonstr.productCartList = list;
        orderdetail.totalNumber = jsonstr.totalNumber;
        orderdetail.totalAmount = jsonstr.totalAmount;
        utils.setParam("ShoppingCart","'"+JSON.stringify(jsonstr));
    }
};



buydetail={
    username:"",
    phone:"",
    address:"",
    zipcode:"",
    totalNumber:0,
    totalAmount:0.00    
}
buy = {
    //向购物车中添加商品
    addproduct:function(product){
        var ShoppingBuy = utils.getParam("ShoppingBuy");
        if(ShoppingBuy==null||ShoppingBuy==""){
            //第一次加入商品
            var jsonstr = {"productBuyList":[{"id":product.id,"name":product.name,"num":product.num,"price":product.price}],"totalNumber":product.num,"totalAmount":(product.price*product.num)};
            utils.setParam("ShoppingBuy","'"+JSON.stringify(jsonstr));
        }else{
            var jsonstr = JSON.parse(ShoppingBuy.substr(1,ShoppingBuy.length));
            var buylist = jsonstr.productBuyList;
            var result=false;
            //查找购物车中是否有该商品
            for(var i in buylist){
                if(buylist[i].id==product.id){
                    buylist[i].num=parseInt(buylist[i].num)+parseInt(product.num);
                    result = true;continue;
                }
            }
            if(!result){
                //没有该商品就直接加进去
                buylist.push({"id":product.id,"name":product.name,"num":product.num,"price":product.price});
            }
            //重新计算总价
            jsonstr.totalNumber=parseInt(jsonstr.totalNumber)+parseInt(product.num);
            jsonstr.totalAmount=parseFloat(jsonstr.totalAmount)+(parseInt(product.num)*parseFloat(product.price));
            buydetail.totalNumber = jsonstr.totalNumber;
            buydetail.totalAmount = jsonstr.totalAmount;
            //保存购物车
            utils.setParam("ShoppingBuy","'"+JSON.stringify(jsonstr));
        }
    },
    //修改给买商品数量
    updateproductnum:function(id,num){
        var ShoppingBuy = utils.getParam("ShoppingBuy");
        var jsonstr = JSON.parse(ShoppingBuy.substr(1,ShoppingBuy.length));
        var buylist = jsonstr.productBuyList;
        
        for(var i in buylist){
            if(buylist[i].id==id){
                jsonstr.totalNumber=parseInt(jsonstr.totalNumber)+(parseInt(num)-parseInt(buylist[i].num));
                jsonstr.totalAmount=parseFloat(jsonstr.totalAmount)+((parseInt(num)*parseFloat(buylist[i].price))-parseInt(buylist[i].num)*parseFloat(buylist[i].price));
                buylist[i].num=parseInt(num);
                
                buydetail.totalNumber = jsonstr.totalNumber;
                buydetail.totalAmount = jsonstr.totalAmount;
                utils.setParam("ShoppingBuy","'"+JSON.stringify(jsonstr));
                return;
            }
        }
    },
    //获取购物车中的所有商品
    getproductlist:function(){
        var buylist = null;
        try{
            var ShoppingBuy = utils.getParam("ShoppingBuy");
            var jsonstr = JSON.parse(ShoppingBuy.substr(1,ShoppingBuy.length));
            buylist = jsonstr.productBuyList;
            buydetail.totalNumber = jsonstr.totalNumber;
            buydetail.totalAmount = jsonstr.totalAmount;
         }catch(e){
            buylist = null;
         }
        return buylist;
    },
    //判断购物车中是否存在商品
    existproduct:function(id){
        var result = false;
        try{
            var ShoppingBuy = utils.getParam("ShoppingBuy");
            var jsonstr = JSON.parse(ShoppingBuy.substr(1,ShoppingBuy.length));
            var buylist = jsonstr.productBuyList;
           
            for(var i in buylist){
                if(buylist[i].id == id){
                    result = true;continue;
                }
            }
        }catch(e){
            result = false;
        }
        return result;
    },
    //删除购物车中商品
    deleteproduct:function(id){
        try{
            var ShoppingBuy = utils.getParam("ShoppingBuy");
            var jsonstr = JSON.parse(ShoppingBuy.substr(1,ShoppingBuy.length));
            var buylist = jsonstr.productBuyList;
            var list=[];
            for(var i in buylist){
                if(buylist[i].id==id){
                    jsonstr.totalNumber=parseInt(jsonstr.totalNumber)-parseInt(buylist[i].num);
                    jsonstr.totalAmount=parseFloat(jsonstr.totalAmount)-parseInt(buylist[i].num)*parseFloat(buylist[i].price);
                }else{
                    list.push(buylist[i]);
                }
            }
            jsonstr.productBuyList = list;
            buydetail.totalNumber = jsonstr.totalNumber;
            buydetail.totalAmount = jsonstr.totalAmount;
            utils.setParam("ShoppingBuy","'"+JSON.stringify(jsonstr));
        }catch(e){
            
        }
    },
    //删除所有商品
    removeAllproduct:function(){
        localStorage.removeItem("ShoppingBuy");
    }
};
