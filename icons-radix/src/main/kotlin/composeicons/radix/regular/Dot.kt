package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Dot: ImageVector
    get() {
        if (_dot != null) return _dot!!
        _dot = radixIcon(
            name = "Dot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 4.875c1.45 0 2.625 1.175 2.625 2.625 0 1.45-1.175 2.625-2.625 2.625C6.05 10.125 4.875 8.95 4.875 7.5 4.875 6.05 6.05 4.875 7.5 4.875ZM7.5 5.875c-.897 0-1.625 .728-1.625 1.625 0 .897 .728 1.625 1.625 1.625 .897 0 1.625-.728 1.625-1.625C9.125 6.603 8.397 5.875 7.5 5.875Z"),
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
        return _dot!!
    }

private var _dot: ImageVector? = null
