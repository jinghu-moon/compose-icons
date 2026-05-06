package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Abacus: ImageVector
    get() {
        if (_abacus != null) return _abacus!!
        _abacus = tablerOutlineIcon(
            name = "Abacus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3v18")
            addPathData("M19 21v-18")
            addPathData("M5 7h14")
            addPathData("M5 15h14")
            addPathData("M8 13v4")
            addPathData("M11 13v4")
            addPathData("M16 13v4")
            addPathData("M14 5v4")
            addPathData("M11 5v4")
            addPathData("M8 5v4")
            addPathData("M3 21h18")
        }
        return _abacus!!
    }

private var _abacus: ImageVector? = null
