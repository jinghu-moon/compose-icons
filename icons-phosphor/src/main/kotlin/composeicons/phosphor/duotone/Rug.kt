package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Rug: ImageVector
    get() {
        if (_rug != null) return _rug!!
        _rug = phosphorDuotoneIcon(
            name = "Rug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56 48v160h144v-160ZM128 168 104 128 128 88l24 40Z"),
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
                pathData = parseSvgPathData("M200 16c-4.418 0-8 3.582-8 8v16h-32v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-32v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-32v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v208c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h32v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h32v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h32v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-208c0-4.418-3.582-8-8-8ZM192 200h-128v-144h128ZM121.14 172.12c1.446 2.41 4.05 3.884 6.86 3.884 2.81 0 5.414-1.474 6.86-3.884l24-40c1.523-2.535 1.523-5.705 0-8.24l-24-40C133.414 81.47 130.81 79.996 128 79.996c-2.81 0-5.414 1.474-6.86 3.884l-24 40c-1.523 2.535-1.523 5.705 0 8.24ZM128 103.55 142.67 128 128 152.45 113.33 128Z"),
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
