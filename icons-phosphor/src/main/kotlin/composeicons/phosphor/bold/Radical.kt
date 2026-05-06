package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorBoldIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 80v24c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12h-91.68L91.24 212.21c-1.757 4.682-6.234 7.784-11.235 7.784-5.001 0-9.478-3.102-11.235-7.784L20.77 84.21c-1.545-4.023-.814-8.565 1.915-11.9 2.729-3.335 7.036-4.951 11.285-4.234 4.249 .717 7.787 3.658 9.27 7.704l36.76 98 36.77-98C118.528 71.101 123.002 68.001 128 68h112c6.627 0 12 5.373 12 12Z"),
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
