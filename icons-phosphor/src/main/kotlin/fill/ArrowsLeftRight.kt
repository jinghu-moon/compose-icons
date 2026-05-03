package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsLeftRight: ImageVector
    get() {
        if (_arrowsLeftRight != null) return _arrowsLeftRight!!
        _arrowsLeftRight = phosphorFillIcon(
            name = "ArrowsLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 42.340 85.660 C 40.838 84.159 39.994 82.123 39.994 80.000 C 39.994 77.877 40.838 75.841 42.340 74.340 L 74.340 42.340 C 76.628 40.049 80.071 39.364 83.062 40.603 C 86.053 41.842 88.003 44.762 88.000 48.000 L 88.000 72.000 L 208.000 72.000 C 212.418 72.000 216.000 75.582 216.000 80.000 C 216.000 84.418 212.418 88.000 208.000 88.000 L 88.000 88.000 L 88.000 112.000 C 88.003 115.238 86.053 118.158 83.062 119.397 C 80.071 120.636 76.628 119.951 74.340 117.660 ZM 213.660 170.340 L 181.660 138.340 C 179.372 136.049 175.929 135.364 172.938 136.603 C 169.947 137.842 167.997 140.762 168.000 144.000 L 168.000 168.000 L 48.000 168.000 C 43.582 168.000 40.000 171.582 40.000 176.000 C 40.000 180.418 43.582 184.000 48.000 184.000 L 168.000 184.000 L 168.000 208.000 C 167.997 211.238 169.947 214.158 172.938 215.397 C 175.929 216.636 179.372 215.951 181.660 213.660 L 213.660 181.660 C 215.162 180.159 216.006 178.123 216.006 176.000 C 216.006 173.877 215.162 171.841 213.660 170.340 Z"),
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
        return _arrowsLeftRight!!
    }

private var _arrowsLeftRight: ImageVector? = null
