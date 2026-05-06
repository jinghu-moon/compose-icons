package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Steps: ImageVector
    get() {
        if (_steps != null) return _steps!!
        _steps = phosphorFillIcon(
            name = "Steps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 56v144c0 4.418-3.582 8-8 8h-224C3.582 208 0 204.418 0 200c0-4.418 3.582-8 8-8h48v-40c0-4.418 3.582-8 8-8h48v-40c0-4.418 3.582-8 8-8h48v-40c0-4.418 3.582-8 8-8h56c4.418 0 8 3.582 8 8Z"),
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
        return _steps!!
    }

private var _steps: ImageVector? = null
