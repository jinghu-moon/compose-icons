package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorFillIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 231.260 105.190 L 199.260 212.730 L 199.200 212.900 C 197.092 219.516 190.943 224.005 184.000 224.000 L 72.000 224.000 C 65.057 224.005 58.908 219.516 56.800 212.900 L 56.740 212.730 L 24.740 105.190 C 22.698 98.699 24.984 91.627 30.440 87.560 L 118.360 19.250 L 118.540 19.110 C 124.164 14.959 131.836 14.959 137.460 19.110 L 137.640 19.250 L 225.560 87.560 C 231.016 91.627 233.302 98.699 231.260 105.190 Z"),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
