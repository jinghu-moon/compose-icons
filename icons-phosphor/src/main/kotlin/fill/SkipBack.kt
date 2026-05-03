package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorFillIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 47.880 L 208.000 208.120 C 207.939 213.896 204.770 219.190 199.709 221.972 C 194.647 224.755 188.479 224.593 183.570 221.550 L 64.000 146.770 L 64.000 216.000 C 64.000 220.418 60.418 224.000 56.000 224.000 C 51.582 224.000 48.000 220.418 48.000 216.000 L 48.000 40.000 C 48.000 35.582 51.582 32.000 56.000 32.000 C 60.418 32.000 64.000 35.582 64.000 40.000 L 64.000 109.230 L 183.570 34.450 C 188.474 31.372 194.660 31.192 199.734 33.982 C 204.808 36.771 207.971 42.090 208.000 47.880 Z"),
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
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
