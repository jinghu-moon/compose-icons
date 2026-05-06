package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPython: ImageVector
    get() {
        if (_brandPython != null) return _brandPython!!
        _brandPython = tablerOutlineIcon(
            name = "BrandPython",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 9h-7C3.895 9 3 9.895 3 11v4c0 1.105 .895 2 2 2h3")
            addPathData("M12 15h7c1.105 0 2-.895 2-2v-4C21 7.895 20.105 7 19 7h-3")
            addPathData("M8 9v-4C8 3.895 8.895 3 10 3h4c1.105 0 2 .895 2 2v5c0 1.105-.895 2-2 2h-4c-1.105 0-2 .895-2 2v5c0 1.105 .895 2 2 2h4c1.105 0 2-.895 2-2v-4")
            addPathData("M11 6v.01")
            addPathData("M13 18v.01")
        }
        return _brandPython!!
    }

private var _brandPython: ImageVector? = null
