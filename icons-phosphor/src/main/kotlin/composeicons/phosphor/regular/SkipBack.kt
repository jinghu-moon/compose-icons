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
                pathData = parseSvgPathData("M199.81 34c-5.089-2.82-11.307-2.655-16.24 .43L64 109.23v-69.23c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v176c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-69.23l119.57 74.78c4.904 3.078 11.09 3.258 16.164 .468 5.074-2.789 8.237-8.109 8.266-13.898v-160.24C207.999 42.108 204.862 36.792 199.81 34ZM192 208 64.16 128 192 48.07Z"),
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
