package com.zuolg.zsite.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zuolg.zsite.api.forms.TaxonomyForm;
import com.zuolg.zsite.constants.ActionsForSide;
import com.zuolg.zsite.service.SecurityService;

/**
 * 文章
 * 
 * @ClassName ArticleController
 * @author zuolangguo
 * @date 2016年11月24日 上午10:19:50
 */
@Controller
@RequestMapping(value = ActionsForSide.ADMIN)
public class AdminArticleController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AdminArticleController.class);

	@Value("${jmx.port}")
	private int jmxPort;

	@Autowired
	private SecurityService securityService;

	/**
	 * 所有文章
	 * 
	 * @Title:allArticle
	 * @param req
	 * @param resp
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = ActionsForSide.ADMIN_ALLARTICLE)
	public ModelAndView allArticle(HttpServletRequest req, HttpServletResponse resp, Model model) {

		return new ModelAndView("admin/allArticle");
	}

	/**
	 * 写文章
	 * 
	 * @Title:editArticle
	 * @param req
	 * @param resp
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = ActionsForSide.ADMIN_EDITARTICLE)
	public ModelAndView editArticle(HttpServletRequest req, HttpServletResponse resp, Model model) {

		return new ModelAndView("admin/editArticle");
	}

	/**
	 * 分类
	 * 
	 * @Title:category
	 * @param req
	 * @param resp
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = ActionsForSide.ADMIN_CATEGORY)
	public ModelAndView category(HttpServletRequest req, HttpServletResponse resp, Model model) {
		return new ModelAndView("admin/category");
	}

	@RequestMapping(value = ActionsForSide.ADMIN_CATEGORY_SAVE)
	public ModelAndView categorySave(TaxonomyForm form, HttpServletRequest req, HttpServletResponse resp, Model model) {
		
		System.out.println(form.getTitle());

		return new ModelAndView("admin/category");
	}

	/**
	 * 专题
	 * 
	 * @Title:feature
	 * @param req
	 * @param resp
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = ActionsForSide.ADMIN_FEATURE)
	public ModelAndView feature(HttpServletRequest req, HttpServletResponse resp, Model model) {

		return new ModelAndView("admin/feature");
	}

	/**
	 * 标签
	 * 
	 * @Title:tag
	 * @param req
	 * @param resp
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = ActionsForSide.ADMIN_TAG)
	public ModelAndView tag(HttpServletRequest req, HttpServletResponse resp, Model model) {

		return new ModelAndView("admin/tag");
	}

	/**
	 * 评论
	 * 
	 * @Title:comment
	 * @param req
	 * @param resp
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = ActionsForSide.ADMIN_COMMENT)
	public ModelAndView comment(HttpServletRequest req, HttpServletResponse resp, Model model) {

		return new ModelAndView("admin/comment");
	}

}