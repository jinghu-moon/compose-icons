package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pig: ImageVector
    get() {
        if (_pig != null) return _pig!!
        _pig = tablerOutlineIcon(
            name = "Pig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 11v.01")
            addPathData("M16 3v3.803c1.238 .716 2.18 1.849 2.658 3.197h1.341c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-1.342c-.336 .95-.907 1.801-1.658 2.473v2.027c0 .828-.672 1.5-1.5 1.5-.828 0-1.5-.672-1.5-1.5v-.583c-.33 .055-.665 .083-1 .083h-4c-.335 0-.67-.028-1-.083v.583C7.999 19.328 7.327 20 6.499 20 5.671 20 4.999 19.328 4.999 18.5v-2-.027C3.144 14.815 2.505 12.184 3.393 9.859 4.281 7.535 6.511 6 8.999 6h2.5L15.999 3")
        }
        return _pig!!
    }

private var _pig: ImageVector? = null
