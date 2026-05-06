package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EPassport: ImageVector
    get() {
        if (_ePassport != null) return _ePassport!!
        _ePassport = tablerOutlineIcon(
            name = "EPassport",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 7C2 5.895 2.895 5 4 5h16c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-16C2.895 19 2 18.105 2 17v-10")
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
            addPathData("M9 12h-7")
            addPathData("M15 12h7")
        }
        return _ePassport!!
    }

private var _ePassport: ImageVector? = null
