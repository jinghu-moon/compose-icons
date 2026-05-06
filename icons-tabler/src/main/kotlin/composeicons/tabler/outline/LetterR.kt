package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterR: ImageVector
    get() {
        if (_letterR != null) return _letterR!!
        _letterR = tablerOutlineIcon(
            name = "LetterR",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 20v-16h5.5C14.985 4 17 6.015 17 8.5 17 10.985 14.985 13 12.5 13h-5.5")
            addPathData("M12 13l5 7")
        }
        return _letterR!!
    }

private var _letterR: ImageVector? = null
