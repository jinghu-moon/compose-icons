package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = tablerOutlineIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21.5c-3.04 0-5.952-.714-8.5-1.983L12 3l8.5 16.517C17.858 20.826 14.948 21.504 12 21.5")
            addPathData("M5.38 15.866c2.11 1.077 4.446 1.637 6.815 1.634 2.251 .003 4.474-.503 6.502-1.479")
            addPathData("M13 11.01v-.01")
            addPathData("M11 14v-.01")
        }
        return _pizza!!
    }

private var _pizza: ImageVector? = null
