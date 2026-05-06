package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAbstract: ImageVector
    get() {
        if (_brandAbstract != null) return _brandAbstract!!
        _brandAbstract = tablerOutlineIcon(
            name = "BrandAbstract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3c7.2 0 9 1.8 9 9 0 7.2-1.8 9-9 9C4.8 21 3 19.2 3 12 3 4.8 4.8 3 12 3")
            addPathData("M8 13.5C8 14.881 9.119 16 10.5 16 11.881 16 13 14.881 13 13.5 13 12.119 11.881 11 10.5 11 9.119 11 8 12.119 8 13.5")
            addPathData("M8 8h8v8")
        }
        return _brandAbstract!!
    }

private var _brandAbstract: ImageVector? = null
