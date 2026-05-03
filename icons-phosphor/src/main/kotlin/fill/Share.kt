package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = phosphorFillIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.660 109.660 L 181.660 157.660 C 179.372 159.951 175.929 160.636 172.938 159.397 C 169.947 158.158 167.997 155.238 168.000 152.000 L 168.000 112.000 L 165.000 112.000 C 124.863 111.989 89.804 139.138 79.770 178.000 C 78.665 182.280 74.300 184.855 70.020 183.750 C 65.740 182.645 63.165 178.280 64.270 174.000 C 76.110 128.058 117.557 95.964 165.000 96.000 L 168.000 96.000 L 168.000 56.000 C 167.997 52.762 169.947 49.842 172.938 48.603 C 175.929 47.364 179.372 48.049 181.660 50.340 L 229.660 98.340 C 231.162 99.841 232.006 101.877 232.006 104.000 C 232.006 106.123 231.162 108.159 229.660 109.660 ZM 192.000 208.000 L 40.000 208.000 L 40.000 88.000 C 40.000 83.582 36.418 80.000 32.000 80.000 C 27.582 80.000 24.000 83.582 24.000 88.000 L 24.000 216.000 C 24.000 220.418 27.582 224.000 32.000 224.000 L 192.000 224.000 C 196.418 224.000 200.000 220.418 200.000 216.000 C 200.000 211.582 196.418 208.000 192.000 208.000 Z"),
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
        return _share!!
    }

private var _share: ImageVector? = null
