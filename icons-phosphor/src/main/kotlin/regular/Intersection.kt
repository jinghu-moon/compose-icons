package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Intersection: ImageVector
    get() {
        if (_intersection != null) return _intersection!!
        _intersection = phosphorRegularIcon(
            name = "Intersection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 120.000 L 208.000 200.000 C 208.000 204.418 204.418 208.000 200.000 208.000 C 195.582 208.000 192.000 204.418 192.000 200.000 L 192.000 120.000 C 192.000 84.654 163.346 56.000 128.000 56.000 C 92.654 56.000 64.000 84.654 64.000 120.000 L 64.000 200.000 C 64.000 204.418 60.418 208.000 56.000 208.000 C 51.582 208.000 48.000 204.418 48.000 200.000 L 48.000 120.000 C 48.000 75.817 83.817 40.000 128.000 40.000 C 172.183 40.000 208.000 75.817 208.000 120.000 Z"),
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
        return _intersection!!
    }

private var _intersection: ImageVector? = null
