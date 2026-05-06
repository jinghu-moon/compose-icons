package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Propeller: ImageVector
    get() {
        if (_propeller != null) return _propeller!!
        _propeller = tablerOutlineIcon(
            name = "Propeller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 13c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M14.167 10.5c.722-1.538 1.156-3.043 1.303-4.514C15.69 4.356 14.708 3 12 3 9.292 3 8.31 4.357 8.53 5.986c.147 1.471 .581 2.976 1.303 4.514")
            addPathData("M13.169 16.751c.97 1.395 2.057 2.523 3.257 3.386 1.3 1 2.967 .833 4.321-1.512 1.354-2.345 .67-3.874-.85-4.498-1.348-.608-2.868-.985-4.562-1.128")
            addPathData("M8.664 13c-1.693 .143-3.213 .52-4.56 1.128-1.522 .623-2.206 2.153-.852 4.498 1.354 2.345 3.02 2.517 4.321 1.512 1.2-.863 2.287-1.991 3.258-3.386")
        }
        return _propeller!!
    }

private var _propeller: ImageVector? = null
