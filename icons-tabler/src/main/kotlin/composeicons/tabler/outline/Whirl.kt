package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Whirl: ImageVector
    get() {
        if (_whirl != null) return _whirl!!
        _whirl = tablerOutlineIcon(
            name = "Whirl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 12c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M12 21C8.686 21 6 18.538 6 15.5 6 12.462 8.686 10 12 10")
            addPathData("M21 12c0 3.314-2.462 6-5.5 6C12.462 18 10 15.314 10 12")
            addPathData("M12 14c3.314 0 6-2.462 6-5.5C18 5.462 15.314 3 12 3")
            addPathData("M14 12C14 8.686 11.538 6 8.5 6 5.462 6 3 8.686 3 12")
        }
        return _whirl!!
    }

private var _whirl: ImageVector? = null
