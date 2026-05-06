package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterCaseToggle: ImageVector
    get() {
        if (_letterCaseToggle != null) return _letterCaseToggle!!
        _letterCaseToggle = tablerOutlineIcon(
            name = "LetterCaseToggle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 15.5C3 17.433 4.567 19 6.5 19 8.433 19 10 17.433 10 15.5 10 13.567 8.433 12 6.5 12 4.567 12 3 13.567 3 15.5")
            addPathData("M14 19v-10.5C14 6.567 15.567 5 17.5 5 19.433 5 21 6.567 21 8.5v10.5")
            addPathData("M14 13h7")
            addPathData("M10 12v7")
        }
        return _letterCaseToggle!!
    }

private var _letterCaseToggle: ImageVector? = null
