package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerTrackNext: ImageVector
    get() {
        if (_playerTrackNext != null) return _playerTrackNext!!
        _playerTrackNext = tablerFilledIcon(
            name = "PlayerTrackNext",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 5v14c0 .86 1.012 1.318 1.659 .753l8-7c.217-.19 .342-.464 .342-.753 0-.289-.125-.563-.342-.753L3.659 4.247C3.012 3.682 2 4.141 2 5Z")
            addPathData("M13 5v14c0 .86 1.012 1.318 1.659 .753l8-7c.217-.19 .342-.464 .342-.753 0-.289-.125-.563-.342-.753l-8-7C14.012 3.682 13 4.141 13 5Z")
        }
        return _playerTrackNext!!
    }

private var _playerTrackNext: ImageVector? = null
