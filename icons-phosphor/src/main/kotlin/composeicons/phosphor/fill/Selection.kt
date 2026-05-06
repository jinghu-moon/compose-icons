package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Selection: ImageVector
    get() {
        if (_selection != null) return _selection!!
        _selection = phosphorFillIcon(
            name = "Selection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM104 200h-32c-8.837 0-16-7.163-16-16v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM104 72h-32v32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32C56 63.163 63.163 56 72 56h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM200 184c0 8.837-7.163 16-16 16h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM200 104c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c8.837 0 16 7.163 16 16Z"),
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
        return _selection!!
    }

private var _selection: ImageVector? = null
