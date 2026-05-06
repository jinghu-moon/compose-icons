package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoSquareRounded: ImageVector
    get() {
        if (_photoSquareRounded != null) return _photoSquareRounded!!
        _photoSquareRounded = tablerOutlineIcon(
            name = "PhotoSquareRounded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M12 3c7.2 0 9 1.8 9 9 0 7.2-1.8 9-9 9C4.8 21 3 19.2 3 12 3 4.8 4.8 3 12 3")
            addPathData("M3.5 15.5 8 11c.928-.893 2.072-.893 3 0l5 5")
            addPathData("M14 14l1-1c.928-.893 2.072-.893 3 0l2.5 2.5")
        }
        return _photoSquareRounded!!
    }

private var _photoSquareRounded: ImageVector? = null
