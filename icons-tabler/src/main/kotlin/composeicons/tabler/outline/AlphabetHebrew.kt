package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlphabetHebrew: ImageVector
    get() {
        if (_alphabetHebrew != null) return _alphabetHebrew!!
        _alphabetHebrew = tablerOutlineIcon(
            name = "AlphabetHebrew",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 6c2.333 5.143 6.611 6.857 9.333 12")
            addPathData("M13.667 14c2.505-1.5 2.666-4.141 2.666-5.333C16.333 6.889 15.89 6 15.89 6")
            addPathData("M7.485 18C7.485 18 7 17.095 7 15.286c0-1.172 .164-3.722 2.641-5.27")
        }
        return _alphabetHebrew!!
    }

private var _alphabetHebrew: ImageVector? = null
