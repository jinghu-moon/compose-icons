package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMysql: ImageVector
    get() {
        if (_brandMysql != null) return _brandMysql!!
        _brandMysql = tablerOutlineIcon(
            name = "BrandMysql",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 21C11.573 19.974 9.41 17.146 9 15c-.486 .77-1.501 2-2 2C5.501 16.112 6.426 13.027 7 11 5.404 9.567 4.532 8.542 4.5 7 1.15 3.56 4.056 1.73 7 4h1c8.482 .5 6.421 8.07 9 11.5 2.295 .522 3.665 2.254 5 3.5-2.086-.2-2.784-.344-3.5 0 .478 1.64 2.123 2.2 3.5 3")
            addPathData("M9 7h.01")
        }
        return _brandMysql!!
    }

private var _brandMysql: ImageVector? = null
