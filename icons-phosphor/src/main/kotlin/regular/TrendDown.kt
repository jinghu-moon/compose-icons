package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TrendDown: ImageVector
    get() {
        if (_trendDown != null) return _trendDown!!
        _trendDown = phosphorRegularIcon(
            name = "TrendDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 128.000 L 240.000 192.000 C 240.000 196.418 236.418 200.000 232.000 200.000 L 168.000 200.000 C 163.582 200.000 160.000 196.418 160.000 192.000 C 160.000 187.582 163.582 184.000 168.000 184.000 L 212.690 184.000 L 136.000 107.310 L 101.660 141.660 C 100.159 143.162 98.123 144.006 96.000 144.006 C 93.877 144.006 91.841 143.162 90.340 141.660 L 18.340 69.660 C 15.214 66.534 15.214 61.466 18.340 58.340 C 21.466 55.214 26.534 55.214 29.660 58.340 L 96.000 124.690 L 130.340 90.340 C 131.841 88.838 133.877 87.994 136.000 87.994 C 138.123 87.994 140.159 88.838 141.660 90.340 L 224.000 172.690 L 224.000 128.000 C 224.000 123.582 227.582 120.000 232.000 120.000 C 236.418 120.000 240.000 123.582 240.000 128.000 Z"),
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
        return _trendDown!!
    }

private var _trendDown: ImageVector? = null
