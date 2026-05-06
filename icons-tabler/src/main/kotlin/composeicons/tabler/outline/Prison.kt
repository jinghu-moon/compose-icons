package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Prison: ImageVector
    get() {
        if (_prison != null) return _prison!!
        _prison = tablerOutlineIcon(
            name = "Prison",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 4v16")
            addPathData("M14 4v16")
            addPathData("M6 4v5")
            addPathData("M6 15v5")
            addPathData("M10 4v5")
            addPathData("M11 9h-6v6h6v-6")
            addPathData("M10 15v5")
            addPathData("M8 12h-.01")
        }
        return _prison!!
    }

private var _prison: ImageVector? = null
