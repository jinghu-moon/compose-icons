package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartArea: ImageVector
    get() {
        if (_chartArea != null) return _chartArea!!
        _chartArea = tablerFilledIcon(
            name = "ChartArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 18c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L20 20h-16c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L4 18h16Z")
            addPathData("M15.22 5.375c.341-.426 .961-.499 1.393-.165l.094 .083 4 4c.155 .156 .255 .358 .284 .576L21 10v5c-0 .507-.38 .934-.883 .993L20 16h-16.022l-.11-.009-.11-.02-.107-.034-.105-.046-.1-.059-.094-.07-.06-.055-.072-.082-.064-.089-.054-.096-.016-.035-.04-.103-.027-.106-.015-.108L3 14.978l.009-.11 .019-.105c.01-.04 .022-.077 .035-.112l.046-.105 .059-.1 4-6c.253-.381 .733-.542 1.165-.39l.114 .05 3.277 1.638L15.219 5.375Z")
        }
        return _chartArea!!
    }

private var _chartArea: ImageVector? = null
