package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSlack: ImageVector
    get() {
        if (_brandSlack != null) return _brandSlack!!
        _brandSlack = tablerOutlineIcon(
            name = "BrandSlack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v-6c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v6M16 10c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-6")
            addPathData("M12 12h6c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-6M14 16c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-6")
            addPathData("M12 12v6c0 1.105-.895 2-2 2C8.895 20 8 19.105 8 18v-6M8 14c0 1.105-.895 2-2 2C4.895 16 4 15.105 4 14c0-1.105 .895-2 2-2h6")
            addPathData("M12 12h-6C4.895 12 4 11.105 4 10 4 8.895 4.895 8 6 8h6M10 8C8.895 8 8 7.105 8 6 8 4.895 8.895 4 10 4c1.105 0 2 .895 2 2v6")
        }
        return _brandSlack!!
    }

private var _brandSlack: ImageVector? = null
