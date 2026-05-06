package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPushbullet: ImageVector
    get() {
        if (_brandPushbullet != null) return _brandPushbullet!!
        _brandPushbullet = tablerOutlineIcon(
            name = "BrandPushbullet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M11 8v8h2c2.209 0 4-1.791 4-4C17 9.791 15.209 8 13 8h-2")
            addPathData("M8 8v8")
        }
        return _brandPushbullet!!
    }

private var _brandPushbullet: ImageVector? = null
