package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PasswordMobilePhone: ImageVector
    get() {
        if (_passwordMobilePhone != null) return _passwordMobilePhone!!
        _passwordMobilePhone = tablerOutlineIcon(
            name = "PasswordMobilePhone",
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
            addPathData("M7 14v-8C7 4.895 7.895 4 9 4h6c1.105 0 2 .895 2 2v8")
            addPathData("M11 5h2")
            addPathData("M12 17v.01")
        }
        return _passwordMobilePhone!!
    }

private var _passwordMobilePhone: ImageVector? = null
