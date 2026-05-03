package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorFillIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.280 43.720 C 196.660 28.105 171.340 28.105 155.720 43.720 L 131.720 67.720 C 130.550 68.888 129.771 70.391 129.490 72.020 C 120.690 123.280 36.000 208.730 34.360 210.330 L 34.360 210.330 C 31.234 213.453 31.232 218.519 34.355 221.645 C 37.478 224.771 42.544 224.773 45.670 221.650 L 45.670 221.650 C 46.530 220.780 132.500 135.340 183.990 126.500 C 185.619 126.219 187.122 125.440 188.290 124.270 L 212.290 100.270 C 227.905 84.650 227.905 59.330 212.290 43.710 ZM 189.660 77.660 L 173.660 93.660 C 170.534 96.786 165.466 96.786 162.340 93.660 C 159.214 90.534 159.214 85.466 162.340 82.340 L 178.340 66.340 C 181.466 63.214 186.534 63.214 189.660 66.340 C 192.786 69.466 192.786 74.534 189.660 77.660 Z"),
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
        return _needle!!
    }

private var _needle: ImageVector? = null
