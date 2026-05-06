package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterCaseLower: ImageVector
    get() {
        if (_letterCaseLower != null) return _letterCaseLower!!
        _letterCaseLower = tablerOutlineIcon(
            name = "LetterCaseLower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 15.5C3 17.433 4.567 19 6.5 19 8.433 19 10 17.433 10 15.5 10 13.567 8.433 12 6.5 12 4.567 12 3 13.567 3 15.5")
            addPathData("M10 12v7")
            addPathData("M14 15.5C14 17.433 15.567 19 17.5 19 19.433 19 21 17.433 21 15.5 21 13.567 19.433 12 17.5 12 15.567 12 14 13.567 14 15.5")
            addPathData("M21 12v7")
        }
        return _letterCaseLower!!
    }

private var _letterCaseLower: ImageVector? = null
