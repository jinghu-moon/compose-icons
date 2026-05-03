package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowDownRight: ImageVector
    get() {
        if (_arrowElbowDownRight != null) return _arrowElbowDownRight!!
        _arrowElbowDownRight = phosphorFillIcon(
            name = "ArrowElbowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.660 181.660 L 173.660 229.660 C 171.372 231.951 167.929 232.636 164.938 231.397 C 161.947 230.158 159.997 227.238 160.000 224.000 L 160.000 184.000 L 72.000 184.000 C 67.582 184.000 64.000 180.418 64.000 176.000 L 64.000 32.000 C 64.000 27.582 67.582 24.000 72.000 24.000 C 76.418 24.000 80.000 27.582 80.000 32.000 L 80.000 168.000 L 160.000 168.000 L 160.000 128.000 C 159.997 124.762 161.947 121.842 164.938 120.603 C 167.929 119.364 171.372 120.049 173.660 122.340 L 221.660 170.340 C 223.162 171.841 224.006 173.877 224.006 176.000 C 224.006 178.123 223.162 180.159 221.660 181.660 Z"),
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
        return _arrowElbowDownRight!!
    }

private var _arrowElbowDownRight: ImageVector? = null
