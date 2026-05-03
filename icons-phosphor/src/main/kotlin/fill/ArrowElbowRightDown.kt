package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowRightDown: ImageVector
    get() {
        if (_arrowElbowRightDown != null) return _arrowElbowRightDown!!
        _arrowElbowRightDown = phosphorFillIcon(
            name = "ArrowElbowRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.660 165.660 L 181.660 213.660 C 180.159 215.162 178.123 216.006 176.000 216.006 C 173.877 216.006 171.841 215.162 170.340 213.660 L 122.340 165.660 C 120.049 163.372 119.364 159.929 120.603 156.938 C 121.842 153.947 124.762 151.997 128.000 152.000 L 168.000 152.000 L 168.000 72.000 L 32.000 72.000 C 27.582 72.000 24.000 68.418 24.000 64.000 C 24.000 59.582 27.582 56.000 32.000 56.000 L 176.000 56.000 C 180.418 56.000 184.000 59.582 184.000 64.000 L 184.000 152.000 L 224.000 152.000 C 227.238 151.997 230.158 153.947 231.397 156.938 C 232.636 159.929 231.951 163.372 229.660 165.660 Z"),
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
