package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowURightDown: ImageVector
    get() {
        if (_arrowURightDown != null) return _arrowURightDown!!
        _arrowURightDown = phosphorDuotoneIcon(
            name = "ArrowURightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 176.000 L 168.000 224.000 L 120.000 176.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 223.390 172.940 C 222.152 169.950 219.236 168.001 216.000 168.000 L 176.000 168.000 L 176.000 88.000 C 176.000 52.654 147.346 24.000 112.000 24.000 C 76.654 24.000 48.000 52.654 48.000 88.000 L 48.000 176.000 C 48.000 180.418 51.582 184.000 56.000 184.000 C 60.418 184.000 64.000 180.418 64.000 176.000 L 64.000 88.000 C 64.000 61.490 85.490 40.000 112.000 40.000 C 138.510 40.000 160.000 61.490 160.000 88.000 L 160.000 168.000 L 120.000 168.000 C 116.762 167.997 113.842 169.947 112.603 172.938 C 111.364 175.929 112.049 179.372 114.340 181.660 L 162.340 229.660 C 163.841 231.162 165.877 232.006 168.000 232.006 C 170.123 232.006 172.159 231.162 173.660 229.660 L 221.660 181.660 C 223.947 179.371 224.630 175.929 223.390 172.940 ZM 168.000 212.690 L 139.310 184.000 L 196.690 184.000 Z"),
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
        return _arrowURightDown!!
    }

private var _arrowURightDown: ImageVector? = null
