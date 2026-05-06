package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IrregularPolyhedronOff: ImageVector
    get() {
        if (_irregularPolyhedronOff != null) return _irregularPolyhedronOff!!
        _irregularPolyhedronOff = tablerOutlineIcon(
            name = "IrregularPolyhedronOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.706 4.73c-.396 .23-.584 .7-.458 1.14L6 12 4.248 18.13c-.142 .494 .114 1.015 .592 1.205l6.282 2.503c.565 .216 1.191 .216 1.756 0l6.282-2.503c.04-.016 .079-.035 .116-.055M18.802 14.806 18 12 19.752 5.87c.142-.494-.114-1.015-.592-1.205L12.878 2.162c-.565-.216-1.191-.216-1.756 0L7.578 3.574")
            addPathData("M4.5 5.5C5.161 5.714 5.661 5.88 6 6M12 8c.29-.003 .603-.06 .878-.17L19.5 5.5")
            addPathData("M6 12l5.21 1.862c.511 .183 1.069 .183 1.58 0l.742-.265M16.488 12.54c.312-.11 .816-.291 1.512-.54")
            addPathData("M12 22v-10")
            addPathData("M3 3 21 21")
        }
        return _irregularPolyhedronOff!!
    }

private var _irregularPolyhedronOff: ImageVector? = null
