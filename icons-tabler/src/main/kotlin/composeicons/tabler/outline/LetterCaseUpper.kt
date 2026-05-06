package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterCaseUpper: ImageVector
    get() {
        if (_letterCaseUpper != null) return _letterCaseUpper!!
        _letterCaseUpper = tablerOutlineIcon(
            name = "LetterCaseUpper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19v-10.5C3 6.567 4.567 5 6.5 5 8.433 5 10 6.567 10 8.5v10.5")
            addPathData("M3 13h7")
            addPathData("M14 19v-10.5C14 6.567 15.567 5 17.5 5 19.433 5 21 6.567 21 8.5v10.5")
            addPathData("M14 13h7")
        }
        return _letterCaseUpper!!
    }

private var _letterCaseUpper: ImageVector? = null
