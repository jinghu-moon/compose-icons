package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterF: ImageVector
    get() {
        if (_letterF != null) return _letterF!!
        _letterF = tablerOutlineIcon(
            name = "LetterF",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 4h-10v16")
            addPathData("M7 12h8")
        }
        return _letterF!!
    }

private var _letterF: ImageVector? = null
