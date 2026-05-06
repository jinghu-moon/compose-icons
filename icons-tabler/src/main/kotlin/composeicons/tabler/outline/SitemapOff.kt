package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SitemapOff: ImageVector
    get() {
        if (_sitemapOff != null) return _sitemapOff!!
        _sitemapOff = tablerOutlineIcon(
            name = "SitemapOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17c0-1.105 .895-2 2-2h2c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-2C3.895 21 3 20.105 3 19v-2")
            addPathData("M19 15c1.105 0 2 .895 2 2M20.409 20.42C20.047 20.778 19.549 21 19 21h-2c-1.105 0-2-.895-2-2v-2c0-.549 .221-1.046 .579-1.407")
            addPathData("M9 5C9 3.895 9.895 3 11 3h2c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2")
            addPathData("M6 15v-1c0-1.105 .895-2 2-2h4M16 12c1.105 0 2 .895 2 2")
            addPathData("M3 3 21 21")
        }
        return _sitemapOff!!
    }

private var _sitemapOff: ImageVector? = null
