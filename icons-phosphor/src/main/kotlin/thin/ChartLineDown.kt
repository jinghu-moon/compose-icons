package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartLineDown: ImageVector
    get() {
        if (_chartLineDown != null) return _chartLineDown!!
        _chartLineDown = phosphorThinIcon(
            name = "ChartLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 208.000 C 228.000 210.209 226.209 212.000 224.000 212.000 L 32.000 212.000 C 29.791 212.000 28.000 210.209 28.000 208.000 L 28.000 48.000 C 28.000 45.791 29.791 44.000 32.000 44.000 C 34.209 44.000 36.000 45.791 36.000 48.000 L 36.000 62.340 L 96.000 122.340 L 125.170 93.170 C 125.920 92.419 126.938 91.997 128.000 91.997 C 129.062 91.997 130.080 92.419 130.830 93.170 L 196.000 158.340 L 196.000 128.000 C 196.000 125.791 197.791 124.000 200.000 124.000 C 202.209 124.000 204.000 125.791 204.000 128.000 L 204.000 168.000 C 203.998 168.262 203.971 168.523 203.920 168.780 C 203.893 168.895 203.859 169.008 203.820 169.120 C 203.787 169.260 203.744 169.397 203.690 169.530 C 203.633 169.665 203.567 169.795 203.490 169.920 C 203.440 170.020 203.390 170.120 203.330 170.220 C 203.033 170.657 202.657 171.033 202.220 171.330 L 201.910 171.490 C 201.788 171.564 201.661 171.631 201.530 171.690 C 201.397 171.744 201.260 171.787 201.120 171.820 C 201.008 171.859 200.895 171.893 200.780 171.920 C 200.523 171.971 200.262 171.998 200.000 172.000 L 160.000 172.000 C 157.791 172.000 156.000 170.209 156.000 168.000 C 156.000 165.791 157.791 164.000 160.000 164.000 L 190.340 164.000 L 128.000 101.660 L 98.830 130.830 C 98.080 131.581 97.062 132.003 96.000 132.003 C 94.938 132.003 93.920 131.581 93.170 130.830 L 36.000 73.660 L 36.000 204.000 L 224.000 204.000 C 226.209 204.000 228.000 205.791 228.000 208.000 Z"),
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
        return _chartLineDown!!
    }

private var _chartLineDown: ImageVector? = null
