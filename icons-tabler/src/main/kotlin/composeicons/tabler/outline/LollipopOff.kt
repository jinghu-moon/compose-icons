package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LollipopOff: ImageVector
    get() {
        if (_lollipopOff != null) return _lollipopOff!!
        _lollipopOff = tablerOutlineIcon(
            name = "LollipopOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.462 7.493c-.993 2.584-.369 5.511 1.59 7.466 1.96 1.955 4.888 2.572 7.47 1.573M18.938 14.962c2.738-2.729 2.745-7.162 .016-9.899C16.224 2.325 11.792 2.318 9.054 5.047")
            addPathData("M21 10C21 8.067 19.433 6.5 17.5 6.5 15.567 6.5 14 8.067 14 10")
            addPathData("M12.71 12.715c-1.048 .853-2.493 1.027-3.713 .447C7.777 12.582 7 11.351 7 10")
            addPathData("M14 17c.838 0 1.607-.294 2.209-.785M17.5 13.5C17.5 11.567 15.933 10 14 10")
            addPathData("M14 3C12.067 3 10.5 4.567 10.5 6.5")
            addPathData("M3 21 9 15")
            addPathData("M3 3 21 21")
        }
        return _lollipopOff!!
    }

private var _lollipopOff: ImageVector? = null
