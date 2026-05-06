package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDoctrine: ImageVector
    get() {
        if (_brandDoctrine != null) return _brandDoctrine!!
        _brandDoctrine = tablerOutlineIcon(
            name = "BrandDoctrine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 14c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C19 10.134 15.866 7 12 7 8.134 7 5 10.134 5 14")
            addPathData("M9 14h6")
            addPathData("M12 11l3 3-3 3")
            addPathData("M10 3l6.9 6")
        }
        return _brandDoctrine!!
    }

private var _brandDoctrine: ImageVector? = null
