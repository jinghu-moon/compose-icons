package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPushover: ImageVector
    get() {
        if (_brandPushover != null) return _brandPushover!!
        _brandPushover = tablerOutlineIcon(
            name = "BrandPushover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.16 10.985C5.33 9.05 7.69 3 14.355 3 17.688 3 19 4.382 19 6.9 19 9.497 16.388 13 10 13")
            addPathData("M12.5 6 7 21")
        }
        return _brandPushover!!
    }

private var _brandPushover: ImageVector? = null
