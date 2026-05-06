package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PasswordFingerprint: ImageVector
    get() {
        if (_passwordFingerprint != null) return _passwordFingerprint!!
        _passwordFingerprint = tablerOutlineIcon(
            name = "PasswordFingerprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 8c.788 1 1 2 1 3v1")
            addPathData("M9 11C9 9.422 10.343 8 12 8c1.657 0 3 1.422 3 3v2")
            addPathData("M12 11v2")
            addPathData("M6 12v-1.397C5.994 8.604 7.136 6.754 8.993 5.753 10.869 4.751 13.122 4.749 15 5.748")
            addPathData("M12 17v4")
            addPathData("M10 20l4-2")
            addPathData("M10 18l4 2")
            addPathData("M5 17v4")
            addPathData("M3 20 7 18")
            addPathData("M3 18l4 2")
            addPathData("M19 17v4")
            addPathData("M17 20l4-2")
            addPathData("M17 18l4 2")
        }
        return _passwordFingerprint!!
    }

private var _passwordFingerprint: ImageVector? = null
