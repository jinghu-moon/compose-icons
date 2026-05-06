package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BallVolleyball: ImageVector
    get() {
        if (_ballVolleyball != null) return _ballVolleyball!!
        _ballVolleyball = tablerOutlineIcon(
            name = "BallVolleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M12 12c1.603 2.839 4.767 4.421 8 4")
            addPathData("M7.5 13.5C9.157 16.88 12.304 19.286 16 20")
            addPathData("M12 12C8.74 11.969 5.788 13.918 4.536 16.928")
            addPathData("M12.951 7.353C9.195 7.098 5.537 8.62 3.071 11.464")
            addPathData("M12 12C13.657 9.193 13.445 5.661 11.464 3.072")
            addPathData("M15.549 15.147C17.648 12.022 18.159 8.094 16.929 4.536")
        }
        return _ballVolleyball!!
    }

private var _ballVolleyball: ImageVector? = null
