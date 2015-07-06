/*
 * SourceSatellitePresenter.java
 *
 * Copyright (C) 2009-15 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */

package org.rstudio.studio.client.workbench.views.source;

import org.rstudio.core.client.command.CommandBinder;
import org.rstudio.studio.client.workbench.commands.Commands;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class SourceSatellitePresenter implements IsWidget
{
   public interface Binder 
          extends CommandBinder<Commands, SourceSatellitePresenter>
   {}

   @Inject
   public SourceSatellitePresenter()
   {
   }     

   @Override
   public Widget asWidget()
   {
      return new Label("Source Satellite");
   }
}