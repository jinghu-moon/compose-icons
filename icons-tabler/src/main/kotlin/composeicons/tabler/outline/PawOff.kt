package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PawOff: ImageVector
    get() {
        if (_pawOff != null) return _pawOff!!
        _pawOff = tablerOutlineIcon(
            name = "PawOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.168 11.154c-.71 .31-1.184 1.107-2 2.593-.942 1.703-2.846 1.845-3.321 3.291-.097 .265-.145 .677-.143 .962 0 1.176 .787 2 1.8 2 1.259 0 3-1 4.5-1 1.5 0 3.241 1 4.5 1 .927 0 1.664-.689 1.783-1.708")
            addPathData("M20.188 8.082C20.06 8.028 19.921 8 19.782 8h-.015c-.735 .012-1.56 .75-1.993 1.866-.519 1.335-.28 2.7 .538 3.052 .129 .055 .267 .082 .406 .082 .739 0 1.575-.742 2.011-1.866 .516-1.335 .273-2.7-.54-3.052h-.001")
            addPathData("M11 6.992c.011-.242-.002-.485-.04-.725C10.757 4.97 9.913 4 9.028 4c-.275 .002-.542 .095-.758 .265")
            addPathData("M16.456 6.733C16.67 5.357 16.081 4.139 15.136 4.011 15.082 4.004 15.028 4 14.974 4c-.885 0-1.728 .97-1.93 2.267-.214 1.376 .375 2.594 1.32 2.722 .054 .007 .108 .011 .162 .011 .885 0 1.73-.974 1.93-2.267")
            addPathData("M5.69 12.918c.816-.352 1.054-1.719 .536-3.052C5.79 8.742 4.955 8 4.217 8c-.14 0-.277 .027-.407 .082-.816 .352-1.054 1.719-.536 3.052C3.71 12.258 4.545 13 5.283 13c.14 0 .277-.027 .407-.082")
            addPathData("M3 3 21 21")
        }
        return _pawOff!!
    }

private var _pawOff: ImageVector? = null
