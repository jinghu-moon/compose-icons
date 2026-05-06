package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinExclamation: ImageVector
    get() {
        if (_mapPinExclamation != null) return _mapPinExclamation!!
        _mapPinExclamation = tablerOutlineIcon(
            name = "MapPinExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M15.005 19.31l-1.591 1.59c-.781 .78-2.046 .78-2.827 0L6.343 16.657C3.693 14.007 3.238 9.872 5.248 6.709 7.259 3.546 11.196 2.203 14.72 3.477c3.525 1.274 5.692 4.825 5.215 8.542")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _mapPinExclamation!!
    }

private var _mapPinExclamation: ImageVector? = null
