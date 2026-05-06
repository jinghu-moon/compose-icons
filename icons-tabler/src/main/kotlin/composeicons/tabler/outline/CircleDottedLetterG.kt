package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleDottedLetterG: ImageVector
    get() {
        if (_circleDottedLetterG != null) return _circleDottedLetterG!!
        _circleDottedLetterG = tablerOutlineIcon(
            name = "CircleDottedLetterG",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8h-2c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h2v-4h-1")
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
        return _circleDottedLetterG!!
    }

private var _circleDottedLetterG: ImageVector? = null
