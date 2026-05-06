package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = phosphorRegularIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214.67 72h-14.67v-32c0-4.418-3.582-8-8-8h-128c-4.418 0-8 3.582-8 8v32h-14.67C27.36 72 16 82.77 16 96v80c0 4.418 3.582 8 8 8h32v32c0 4.418 3.582 8 8 8h128c4.418 0 8-3.582 8-8v-32h32c4.418 0 8-3.582 8-8v-80C240 82.77 228.64 72 214.67 72ZM72 48h112v24h-112ZM184 208h-112v-48h112ZM224 168h-24v-16c0-4.418-3.582-8-8-8h-128c-4.418 0-8 3.582-8 8v16h-24v-72c0-4.41 4.19-8 9.33-8h173.34c5.14 0 9.33 3.59 9.33 8ZM200 116c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
