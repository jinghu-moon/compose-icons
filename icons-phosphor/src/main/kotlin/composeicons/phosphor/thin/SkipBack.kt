package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorThinIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M197.87 37.52c-3.816-2.116-8.48-1.993-12.18 .32L60 116.44v-76.44c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v176c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-76.44l125.69 78.6c3.7 2.313 8.364 2.436 12.18 .32 3.801-2.055 6.158-6.039 6.13-10.36v-160.24c.028-4.321-2.329-8.305-6.13-10.36ZM196 208.12c.009 1.407-.761 2.704-2 3.37-1.273 .704-2.827 .662-4.06-.11L61.82 131.26c-1.131-.697-1.82-1.931-1.82-3.26 0-1.329 .689-2.563 1.82-3.26L189.94 44.62c.632-.4 1.363-.615 2.11-.62 .683 .001 1.354 .176 1.95 .51 1.239 .666 2.009 1.963 2 3.37Z"),
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
