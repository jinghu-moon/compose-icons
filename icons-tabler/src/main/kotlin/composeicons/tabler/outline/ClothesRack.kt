package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClothesRack: ImageVector
    get() {
        if (_clothesRack != null) return _clothesRack!!
        _clothesRack = tablerOutlineIcon(
            name = "ClothesRack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2")
            addPathData("M12 7v14")
            addPathData("M9 21h6")
            addPathData("M7.757 9.243c1.125 1.125 2.652 1.758 4.243 1.758 1.591 0 3.118-.632 4.243-1.758")
        }
        return _clothesRack!!
    }

private var _clothesRack: ImageVector? = null
