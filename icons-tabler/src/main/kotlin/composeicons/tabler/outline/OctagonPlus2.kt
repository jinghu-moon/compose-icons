package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.OctagonPlus2: ImageVector
    get() {
        if (_octagonPlus2 != null) return _octagonPlus2!!
        _octagonPlus2 = tablerOutlineIcon(
            name = "OctagonPlus2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.023 21.74l-.221 .095c-.512 .22-1.092 .22-1.604 0L5.623 19.446c-.481-.206-.864-.589-1.07-1.07L2.165 12.802c-.219-.512-.219-1.092 0-1.604L4.554 5.623c.206-.48 .589-.863 1.07-1.07L11.198 2.165c.512-.219 1.092-.219 1.604 0l5.575 2.389c.48 .206 .863 .589 1.07 1.07l2.388 5.574c.22 .512 .22 1.092 0 1.604l-.081 .19")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _octagonPlus2!!
    }

private var _octagonPlus2: ImageVector? = null
