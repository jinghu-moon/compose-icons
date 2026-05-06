package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayerTrackPrev: ImageVector
    get() {
        if (_playerTrackPrev != null) return _playerTrackPrev!!
        _playerTrackPrev = tablerFilledIcon(
            name = "PlayerTrackPrev",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.341 4.247l-8 7c-.217 .19-.342 .464-.342 .753 0 .289 .125 .563 .342 .753l8 7C20.988 20.318 22 19.859 22 19v-14C22 4.14 20.988 3.682 20.341 4.247Z")
            addPathData("M9.341 4.247 1.341 11.247c-.217 .19-.342 .464-.342 .753 0 .289 .125 .563 .342 .753l8 7C9.988 20.318 11 19.859 11 19v-14C11 4.14 9.988 3.682 9.341 4.247Z")
        }
        return _playerTrackPrev!!
    }

private var _playerTrackPrev: ImageVector? = null
