package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PigOff: ImageVector
    get() {
        if (_pigOff != null) return _pigOff!!
        _pigOff = tablerOutlineIcon(
            name = "PigOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 11v.01")
            addPathData("M10 6h1.499L15.999 3v3.803c1.238 .716 2.18 1.849 2.658 3.197h1.341c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-1.342c-.057 .16-.12 .318-.19 .472M16.999 17v1.5c0 .828-.672 1.5-1.5 1.5-.828 0-1.5-.672-1.5-1.5v-.583c-.33 .055-.665 .083-1 .083h-4c-.335 0-.67-.028-1-.083v.583C7.999 19.328 7.327 20 6.499 20 5.671 20 4.999 19.328 4.999 18.5v-2-.027C3.49 15.124 2.763 13.105 3.065 11.104 3.368 9.102 4.659 7.388 6.499 6.545")
            addPathData("M3 3 21 21")
        }
        return _pigOff!!
    }

private var _pigOff: ImageVector? = null
