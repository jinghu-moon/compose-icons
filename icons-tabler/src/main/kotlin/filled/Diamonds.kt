package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Diamonds: ImageVector
    get() {
        if (_diamonds != null) return _diamonds!!
        _diamonds = tablerFilledIcon(
            name = "Diamonds",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.005 C 11.223 2.005 10.492 2.372 10.029 2.995 L 4.667 9.890 C 3.777 11.026 3.777 12.973 4.667 14.117 L 10.042 21.028 C 10.509 21.644 11.238 22.005 12.011 22.002 C 12.784 21.998 13.511 21.631 13.972 21.011 L 19.333 14.117 C 20.223 12.981 20.223 11.034 19.333 9.890 L 13.958 2.979 C 13.495 2.364 12.770 2.004 12.000 2.005 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _diamonds!!
    }

private var _diamonds: ImageVector? = null
