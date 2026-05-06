package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = tablerOutlineIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.349 5.349l3.301 3.301c.225 .225 .352 .531 .352 .849 0 .318-.127 .624-.352 .849l-.972 .972c.999 3.292-.371 6.841-3.321 8.61C11.406 21.699 7.63 21.233 5.198 18.8 2.765 16.368 2.299 12.592 4.068 9.641 5.837 6.691 9.386 5.321 12.678 6.32l.972-.972c.225-.225 .531-.352 .849-.352 .318 0 .624 .127 .849 .352l.001 .001")
            addPathData("M17 7 18.293 5.707C18.746 5.254 19 4.64 19 4c0-.552 .448-1 1-1h1")
            addPathData("M7 13c0-1.657 1.343-3 3-3")
        }
        return _bomb!!
    }

private var _bomb: ImageVector? = null
