package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMyOppo: ImageVector
    get() {
        if (_brandMyOppo != null) return _brandMyOppo!!
        _brandMyOppo = tablerOutlineIcon(
            name = "BrandMyOppo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.316 5h-12.632L2.266 9.019c-.361 .417-.353 1.039 .019 1.447L11.999 21 21.714 10.51c.371-.406 .382-1.026 .024-1.444L18.316 5")
            addPathData("M9 11l3 3 3-3")
        }
        return _brandMyOppo!!
    }

private var _brandMyOppo: ImageVector? = null
