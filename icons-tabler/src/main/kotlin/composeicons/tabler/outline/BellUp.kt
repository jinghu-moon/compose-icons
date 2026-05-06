package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellUp: ImageVector
    get() {
        if (_bellUp != null) return _bellUp!!
        _bellUp = tablerOutlineIcon(
            name = "BellUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 17h-8.5c1.105-.626 1.847-1.739 2-3v-3C6.121 8.414 7.66 6.107 10 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 2.34 1.107 3.879 3.414 4 6v1")
            addPathData("M9 17v1c-0 .881 .387 1.718 1.06 2.288 .672 .57 1.561 .816 2.43 .672")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _bellUp!!
    }

private var _bellUp: ImageVector? = null
