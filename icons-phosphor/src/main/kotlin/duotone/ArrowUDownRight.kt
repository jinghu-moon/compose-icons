package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowUDownRight: ImageVector
    get() {
        if (_arrowUDownRight != null) return _arrowUDownRight!!
        _arrowUDownRight = phosphorDuotoneIcon(
            name = "ArrowUDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 168.000 L 176.000 216.000 L 176.000 120.000 Z"),
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
                pathData = parseSvgPathData("M 229.660 162.340 L 181.660 114.340 C 179.372 112.049 175.929 111.364 172.938 112.603 C 169.947 113.842 167.997 116.762 168.000 120.000 L 168.000 160.000 L 88.000 160.000 C 61.490 160.000 40.000 138.510 40.000 112.000 C 40.000 85.490 61.490 64.000 88.000 64.000 L 176.000 64.000 C 180.418 64.000 184.000 60.418 184.000 56.000 C 184.000 51.582 180.418 48.000 176.000 48.000 L 88.000 48.000 C 52.654 48.000 24.000 76.654 24.000 112.000 C 24.000 147.346 52.654 176.000 88.000 176.000 L 168.000 176.000 L 168.000 216.000 C 167.997 219.238 169.947 222.158 172.938 223.397 C 175.929 224.636 179.372 223.951 181.660 221.660 L 229.660 173.660 C 231.162 172.159 232.006 170.123 232.006 168.000 C 232.006 165.877 231.162 163.841 229.660 162.340 ZM 184.000 196.690 L 184.000 139.310 L 212.690 168.000 Z"),
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
        return _arrowUDownRight!!
    }

private var _arrowUDownRight: ImageVector? = null
