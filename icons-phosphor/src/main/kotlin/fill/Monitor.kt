package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Monitor: ImageVector
    get() {
        if (_monitor != null) return _monitor!!
        _monitor = phosphorFillIcon(
            name = "Monitor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 64.000 L 232.000 176.000 C 232.000 189.255 221.255 200.000 208.000 200.000 L 48.000 200.000 C 34.745 200.000 24.000 189.255 24.000 176.000 L 24.000 64.000 C 24.000 50.745 34.745 40.000 48.000 40.000 L 208.000 40.000 C 221.255 40.000 232.000 50.745 232.000 64.000 ZM 160.000 216.000 L 96.000 216.000 C 91.582 216.000 88.000 219.582 88.000 224.000 C 88.000 228.418 91.582 232.000 96.000 232.000 L 160.000 232.000 C 164.418 232.000 168.000 228.418 168.000 224.000 C 168.000 219.582 164.418 216.000 160.000 216.000 Z"),
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
        return _monitor!!
    }

private var _monitor: ImageVector? = null
