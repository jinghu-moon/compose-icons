package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsInSimple: ImageVector
    get() {
        if (_arrowsInSimple != null) return _arrowsInSimple!!
        _arrowsInSimple = phosphorFillIcon(
            name = "ArrowsInSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 144.000 L 120.000 192.000 C 120.003 195.238 118.053 198.158 115.062 199.397 C 112.071 200.636 108.628 199.951 106.340 197.660 L 88.000 179.310 L 53.660 213.660 C 50.534 216.786 45.466 216.786 42.340 213.660 C 39.214 210.534 39.214 205.466 42.340 202.340 L 76.690 168.000 L 58.340 149.660 C 56.049 147.372 55.364 143.929 56.603 140.938 C 57.842 137.947 60.762 135.997 64.000 136.000 L 112.000 136.000 C 116.418 136.000 120.000 139.582 120.000 144.000 ZM 213.660 42.340 C 212.159 40.838 210.123 39.994 208.000 39.994 C 205.877 39.994 203.841 40.838 202.340 42.340 L 168.000 76.690 L 149.660 58.340 C 147.372 56.049 143.929 55.364 140.938 56.603 C 137.947 57.842 135.997 60.762 136.000 64.000 L 136.000 112.000 C 136.000 116.418 139.582 120.000 144.000 120.000 L 192.000 120.000 C 195.238 120.003 198.158 118.053 199.397 115.062 C 200.636 112.071 199.951 108.628 197.660 106.340 L 179.310 88.000 L 213.660 53.660 C 215.162 52.159 216.006 50.123 216.006 48.000 C 216.006 45.877 215.162 43.841 213.660 42.340 Z"),
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
        return _arrowsInSimple!!
    }

private var _arrowsInSimple: ImageVector? = null
