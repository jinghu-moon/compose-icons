package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorRegularIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 80v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-98.45L87.49 210.81c-1.164 3.136-4.155 5.216-7.5 5.216-3.345 0-6.336-2.081-7.5-5.216L24.49 82.81c-1.552-4.142 .548-8.758 4.69-10.31 4.142-1.552 8.758 .548 10.31 4.69L80 185.22l40.51-108C121.671 74.086 124.658 72.005 128 72h112c4.418 0 8 3.582 8 8Z"),
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
        return _radical!!
    }

private var _radical: ImageVector? = null
