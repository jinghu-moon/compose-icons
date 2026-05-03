package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) return _arrowUUpRight!!
        _arrowUUpRight = phosphorFillIcon(
            name = "ArrowUUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 136.000 L 168.000 96.000 L 88.000 96.000 C 61.490 96.000 40.000 117.490 40.000 144.000 C 40.000 170.510 61.490 192.000 88.000 192.000 L 176.000 192.000 C 180.418 192.000 184.000 195.582 184.000 200.000 C 184.000 204.418 180.418 208.000 176.000 208.000 L 88.000 208.000 C 52.654 208.000 24.000 179.346 24.000 144.000 C 24.000 108.654 52.654 80.000 88.000 80.000 L 168.000 80.000 L 168.000 40.000 C 167.997 36.762 169.947 33.842 172.938 32.603 C 175.929 31.364 179.372 32.049 181.660 34.340 L 229.660 82.340 C 231.162 83.841 232.006 85.877 232.006 88.000 C 232.006 90.123 231.162 92.159 229.660 93.660 L 181.660 141.660 C 179.372 143.951 175.929 144.636 172.938 143.397 C 169.947 142.158 167.997 139.238 168.000 136.000 Z"),
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
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
