package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = phosphorFillIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 96v80c0 4.418-3.582 8-8 8h-32v32c0 4.418-3.582 8-8 8h-128c-4.418 0-8-3.582-8-8v-32h-32c-4.418 0-8-3.582-8-8v-80C16 82.77 27.36 72 41.33 72h14.67v-32c0-4.418 3.582-8 8-8h128c4.418 0 8 3.582 8 8v32h14.67C228.64 72 240 82.77 240 96ZM72 72h112v-24h-112ZM184 160h-112v48h112ZM200 116c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12Z"),
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
        return _printer!!
    }

private var _printer: ImageVector? = null
