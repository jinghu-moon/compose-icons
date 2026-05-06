package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlphabetGreek: ImageVector
    get() {
        if (_alphabetGreek != null) return _alphabetGreek!!
        _alphabetGreek = tablerOutlineIcon(
            name = "AlphabetGreek",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 10v7")
            addPathData("M5 12c0-1.105 .895-2 2-2h1c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-1C5.895 17 5 16.105 5 15v-3")
            addPathData("M14 20v-11c0-1.105 .895-2 2-2h1c1.105 0 2 .895 2 2v1c0 1.105-.895 2-2 2 1.105 0 2 .895 2 2v1c0 1.105-.895 2-2 2")
        }
        return _alphabetGreek!!
    }

private var _alphabetGreek: ImageVector? = null
