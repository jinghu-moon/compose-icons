package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowFatUp: ImageVector
    get() {
        if (_arrowFatUp != null) return _arrowFatUp!!
        _arrowFatUp = phosphorFillIcon(
            name = "ArrowFatUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 231.390 123.060 C 230.152 126.050 227.236 127.999 224.000 128.000 L 184.000 128.000 L 184.000 208.000 C 184.000 216.837 176.837 224.000 168.000 224.000 L 88.000 224.000 C 79.163 224.000 72.000 216.837 72.000 208.000 L 72.000 128.000 L 32.000 128.000 C 28.762 128.003 25.842 126.053 24.603 123.062 C 23.364 120.071 24.049 116.628 26.340 114.340 L 122.340 18.340 C 123.841 16.838 125.877 15.994 128.000 15.994 C 130.123 15.994 132.159 16.838 133.660 18.340 L 229.660 114.340 C 231.947 116.629 232.630 120.071 231.390 123.060 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _arrowFatUp!!
    }

private var _arrowFatUp: ImageVector? = null
