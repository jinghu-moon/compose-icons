package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MichelinBibGourmand: ImageVector
    get() {
        if (_michelinBibGourmand != null) return _michelinBibGourmand!!
        _michelinBibGourmand = tablerOutlineIcon(
            name = "MichelinBibGourmand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.97 20C2.575 18.053 .207 14.755 3.965 12 3.445 8 7.407 4.5 9.489 4.5 9.836 3.5 10.988 3 12.029 3c1.04 0 2.135 .5 2.482 1.5 2.082 0 6.044 3.5 5.524 7.5 3.758 2.755 1.39 6.053-1.005 8")
            addPathData("M8 11c0 1.105 .448 2 1 2 .552 0 1-.895 1-2C10 9.895 9.552 9 9 9 8.448 9 8 9.895 8 11")
            addPathData("M14 11c0 1.105 .448 2 1 2 .552 0 1-.895 1-2C16 9.895 15.552 9 15 9c-.552 0-1 .895-1 2")
            addPathData("M8 17.085c3.5 2.712 6.5 2.712 9-1.085")
            addPathData("M13 18.5c.815-2.337 1.881-1.472 2-.55")
        }
        return _michelinBibGourmand!!
    }

private var _michelinBibGourmand: ImageVector? = null
