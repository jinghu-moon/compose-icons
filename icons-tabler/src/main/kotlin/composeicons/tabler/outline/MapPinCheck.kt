package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinCheck: ImageVector
    get() {
        if (_mapPinCheck != null) return _mapPinCheck!!
        _mapPinCheck = tablerOutlineIcon(
            name = "MapPinCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M11.87 21.48c-.484-.031-.94-.237-1.283-.58L6.343 16.657C3.588 13.901 3.22 9.561 5.471 6.38 7.722 3.2 11.937 2.103 15.452 3.784c3.515 1.681 5.308 5.65 4.246 9.399")
            addPathData("M15 19l2 2 4-4")
        }
        return _mapPinCheck!!
    }

private var _mapPinCheck: ImageVector? = null
