package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArticleMedium: ImageVector
    get() {
        if (_articleMedium != null) return _articleMedium!!
        _articleMedium = phosphorDuotoneIcon(
            name = "ArticleMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 104v96h-152v-32h88v-64Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M56 136c0 4.418-3.582 8-8 8h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-64h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16 0c2.753-.003 5.314 1.41 6.78 3.74L80 104.91 113.22 51.76C114.681 49.422 117.243 48.001 120 48h0 16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-8v64h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8v-44.11L86.78 124.24c-1.463 2.335-4.024 3.754-6.78 3.754-2.756 0-5.317-1.418-6.78-3.754L48 83.89v44.11c4.418 0 8 3.582 8 8ZM168 112h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM232 128h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM232 160h-152c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h152c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM232 192h-152c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h152c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _articleMedium!!
    }

private var _articleMedium: ImageVector? = null
