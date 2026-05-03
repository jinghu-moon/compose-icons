package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorRegularIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 199.810 34.000 C 194.721 31.180 188.503 31.345 183.570 34.430 L 64.000 109.230 L 64.000 40.000 C 64.000 35.582 60.418 32.000 56.000 32.000 C 51.582 32.000 48.000 35.582 48.000 40.000 L 48.000 216.000 C 48.000 220.418 51.582 224.000 56.000 224.000 C 60.418 224.000 64.000 220.418 64.000 216.000 L 64.000 146.770 L 183.570 221.550 C 188.474 224.628 194.660 224.808 199.734 222.018 C 204.808 219.229 207.971 213.910 208.000 208.120 L 208.000 47.880 C 207.999 42.108 204.862 36.792 199.810 34.000 ZM 192.000 208.000 L 64.160 128.000 L 192.000 48.070 Z"),
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
