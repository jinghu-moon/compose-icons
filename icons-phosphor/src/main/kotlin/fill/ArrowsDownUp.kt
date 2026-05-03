package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsDownUp: ImageVector
    get() {
        if (_arrowsDownUp != null) return _arrowsDownUp!!
        _arrowsDownUp = phosphorFillIcon(
            name = "ArrowsDownUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 119.390 172.940 C 120.630 175.929 119.947 179.371 117.660 181.660 L 85.660 213.660 C 84.159 215.162 82.123 216.006 80.000 216.006 C 77.877 216.006 75.841 215.162 74.340 213.660 L 42.340 181.660 C 40.049 179.372 39.364 175.929 40.603 172.938 C 41.842 169.947 44.762 167.997 48.000 168.000 L 72.000 168.000 L 72.000 48.000 C 72.000 43.582 75.582 40.000 80.000 40.000 C 84.418 40.000 88.000 43.582 88.000 48.000 L 88.000 168.000 L 112.000 168.000 C 115.236 168.001 118.152 169.950 119.390 172.940 ZM 213.660 74.340 L 181.660 42.340 C 180.159 40.838 178.123 39.994 176.000 39.994 C 173.877 39.994 171.841 40.838 170.340 42.340 L 138.340 74.340 C 136.049 76.628 135.364 80.071 136.603 83.062 C 137.842 86.053 140.762 88.003 144.000 88.000 L 168.000 88.000 L 168.000 208.000 C 168.000 212.418 171.582 216.000 176.000 216.000 C 180.418 216.000 184.000 212.418 184.000 208.000 L 184.000 88.000 L 208.000 88.000 C 211.238 88.003 214.158 86.053 215.397 83.062 C 216.636 80.071 215.951 76.628 213.660 74.340 Z"),
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
        return _arrowsDownUp!!
    }

private var _arrowsDownUp: ImageVector? = null
