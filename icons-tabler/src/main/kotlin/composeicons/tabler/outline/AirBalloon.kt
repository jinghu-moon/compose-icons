package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AirBalloon: ImageVector
    get() {
        if (_airBalloon != null) return _airBalloon!!
        _airBalloon = tablerOutlineIcon(
            name = "AirBalloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 20c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-1")
            addPathData("M12 16c3.314 0 6-4.686 6-8C18 4.686 15.314 2 12 2 8.686 2 6 4.686 6 8c0 3.314 2.686 8 6 8")
            addPathData("M10 9c0 3.866 .895 7 2 7 1.105 0 2-3.134 2-7C14 5.134 13.105 2 12 2 10.895 2 10 5.134 10 9")
        }
        return _airBalloon!!
    }

private var _airBalloon: ImageVector? = null
