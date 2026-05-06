package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bong: ImageVector
    get() {
        if (_bong != null) return _bong!!
        _bong = tablerOutlineIcon(
            name = "Bong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 3v8.416c.134 .059 .265 .123 .393 .193L17 8l2 2-3.608 3.608c.986 1.811 .759 4.041-.572 5.617-1.33 1.575-3.491 2.172-5.442 1.503C7.428 20.059 6.088 18.262 6.005 16.201 5.921 14.141 7.11 12.241 9 11.416v-8.416h4")
            addPathData("M8 3h6")
            addPathData("M6.1 17h9.8")
        }
        return _bong!!
    }

private var _bong: ImageVector? = null
