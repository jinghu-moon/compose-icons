package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PasswordUser: ImageVector
    get() {
        if (_passwordUser != null) return _passwordUser!!
        _passwordUser = tablerOutlineIcon(
            name = "PasswordUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17v4")
            addPathData("M10 20l4-2")
            addPathData("M10 18l4 2")
            addPathData("M5 17v4")
            addPathData("M3 20 7 18")
            addPathData("M3 18l4 2")
            addPathData("M19 17v4")
            addPathData("M17 20l4-2")
            addPathData("M17 18l4 2")
            addPathData("M9 6c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 4.343 13.657 3 12 3 10.343 3 9 4.343 9 6")
            addPathData("M7 14c0-1.105 .895-2 2-2h6c1.105 0 2 .895 2 2")
        }
        return _passwordUser!!
    }

private var _passwordUser: ImageVector? = null
