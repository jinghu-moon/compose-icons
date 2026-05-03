package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowElbowUpRight: ImageVector
    get() {
        if (_arrowElbowUpRight != null) return _arrowElbowUpRight!!
        _arrowElbowUpRight = phosphorFillIcon(
            name = "ArrowElbowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.660 85.660 L 173.660 133.660 C 171.372 135.951 167.929 136.636 164.938 135.397 C 161.947 134.158 159.997 131.238 160.000 128.000 L 160.000 88.000 L 80.000 88.000 L 80.000 224.000 C 80.000 228.418 76.418 232.000 72.000 232.000 C 67.582 232.000 64.000 228.418 64.000 224.000 L 64.000 80.000 C 64.000 75.582 67.582 72.000 72.000 72.000 L 160.000 72.000 L 160.000 32.000 C 159.997 28.762 161.947 25.842 164.938 24.603 C 167.929 23.364 171.372 24.049 173.660 26.340 L 221.660 74.340 C 223.162 75.841 224.006 77.877 224.006 80.000 C 224.006 82.123 223.162 84.159 221.660 85.660 Z"),
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
        return _arrowElbowUpRight!!
    }

private var _arrowElbowUpRight: ImageVector? = null
