package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PigMoney: ImageVector
    get() {
        if (_pigMoney != null) return _pigMoney!!
        _pigMoney = tablerOutlineIcon(
            name = "PigMoney",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 11v.01")
            addPathData("M5.173 8.378C3.956 7.442 3.641 5.739 4.444 4.43 5.247 3.122 6.908 2.631 8.294 3.292c1.385 .661 2.048 2.262 1.535 3.709")
            addPathData("M16 4v3.803c1.238 .716 2.18 1.849 2.658 3.197h1.341c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-1.342c-.336 .95-.907 1.8-1.658 2.473v2.027c0 .828-.672 1.5-1.5 1.5-.828 0-1.5-.672-1.5-1.5v-.583c-.33 .055-.665 .083-1 .083h-4c-.335 0-.67-.028-1-.083v.583C7.999 20.328 7.327 21 6.499 21 5.671 21 4.999 20.328 4.999 19.5v-2-.027C3.144 15.815 2.505 13.184 3.393 10.859 4.281 8.535 6.511 7 8.999 7h2.5L15.999 4")
        }
        return _pigMoney!!
    }

private var _pigMoney: ImageVector? = null
