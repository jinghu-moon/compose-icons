package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Login: ImageVector
    get() {
        if (_login != null) return _login!!
        _login = tablerOutlineIcon(
            name = "Login",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8v-2C15 4.895 14.105 4 13 4h-7C4.895 4 4 4.895 4 6v12c0 1.105 .895 2 2 2h7c1.105 0 2-.895 2-2v-2")
            addPathData("M21 12h-13L11 9")
            addPathData("M11 15 8 12")
        }
        return _login!!
    }

private var _login: ImageVector? = null
