package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AB2: ImageVector
    get() {
        if (_aB2 != null) return _aB2!!
        _aB2 = tablerOutlineIcon(
            name = "AB2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 21h3c.81 0 1.48-.67 1.48-1.48l.02-.02C20.5 18.68 19.81 18 19 18h-3v3")
            addPathData("M16 15h2.5c.84-.01 1.5 .66 1.5 1.5C20 17.34 19.34 18 18.5 18h-2.5v-3")
            addPathData("M4 9v-4C4 3.964 4.895 3 6 3c1.105 0 2 .964 2 2v4")
            addPathData("M2.99 11.98c0 4.971 4.029 9 9 9M20.99 11.98c0-4.971-4.029-9-9-9")
            addPathData("M8 7h-4")
        }
        return _aB2!!
    }

private var _aB2: ImageVector? = null
