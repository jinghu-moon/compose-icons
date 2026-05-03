package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowUDownRight: ImageVector
    get() {
        if (_arrowUDownRight != null) return _arrowUDownRight!!
        _arrowUDownRight = phosphorFillIcon(
            name = "ArrowUDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.660 173.660 L 181.660 221.660 C 179.372 223.951 175.929 224.636 172.938 223.397 C 169.947 222.158 167.997 219.238 168.000 216.000 L 168.000 176.000 L 88.000 176.000 C 52.654 176.000 24.000 147.346 24.000 112.000 C 24.000 76.654 52.654 48.000 88.000 48.000 L 176.000 48.000 C 180.418 48.000 184.000 51.582 184.000 56.000 C 184.000 60.418 180.418 64.000 176.000 64.000 L 88.000 64.000 C 61.490 64.000 40.000 85.490 40.000 112.000 C 40.000 138.510 61.490 160.000 88.000 160.000 L 168.000 160.000 L 168.000 120.000 C 167.997 116.762 169.947 113.842 172.938 112.603 C 175.929 111.364 179.372 112.049 181.660 114.340 L 229.660 162.340 C 231.162 163.841 232.006 165.877 232.006 168.000 C 232.006 170.123 231.162 172.159 229.660 173.660 Z"),
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
        return _arrowUDownRight!!
    }

private var _arrowUDownRight: ImageVector? = null
