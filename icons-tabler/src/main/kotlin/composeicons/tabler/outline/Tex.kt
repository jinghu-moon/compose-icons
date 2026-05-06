package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tex: ImageVector
    get() {
        if (_tex != null) return _tex!!
        _tex = tablerOutlineIcon(
            name = "Tex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 8v-1h-6v1")
            addPathData("M6 15v-8")
            addPathData("M21 15 16 7")
            addPathData("M16 15 21 7")
            addPathData("M14 11h-4v8h4")
            addPathData("M10 15h3")
        }
        return _tex!!
    }

private var _tex: ImageVector? = null
