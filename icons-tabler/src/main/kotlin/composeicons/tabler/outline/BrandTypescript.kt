package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTypescript: ImageVector
    get() {
        if (_brandTypescript != null) return _brandTypescript!!
        _brandTypescript = tablerOutlineIcon(
            name = "BrandTypescript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 17.5c.32 .32 .754 .5 1.207 .5h.543C17.44 18 18 17.44 18 16.75v-.25C18 15.672 17.328 15 16.5 15 15.672 15 15 14.328 15 13.5v-.25C15 12.56 15.56 12 16.25 12h.543c.453 0 .887 .18 1.207 .5")
            addPathData("M9 12h4")
            addPathData("M11 12v6")
            addPathData("M21 19v-14C21 3.895 20.105 3 19 3h-14C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2")
        }
        return _brandTypescript!!
    }

private var _brandTypescript: ImageVector? = null
