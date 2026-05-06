package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IrregularPolyhedronPlus: ImageVector
    get() {
        if (_irregularPolyhedronPlus != null) return _irregularPolyhedronPlus!!
        _irregularPolyhedronPlus = tablerOutlineIcon(
            name = "IrregularPolyhedronPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 12 19.752 5.87c.142-.494-.114-1.015-.592-1.205L12.878 2.162c-.565-.216-1.191-.216-1.756 0L4.84 4.665c-.477 .19-.733 .71-.592 1.204L6 12 4.248 18.13c-.142 .494 .114 1.015 .592 1.205l6.282 2.503c.565 .216 1.191 .216 1.756 0l.221-.088")
            addPathData("M4.5 5.5l6.622 2.33c.563 .227 1.193 .227 1.756 0L19.5 5.5")
            addPathData("M6 12l5.21 1.862c.511 .183 1.069 .183 1.58 0L18 12")
            addPathData("M12 22v-14")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _irregularPolyhedronPlus!!
    }

private var _irregularPolyhedronPlus: ImageVector? = null
