package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VaccineBottle: ImageVector
    get() {
        if (_vaccineBottle != null) return _vaccineBottle!!
        _vaccineBottle = tablerOutlineIcon(
            name = "VaccineBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 4C9 3.448 9.448 3 10 3h4c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-4C9.448 6 9 5.552 9 5v-1")
            addPathData("M10 6v.98c0 .877-.634 1.626-1.5 1.77C7.634 8.894 7 9.643 7 10.52v8.48c0 1.105 .895 2 2 2h6c1.105 0 2-.895 2-2v-8.48C17 9.643 16.366 8.894 15.5 8.75 14.635 8.606 14 7.857 14 6.98v-.98")
            addPathData("M7 12h10")
            addPathData("M7 18h10")
            addPathData("M11 15h2")
        }
        return _vaccineBottle!!
    }

private var _vaccineBottle: ImageVector? = null
