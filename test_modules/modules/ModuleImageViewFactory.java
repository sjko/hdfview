/*****************************************************************************
 * Copyright by The HDF Group.                                               *
 * Copyright by the Board of Trustees of the University of Illinois.         *
 * All rights reserved.                                                      *
 *                                                                           *
 * This file is part of the HDF Java Products distribution.                  *
 * The full copyright notice, including terms governing use, modification,   *
 * and redistribution, is contained in the files COPYING and Copyright.html. *
 * COPYING can be found at the root of the source code distribution tree.    *
 * Or, see https://support.hdfgroup.org/products/licenses.html               *
 * If you do not have access to either file, you may request a copy from     *
 * help@hdfgroup.org.                                                        *
 ****************************************************************************/

package modules;

import java.util.HashMap;

import hdf.view.DataView.DataViewManager;
import hdf.view.ImageView.ImageView;
import hdf.view.ImageView.ImageViewFactory;

/*
 * A simple Factory class which returns a concrete instance of an external
 * ImageView module.
 *
 * This factory class is used to test HDFView's module loading and switching
 * capabilities.
 *
 * @author jhenderson
 * @version 1.0 7/30/2018
 */
public class ModuleImageViewFactory extends ImageViewFactory {

    @SuppressWarnings("rawtypes")
    @Override
    public ImageView getImageView(DataViewManager viewer, HashMap dataPropertiesMap) throws ClassNotFoundException {
        return new ImageViewModule();
    }

}