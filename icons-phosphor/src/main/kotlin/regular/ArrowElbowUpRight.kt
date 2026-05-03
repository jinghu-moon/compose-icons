package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowUpRight: ImageVector
    get() {
        if (_arrowElbowUpRight != null) return _arrowElbowUpRight!!
        _arrowElbowUpRight = phosphorRegularIcon(
            name = "ArrowElbowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.660 85.660 L 173.660 133.660 C 170.534 136.786 165.466 136.786 162.340 133.660 C 159.214 130.534 159.214 125.466 162.340 122.340 L 196.690 88.000 L 80.000 88.000 L 80.000 224.000 C 80.000 228.418 76.418 232.000 72.000 232.000 C 67.582 232.000 64.000 228.418 64.000 224.000 L 64.000 80.000 C 64.000 75.582 67.582 72.000 72.000 72.000 L 196.690 72.000 L 162.340 37.660 C 159.214 34.534 159.214 29.466 162.340 26.340 C 165.466 23.214 170.534 23.214 173.660 26.340 L 221.660 74.340 C 223.162 75.841 224.006 77.877 224.006 80.000 C 224.006 82.123 223.162 84.159 221.660 85.660 Z"),
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
        return _arrowElbowUpRight!!
    }

private var _arrowElbowUpRight: ImageVector? = null
