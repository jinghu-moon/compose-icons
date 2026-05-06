package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinQuestion: ImageVector
    get() {
        if (_mapPinQuestion != null) return _mapPinQuestion!!
        _mapPinQuestion = tablerOutlineIcon(
            name = "MapPinQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M14.997 19.317l-1.583 1.583c-.781 .78-2.046 .78-2.827 0L6.343 16.657C3.777 14.09 3.26 10.117 5.084 6.979 6.909 3.842 10.617 2.325 14.118 3.286c3.5 .961 5.915 4.158 5.882 7.787")
            addPathData("M19 22v.01")
            addPathData("M19 19c.923-.003 1.724-.636 1.941-1.532 .217-.897-.207-1.826-1.027-2.25-.819-.42-1.819-.219-2.414 .483")
        }
        return _mapPinQuestion!!
    }

private var _mapPinQuestion: ImageVector? = null
