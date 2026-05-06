package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Login2: ImageVector
    get() {
        if (_login2 != null) return _login2!!
        _login2 = tablerOutlineIcon(
            name = "Login2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 8v-2C9 4.895 9.895 4 11 4h7c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-7C9.895 20 9 19.105 9 18v-2")
            addPathData("M3 12h13L13 9")
            addPathData("M13 15l3-3")
        }
        return _login2!!
    }

private var _login2: ImageVector? = null
