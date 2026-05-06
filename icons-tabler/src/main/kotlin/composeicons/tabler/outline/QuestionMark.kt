package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = tablerOutlineIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8C8 6.343 9.567 5 11.5 5h1C14.433 5 16 6.343 16 8c.076 1.334-.74 2.557-2 3-1.26 .591-2.076 2.222-2 4")
            addPathData("M12 19v.01")
        }
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
