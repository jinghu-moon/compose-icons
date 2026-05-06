package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ankh: ImageVector
    get() {
        if (_ankh != null) return _ankh!!
        _ankh = tablerOutlineIcon(
            name = "Ankh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 13h12")
            addPathData("M12 21v-8l-.422-.211C9.385 11.693 8 9.452 8 7 8 4.791 9.791 3 12 3c2.209 0 4 1.791 4 4 0 2.452-1.385 4.693-3.578 5.789L12 13")
        }
        return _ankh!!
    }

private var _ankh: ImageVector? = null
