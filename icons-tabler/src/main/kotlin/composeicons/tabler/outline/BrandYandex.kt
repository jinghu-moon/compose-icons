package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandYandex: ImageVector
    get() {
        if (_brandYandex != null) return _brandYandex!!
        _brandYandex = tablerOutlineIcon(
            name = "BrandYandex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 20v-16h-2C10.791 4 9 5.791 9 8v1c0 2.209 1.791 4 4 4h2")
            addPathData("M9 20l3-7")
        }
        return _brandYandex!!
    }

private var _brandYandex: ImageVector? = null
