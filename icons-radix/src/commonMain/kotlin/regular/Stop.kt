package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Stop: ImageVector
    get() {
        if (_stop != null) return _stop!!
        _stop = radixIcon(
            name = "Stop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 12.552 2.000 13.000 2.448 13.000 3.000 L 13.000 12.000 C 13.000 12.552 12.552 13.000 12.000 13.000 L 3.000 13.000 C 2.448 13.000 2.000 12.552 2.000 12.000 L 2.000 3.000 C 2.000 2.448 2.448 2.000 3.000 2.000 L 12.000 2.000 ZM 3.000 12.000 L 12.000 12.000 L 12.000 3.000 L 3.000 3.000 L 3.000 12.000 Z"),
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
        return _stop!!
    }

private var _stop: ImageVector? = null
