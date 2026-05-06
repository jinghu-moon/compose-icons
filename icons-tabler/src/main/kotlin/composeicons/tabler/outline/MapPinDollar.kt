package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinDollar: ImageVector
    get() {
        if (_mapPinDollar != null) return _mapPinDollar!!
        _mapPinDollar = tablerOutlineIcon(
            name = "MapPinDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M13.02 21.206c-.786 .465-1.787 .34-2.433-.306L6.343 16.657C3.862 14.175 3.288 10.366 4.928 7.263 6.567 4.16 10.038 2.488 13.486 3.14c3.448 .652 6.069 3.475 6.464 6.962")
            addPathData("M21 15h-2.5C17.672 15 17 15.672 17 16.5c0 .828 .672 1.5 1.5 1.5h1c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-2.5")
            addPathData("M19 21v1M19 14v1")
        }
        return _mapPinDollar!!
    }

private var _mapPinDollar: ImageVector? = null
