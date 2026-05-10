package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArticleMedium: ImageVector
    get() {
        if (_articleMedium != null) return _articleMedium!!
        _articleMedium = phosphorFillIcon(
            name = "ArticleMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM72 144c-0 3.216-1.927 6.12-4.89 7.37-.983 .419-2.041 .634-3.11 .63h-12c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h4v-48h-4c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h12c2.852 .006 5.484 1.53 6.91 4L92 112.12 113.09 76c1.426-2.47 4.058-3.994 6.91-4h12c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-4v48h4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-12c-1.069 .004-2.127-.211-3.11-.63C113.927 150.12 112 147.216 112 144v-34.41L98.91 132c-1.434 2.458-4.065 3.969-6.91 3.969-2.845 0-5.476-1.511-6.91-3.969L72 109.59ZM200 184h-112c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h112c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM200 152h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM200 120h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
