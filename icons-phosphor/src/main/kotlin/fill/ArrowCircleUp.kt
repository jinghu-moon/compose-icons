package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowCircleUp: ImageVector
    get() {
        if (_arrowCircleUp != null) return _arrowCircleUp!!
        _arrowCircleUp = phosphorFillIcon(
            name = "ArrowCircleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 165.660 125.660 C 164.159 127.162 162.123 128.006 160.000 128.006 C 157.877 128.006 155.841 127.162 154.340 125.660 L 136.000 107.310 L 136.000 168.000 C 136.000 172.418 132.418 176.000 128.000 176.000 C 123.582 176.000 120.000 172.418 120.000 168.000 L 120.000 107.310 L 101.660 125.660 C 98.534 128.786 93.466 128.786 90.340 125.660 C 87.214 122.534 87.214 117.466 90.340 114.340 L 122.340 82.340 C 123.841 80.838 125.877 79.994 128.000 79.994 C 130.123 79.994 132.159 80.838 133.660 82.340 L 165.660 114.340 C 167.162 115.841 168.006 117.877 168.006 120.000 C 168.006 122.123 167.162 124.159 165.660 125.660 Z"),
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
        return _arrowCircleUp!!
    }

private var _arrowCircleUp: ImageVector? = null
