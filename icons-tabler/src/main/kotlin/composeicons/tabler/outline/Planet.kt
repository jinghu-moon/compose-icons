package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = tablerOutlineIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.816 13.58c2.292 2.138 3.546 4 3.092 4.9-.745 1.46-5.783-.259-11.255-3.838C5.183 11.063 1.349 6.978 2.093 5.519c.464-.91 2.926-.444 5.803 .805")
            addPathData("M5 12c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C19 8.134 15.866 5 12 5 8.134 5 5 8.134 5 12")
        }
        return _planet!!
    }

private var _planet: ImageVector? = null
