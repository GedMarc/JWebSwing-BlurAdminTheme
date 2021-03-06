/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.bluradmin.layout.footer;

import java.io.Serializable;

/**
 * Called when side bar is ready to be created or anytime that the page footer is sent back
 *
 * @author GedMarc
 * @since 13 Jun 2017
 */
public interface BlurAdminFooter
		extends Serializable
{

	/**
	 * Called to build the sidebar
	 *
	 * @param footer
	 * @param queryParameters
	 * @param localStorage
	 * @param sessionStorage
	 */
	void buildFooter(Footer footer, java.util.Map<String, String[]> queryParameters, java.util.Map<String, String> localStorage, java.util.Map<String, String> sessionStorage);

	/**
	 * returns the sort order, boxed for sorting
	 *
	 * @return
	 */
	Integer sortOrder();
}
