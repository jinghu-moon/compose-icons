package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ColorFilter: ImageVector
    get() {
        if (_colorFilter != null) return _colorFilter!!
        _colorFilter = tablerOutlineIcon(
            name = "ColorFilter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.58 13.79c.27 .68 .42 1.43 .42 2.21 0 1.77-.77 3.37-2 4.46C10.905 21.454 9.479 22.003 8 22 4.69 22 2 19.31 2 16 2 13.24 3.88 10.9 6.42 10.21")
            addPathData("M17.58 10.21C20.12 10.9 22 13.24 22 16c0 3.31-2.69 6-6 6-1.479 .003-2.905-.546-4-1.54")
            addPathData("M6 8c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C18 4.686 15.314 2 12 2 8.686 2 6 4.686 6 8")
        }
        return _colorFilter!!
    }

private var _colorFilter: ImageVector? = null
