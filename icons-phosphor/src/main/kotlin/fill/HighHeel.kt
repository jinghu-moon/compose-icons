package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorFillIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 32.000 144.000 C 44.900 143.990 57.668 146.599 69.530 151.670 C 71.026 152.290 72.002 153.750 72.000 155.370 L 72.000 192.000 C 72.000 200.837 64.837 208.000 56.000 208.000 L 40.000 208.000 C 31.163 208.000 24.000 200.837 24.000 192.000 L 24.000 148.000 C 24.000 145.791 25.791 144.000 28.000 144.000 ZM 231.000 156.190 L 180.000 144.710 L 69.660 34.340 C 68.116 32.796 66.007 31.951 63.824 32.000 C 61.641 32.049 59.573 32.988 58.100 34.600 C 36.110 58.640 24.000 89.000 24.000 120.000 C 24.000 124.418 27.582 128.000 32.000 128.000 C 54.626 127.970 76.723 134.842 95.340 147.700 C 113.500 160.163 127.600 177.685 135.890 198.090 C 138.341 204.116 144.215 208.041 150.720 208.000 L 240.000 208.000 C 248.837 208.000 256.000 200.837 256.000 192.000 L 256.000 187.270 C 256.038 172.311 245.619 159.359 231.000 156.190 Z"),
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
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
