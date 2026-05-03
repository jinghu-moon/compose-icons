package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowURightDown: ImageVector
    get() {
        if (_arrowURightDown != null) return _arrowURightDown!!
        _arrowURightDown = phosphorFillIcon(
            name = "ArrowURightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.660 181.660 L 173.660 229.660 C 172.159 231.162 170.123 232.006 168.000 232.006 C 165.877 232.006 163.841 231.162 162.340 229.660 L 114.340 181.660 C 112.049 179.372 111.364 175.929 112.603 172.938 C 113.842 169.947 116.762 167.997 120.000 168.000 L 160.000 168.000 L 160.000 88.000 C 160.000 61.490 138.510 40.000 112.000 40.000 C 85.490 40.000 64.000 61.490 64.000 88.000 L 64.000 176.000 C 64.000 180.418 60.418 184.000 56.000 184.000 C 51.582 184.000 48.000 180.418 48.000 176.000 L 48.000 88.000 C 48.000 52.654 76.654 24.000 112.000 24.000 C 147.346 24.000 176.000 52.654 176.000 88.000 L 176.000 168.000 L 216.000 168.000 C 219.238 167.997 222.158 169.947 223.397 172.938 C 224.636 175.929 223.951 179.372 221.660 181.660 Z"),
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
        return _arrowURightDown!!
    }

private var _arrowURightDown: ImageVector? = null
