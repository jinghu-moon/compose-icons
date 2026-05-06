package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleDottedLetterN: ImageVector
    get() {
        if (_circleDottedLetterN != null) return _circleDottedLetterN!!
        _circleDottedLetterN = tablerOutlineIcon(
            name = "CircleDottedLetterN",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 16v-8l4 8v-8")
            addPathData("M7.5 4.21v.01")
            addPathData("M4.21 7.5v.01")
            addPathData("M3 12v.01")
            addPathData("M4.21 16.5v.01")
            addPathData("M7.5 19.79v.01")
            addPathData("M12 21v.01")
            addPathData("M16.5 19.79v.01")
            addPathData("M19.79 16.5v.01")
            addPathData("M21 12v.01")
            addPathData("M19.79 7.5v.01")
            addPathData("M16.5 4.21v.01")
            addPathData("M12 3v.01")
        }
        return _circleDottedLetterN!!
    }

private var _circleDottedLetterN: ImageVector? = null
