package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sitemap: ImageVector
    get() {
        if (_sitemap != null) return _sitemap!!
        _sitemap = tablerOutlineIcon(
            name = "Sitemap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-2C3.895 21 3 20.105 3 19v-2")
            addPathData("M15 17c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-2c-1.105 0-2-.895-2-2v-2")
            addPathData("M9 5C9 3.895 9.895 3 11 3h2c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-2C9.895 9 9 8.105 9 7v-2")
            addPathData("M6 15v-1c0-1.105 .895-2 2-2h8c1.105 0 2 .895 2 2v1")
            addPathData("M12 9v3")
        }
        return _sitemap!!
    }

private var _sitemap: ImageVector? = null
