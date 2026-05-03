package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorBoldIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 72.000 L 180.000 60.000 L 89.000 60.000 L 137.400 120.500 C 140.910 124.884 140.910 131.116 137.400 135.500 L 89.000 196.000 L 180.000 196.000 L 180.000 184.000 C 180.000 177.373 185.373 172.000 192.000 172.000 C 198.627 172.000 204.000 177.373 204.000 184.000 L 204.000 208.000 C 204.000 214.627 198.627 220.000 192.000 220.000 L 64.000 220.000 C 59.386 220.001 55.180 217.356 53.181 213.197 C 51.183 209.038 51.746 204.102 54.630 200.500 L 112.630 128.000 L 54.630 55.500 C 51.746 51.898 51.183 46.962 53.181 42.803 C 55.180 38.644 59.386 35.999 64.000 36.000 L 192.000 36.000 C 198.627 36.000 204.000 41.373 204.000 48.000 L 204.000 72.000 C 204.000 78.627 198.627 84.000 192.000 84.000 C 185.373 84.000 180.000 78.627 180.000 72.000 Z"),
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
        return _sigma!!
    }

private var _sigma: ImageVector? = null
