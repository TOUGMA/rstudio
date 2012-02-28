/*
 * ScaleChangeEvent.java
 *
 * Copyright (C) 2009-11 by RStudio, Inc.
 *
 * This program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.pdfviewer.pdfjs.events;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class ScaleChangeEvent extends GwtEvent<ScaleChangeEvent.Handler>
{
   public interface Handler extends EventHandler
   {
      void onScaleChange(ScaleChangeEvent event);
   }

   public ScaleChangeEvent(double scale)
   {
      scale_ = scale;
   }

   public double getScale()
   {
      return scale_;
   }

   @Override
   public Type<Handler> getAssociatedType()
   {
      return TYPE;
   }

   @Override
   protected void dispatch(Handler handler)
   {
      handler.onScaleChange(this);
   }

   private final double scale_;

   public static final Type<Handler> TYPE = new Type<Handler>();
}
