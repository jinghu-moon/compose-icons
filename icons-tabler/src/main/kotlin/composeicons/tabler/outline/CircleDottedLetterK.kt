package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleDottedLetterK: ImageVector
    get() {
        if (_circleDottedLetterK != null) return _circleDottedLetterK!!
        _circleDottedLetterK = tablerOutlineIcon(
            name = "CircleDottedLetterK",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 8v8")
            addPathData("M14 8l-2.5 4L14 16")
            addPathData("M10 12h1.5")
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
        return _circleDottedLetterK!!
    }

private var _circleDottedLetterK: ImageVector? = null
