/*
 * Copyright (C) 2018 Light Team Software
 *
 * This file is part of ModPE IDE.
 *
 * ModPE IDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ModPE IDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package com.KillerBLS.modpeide.utils.commons;

public interface EditorDelegate {
    void notifySaveClicked();
    void notifyCutClicked();
    void notifyCopyClicked();
    void notifyPasteClicked();
    void notifySelectAllClicked();
    void notifySelectLineClicked();
    void notifyDeleteLineClicked();
    void notifyDuplicateLineClicked();
    void notifyFindClicked(String text, boolean matchCase, boolean regExp, boolean wordOnly);
    void notifyReplaceAllClicked(String replaceWhat, String replaceWith);
    void notifyGoToLineClicked(int line);
    void notifyInsertClicked(String text);
    void notifyUndoClicked();
    void notifyRedoClicked();
}