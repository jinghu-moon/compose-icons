package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellQuestion: ImageVector
    get() {
        if (_bellQuestion != null) return _bellQuestion!!
        _bellQuestion = tablerOutlineIcon(
            name = "BellQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 17h-9.5c1.105-.626 1.847-1.739 2-3v-3C6.121 8.414 7.66 6.107 10 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 2.34 1.107 3.879 3.414 4 6")
            addPathData("M9 17v1c-.001 1.518 1.132 2.799 2.639 2.981 1.507 .183 2.914-.79 3.275-2.265")
            addPathData("M19 22v.01")
            addPathData("M19 19c.923-.003 1.724-.636 1.941-1.532 .217-.897-.207-1.826-1.027-2.25-.819-.42-1.819-.219-2.414 .483")
        }
        return _bellQuestion!!
    }

private var _bellQuestion: ImageVector? = null
