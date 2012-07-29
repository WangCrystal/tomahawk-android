/* == This file is part of Tomahawk Player - <http://tomahawk-player.org> ===
 *
 *   Copyright 2012, Christopher Reichert <creichert07@gmail.com>
 *
 *   Tomahawk is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Tomahawk is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Tomahawk. If not, see <http://www.gnu.org/licenses/>.
 */
package org.tomahawk.tomahawk_android;

import org.tomahawk.libtomahawk.Collection;

import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

public abstract class TomahawkListFragment extends ListFragment implements
        Collection.CollectionUpdateListener {

    /**
     * Returns the Adapter for this TomahawkListFragment.
     * @return
     */
    protected abstract ArrayAdapter<?> getAdapter();

    public void refresh() {
        if (getAdapter() != null)
            getAdapter().notifyDataSetChanged();
    }
}
