package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BallAmericanFootball: ImageVector
    get() {
        if (_ballAmericanFootball != null) return _ballAmericanFootball!!
        _ballAmericanFootball = tablerOutlineIcon(
            name = "BallAmericanFootball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 9 9 15")
            addPathData("M10 12l2 2")
            addPathData("M12 10l2 2")
            addPathData("M8 21C8 18.239 5.761 16 3 16")
            addPathData("M16 3C8.82 3 3 8.82 3 16c0 2.761 2.239 5 5 5C15.18 21 21 15.18 21 8 21 5.239 18.761 3 16 3")
            addPathData("M16 3c0 2.761 2.239 5 5 5")
        }
        return _ballAmericanFootball!!
    }

private var _ballAmericanFootball: ImageVector? = null
