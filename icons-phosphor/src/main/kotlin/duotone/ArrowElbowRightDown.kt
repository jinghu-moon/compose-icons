package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowRightDown: ImageVector
    get() {
        if (_arrowElbowRightDown != null) return _arrowElbowRightDown!!
        _arrowElbowRightDown = phosphorDuotoneIcon(
            name = "ArrowElbowRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 160.000 L 176.000 208.000 L 128.000 160.000 Z"),
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
                pathData = parseSvgPathData("M 231.390 156.940 C 230.152 153.950 227.236 152.001 224.000 152.000 L 184.000 152.000 L 184.000 64.000 C 184.000 59.582 180.418 56.000 176.000 56.000 L 32.000 56.000 C 27.582 56.000 24.000 59.582 24.000 64.000 C 24.000 68.418 27.582 72.000 32.000 72.000 L 168.000 72.000 L 168.000 152.000 L 128.000 152.000 C 124.762 151.997 121.842 153.947 120.603 156.938 C 119.364 159.929 120.049 163.372 122.340 165.660 L 170.340 213.660 C 171.841 215.162 173.877 216.006 176.000 216.006 C 178.123 216.006 180.159 215.162 181.660 213.660 L 229.660 165.660 C 231.947 163.371 232.630 159.929 231.390 156.940 ZM 176.000 196.690 L 147.310 168.000 L 204.690 168.000 Z"),
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
        return _arrowElbowRightDown!!
    }

private var _arrowElbowRightDown: ImageVector? = null
