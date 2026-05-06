package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGuardian: ImageVector
    get() {
        if (_brandGuardian != null) return _brandGuardian!!
        _brandGuardian = tablerOutlineIcon(
            name = "BrandGuardian",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 13h6")
            addPathData("M4 12C4 2.704 13.5 3 13.5 3 10.692 3 9 7.373 9 12c0 4.627 1.763 8.976 4.572 8.976C13.572 20.999 4 22.068 4 12")
            addPathData("M14.5 3C15.916 3 18.353 4.16 19 5v3.5")
            addPathData("M15 13v8c0 0 2.77-.37 4-2v-6")
            addPathData("M13.5 21h1.5")
            addPathData("M13.5 3h1")
        }
        return _brandGuardian!!
    }

private var _brandGuardian: ImageVector? = null
