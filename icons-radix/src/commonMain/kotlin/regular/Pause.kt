package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = radixIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.500 2.200 C 5.804 2.200 6.050 2.446 6.050 2.750 L 6.050 12.250 C 6.050 12.554 5.804 12.800 5.500 12.800 C 5.196 12.800 4.950 12.554 4.950 12.250 L 4.950 2.750 C 4.950 2.446 5.196 2.200 5.500 2.200 ZM 9.500 2.200 C 9.804 2.200 10.050 2.446 10.050 2.750 L 10.050 12.250 C 10.050 12.554 9.804 12.800 9.500 12.800 C 9.196 12.800 8.950 12.554 8.950 12.250 L 8.950 2.750 C 8.950 2.446 9.196 2.200 9.500 2.200 Z"),
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
        return _pause!!
    }

private var _pause: ImageVector? = null
