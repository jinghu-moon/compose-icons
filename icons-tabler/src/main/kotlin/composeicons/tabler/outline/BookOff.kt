package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BookOff: ImageVector
    get() {
        if (_bookOff != null) return _bookOff!!
        _bookOff = tablerOutlineIcon(
            name = "BookOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19c2.785-1.608 6.215-1.608 9 0 1.783-1.029 3.865-1.416 5.899-1.096")
            addPathData("M3 6c.664-.384 1.375-.681 2.114-.884M8.914 4.906C9.984 5.076 11.03 5.44 12 6c2.785-1.608 6.215-1.608 9 0")
            addPathData("M3 6v13")
            addPathData("M12 6v2M12 12v7")
            addPathData("M21 6v11")
            addPathData("M3 3 21 21")
        }
        return _bookOff!!
    }

private var _bookOff: ImageVector? = null
