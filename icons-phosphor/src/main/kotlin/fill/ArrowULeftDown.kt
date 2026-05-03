package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorFillIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 88.000 L 208.000 176.000 C 208.000 180.418 204.418 184.000 200.000 184.000 C 195.582 184.000 192.000 180.418 192.000 176.000 L 192.000 88.000 C 192.000 61.490 170.510 40.000 144.000 40.000 C 117.490 40.000 96.000 61.490 96.000 88.000 L 96.000 168.000 L 136.000 168.000 C 139.238 167.997 142.158 169.947 143.397 172.938 C 144.636 175.929 143.951 179.372 141.660 181.660 L 93.660 229.660 C 92.159 231.162 90.123 232.006 88.000 232.006 C 85.877 232.006 83.841 231.162 82.340 229.660 L 34.340 181.660 C 32.049 179.372 31.364 175.929 32.603 172.938 C 33.842 169.947 36.762 167.997 40.000 168.000 L 80.000 168.000 L 80.000 88.000 C 80.000 52.654 108.654 24.000 144.000 24.000 C 179.346 24.000 208.000 52.654 208.000 88.000 Z"),
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
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
