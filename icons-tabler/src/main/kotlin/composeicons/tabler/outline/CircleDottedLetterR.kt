package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleDottedLetterR: ImageVector
    get() {
        if (_circleDottedLetterR != null) return _circleDottedLetterR!!
        _circleDottedLetterR = tablerOutlineIcon(
            name = "CircleDottedLetterR",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12h2c1.105 0 2-.895 2-2C14 8.895 13.105 8 12 8h-2v8M14 16 11 12")
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
        return _circleDottedLetterR!!
    }

private var _circleDottedLetterR: ImageVector? = null
