package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SkipForward: ImageVector
    get() {
        if (_skipForward != null) return _skipForward!!
        _skipForward = phosphorFillIcon(
            name = "SkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 40.000 L 208.000 216.000 C 208.000 220.418 204.418 224.000 200.000 224.000 C 195.582 224.000 192.000 220.418 192.000 216.000 L 192.000 146.770 L 72.430 221.550 C 67.526 224.628 61.340 224.808 56.266 222.018 C 51.192 219.229 48.029 213.910 48.000 208.120 L 48.000 47.880 C 48.029 42.090 51.192 36.771 56.266 33.982 C 61.340 31.192 67.526 31.372 72.430 34.450 L 192.000 109.230 L 192.000 40.000 C 192.000 35.582 195.582 32.000 200.000 32.000 C 204.418 32.000 208.000 35.582 208.000 40.000 Z"),
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
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
