package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClothesRackOff: ImageVector
    get() {
        if (_clothesRackOff != null) return _clothesRackOff!!
        _clothesRackOff = tablerOutlineIcon(
            name = "ClothesRackOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2")
            addPathData("M12 7v1M12 12v9")
            addPathData("M9 21h6")
            addPathData("M7.757 9.243c.853 .853 1.944 1.429 3.129 1.653M14.464 10.472c.663-.299 1.265-.715 1.779-1.229")
            addPathData("M3 3 21 21")
        }
        return _clothesRackOff!!
    }

private var _clothesRackOff: ImageVector? = null
