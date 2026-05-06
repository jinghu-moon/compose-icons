package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Password: ImageVector
    get() {
        if (_password != null) return _password!!
        _password = tablerOutlineIcon(
            name = "Password",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10v4")
            addPathData("M10 13l4-2")
            addPathData("M10 11l4 2")
            addPathData("M5 10v4")
            addPathData("M3 13 7 11")
            addPathData("M3 11l4 2")
            addPathData("M19 10v4")
            addPathData("M17 13l4-2")
            addPathData("M17 11l4 2")
        }
        return _password!!
    }

private var _password: ImageVector? = null
