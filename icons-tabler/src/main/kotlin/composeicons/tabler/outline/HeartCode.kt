package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartCode: ImageVector
    get() {
        if (_heartCode != null) return _heartCode!!
        _heartCode = tablerOutlineIcon(
            name = "HeartCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.5 12.572l-.536 .53M11.054 19.062 4.5 12.573C3.153 11.26 2.657 9.303 3.215 7.507 3.774 5.711 5.294 4.38 7.148 4.064 9.002 3.747 10.877 4.497 12 6.006 13.127 4.507 14.999 3.765 16.847 4.084c1.848 .319 3.363 1.646 3.922 3.437 .559 1.79 .069 3.743-1.269 5.058")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _heartCode!!
    }

private var _heartCode: ImageVector? = null
