package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = phosphorFillIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.000 80.120 C 229.443 74.956 222.887 71.999 216.000 72.000 L 160.000 72.000 L 160.000 56.000 C 160.000 33.909 142.091 16.000 120.000 16.000 C 116.969 15.998 114.197 17.709 112.840 20.420 L 75.060 96.000 L 32.000 96.000 C 23.163 96.000 16.000 103.163 16.000 112.000 L 16.000 200.000 C 16.000 208.837 23.163 216.000 32.000 216.000 L 204.000 216.000 C 216.098 216.004 226.308 207.003 227.820 195.000 L 239.820 99.000 C 240.680 92.163 238.560 85.286 234.000 80.120 ZM 32.000 112.000 L 72.000 112.000 L 72.000 200.000 L 32.000 200.000 Z"),
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
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
