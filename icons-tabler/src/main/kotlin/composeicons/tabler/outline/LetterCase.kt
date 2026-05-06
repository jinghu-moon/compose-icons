package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterCase: ImageVector
    get() {
        if (_letterCase != null) return _letterCase!!
        _letterCase = tablerOutlineIcon(
            name = "LetterCase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 15.5C14 17.433 15.567 19 17.5 19 19.433 19 21 17.433 21 15.5 21 13.567 19.433 12 17.5 12 15.567 12 14 13.567 14 15.5")
            addPathData("M3 19v-10.5C3 6.567 4.567 5 6.5 5 8.433 5 10 6.567 10 8.5v10.5")
            addPathData("M3 13h7")
            addPathData("M21 12v7")
        }
        return _letterCase!!
    }

private var _letterCase: ImageVector? = null
