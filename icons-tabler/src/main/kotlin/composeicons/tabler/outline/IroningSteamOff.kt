package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IroningSteamOff: ImageVector
    get() {
        if (_ironingSteamOff != null) return _ironingSteamOff!!
        _ironingSteamOff = tablerOutlineIcon(
            name = "IroningSteamOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 4h7.459c1.467 0 2.718 1.06 2.959 2.507l.577 3.464 .81 4.865c.09 .544-.277 1.059-.821 1.15")
            addPathData("M16 16h-13C3 12.498 5.586 9.535 9.056 9.063")
            addPathData("M13 9h6.8")
            addPathData("M12 19v2")
            addPathData("M8 19 7 21")
            addPathData("M16 19l1 2")
            addPathData("M3 3 21 21")
        }
        return _ironingSteamOff!!
    }

private var _ironingSteamOff: ImageVector? = null
