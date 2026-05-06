package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlphabetCyrillic: ImageVector
    get() {
        if (_alphabetCyrillic != null) return _alphabetCyrillic!!
        _alphabetCyrillic = tablerOutlineIcon(
            name = "AlphabetCyrillic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 10h2c1.105 0 2 .895 2 2v5h-3C5.895 17 5 16.105 5 15c0-1.105 .895-2 2-2h3")
            addPathData("M19 7h-3c-1.105 0-2 .895-2 2v6c0 1.105 .895 2 2 2h1c1.105 0 2-.895 2-2v-3c0-1.105-.895-2-2-2h-3")
        }
        return _alphabetCyrillic!!
    }

private var _alphabetCyrillic: ImageVector? = null
