package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCrunchbase: ImageVector
    get() {
        if (_brandCrunchbase != null) return _brandCrunchbase!!
        _brandCrunchbase = tablerOutlineIcon(
            name = "BrandCrunchbase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19v-14C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19")
            addPathData("M10.414 11.586c-.572-.572-1.432-.743-2.18-.434C7.487 11.462 7 12.191 7 13c0 .809 .487 1.538 1.235 1.848 .747 .31 1.608 .138 2.18-.434")
            addPathData("M13 13c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M13 7v6")
        }
        return _brandCrunchbase!!
    }

private var _brandCrunchbase: ImageVector? = null
