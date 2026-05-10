package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Rug: ImageVector
    get() {
        if (_rug != null) return _rug!!
        _rug = phosphorFillIcon(
            name = "Rug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 16c-4.418 0-8 3.582-8 8v16h-32v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-32v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-32v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v208c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h32v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h32v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h32v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-208c0-4.418-3.582-8-8-8ZM155.43 130.06l-24 40c-.723 1.205-2.025 1.942-3.43 1.942-1.405 0-2.707-.737-3.43-1.942l-24-40c-.762-1.268-.762-2.852 0-4.12l24-40c.723-1.205 2.025-1.942 3.43-1.942 1.405 0 2.707 .737 3.43 1.942l24 40c.762 1.268 .762 2.852 0 4.12Z"),
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
