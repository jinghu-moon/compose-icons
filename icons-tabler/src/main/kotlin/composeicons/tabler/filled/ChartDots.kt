package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartDots: ImageVector
    get() {
        if (_chartDots != null) return _chartDots!!
        _chartDots = tablerFilledIcon(
            name = "ChartDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 2c.552 0 1 .448 1 1v17h17c.507 0 .934 .38 .993 .883L22 21c0 .552-.448 1-1 1h-18C2.448 22 2 21.552 2 21v-18C2 2.448 2.448 2 3 2Z")
            addPathData("M19 4c1.149 .003 2.195 .661 2.695 1.695 .5 1.034 .365 2.263-.347 3.165-.712 .901-1.876 1.317-2.998 1.07l-2.002 3.202c.945 1.187 .855 2.892-.209 3.973-1.064 1.081-2.768 1.197-3.969 .271-1.201-.926-1.523-2.603-.748-3.907L10.042 11.814C8.672 12.321 7.136 11.768 6.404 10.504 5.672 9.239 5.957 7.632 7.079 6.696c1.122-.935 2.755-.926 3.867 .021 1.112 .948 1.379 2.558 .634 3.815l1.378 1.654c.541-.201 1.129-.241 1.693-.115L16.653 8.868c-.717-.901-.855-2.133-.355-3.171C16.798 4.66 17.848 4 19 4Z")
        }
        return _chartDots!!
    }

private var _chartDots: ImageVector? = null
