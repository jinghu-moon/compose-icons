package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IdOff: ImageVector
    get() {
        if (_idOff != null) return _idOff!!
        _idOff = tablerOutlineIcon(
            name = "IdOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h10c1.657 0 3 1.343 3 3v10M19.563 19.561C19.108 19.84 18.573 20 18 20h-12C4.343 20 3 18.657 3 17v-10C3 5.917 3.573 4.969 4.433 4.441")
            addPathData("M8.175 8.178C7.366 8.545 6.895 9.402 7.021 10.281c.125 .88 .816 1.571 1.695 1.698 .88 .127 1.737-.342 2.105-1.151")
            addPathData("M15 8h2")
            addPathData("M16 12h1")
            addPathData("M7 16h9")
            addPathData("M3 3 21 21")
        }
        return _idOff!!
    }

private var _idOff: ImageVector? = null
