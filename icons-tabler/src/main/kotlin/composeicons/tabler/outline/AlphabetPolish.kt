package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlphabetPolish: ImageVector
    get() {
        if (_alphabetPolish != null) return _alphabetPolish!!
        _alphabetPolish = tablerOutlineIcon(
            name = "AlphabetPolish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 10h2c1.105 0 2 .895 2 2v5h-3C6.895 17 6 16.105 6 15c0-1.105 .895-2 2-2h3")
            addPathData("M16 7v10")
            addPathData("M18 11l-4 2")
            addPathData("M10.5 17C9.672 17 9 17.672 9 18.5 9 19.328 9.672 20 10.5 20")
        }
        return _alphabetPolish!!
    }

private var _alphabetPolish: ImageVector? = null
