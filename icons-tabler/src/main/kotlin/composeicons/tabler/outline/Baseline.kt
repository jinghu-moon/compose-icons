package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Baseline: ImageVector
    get() {
        if (_baseline != null) return _baseline!!
        _baseline = tablerOutlineIcon(
            name = "Baseline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h16")
            addPathData("M8 16v-8C8 5.791 9.791 4 12 4c2.209 0 4 1.791 4 4v8")
            addPathData("M8 10h8")
        }
        return _baseline!!
    }

private var _baseline: ImageVector? = null
