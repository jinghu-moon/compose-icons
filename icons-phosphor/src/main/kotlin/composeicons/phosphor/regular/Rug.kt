package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Rug: ImageVector
    get() {
        if (_rug != null) return _rug!!
        _rug = phosphorRegularIcon(
            name = "Rug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 16c-4.418 0-8 3.582-8 8v16h-32v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-32v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-32v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v208c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h32v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h32v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h32v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-208c0-4.418-3.582-8-8-8ZM64 56h128v144h-128ZM128 176c2.809 .001 5.413-1.472 6.86-3.88l24-40c1.523-2.535 1.523-5.705 0-8.24l-24-40C133.414 81.47 130.81 79.996 128 79.996c-2.81 0-5.414 1.474-6.86 3.884l-24 40c-1.523 2.535-1.523 5.705 0 8.24l24 40c1.447 2.408 4.051 3.881 6.86 3.88ZM128 103.55 142.67 128 128 152.45 113.33 128Z"),
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
        return _rug!!
    }

private var _rug: ImageVector? = null
