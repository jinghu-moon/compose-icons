package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = radixIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.691 1c.378 0 .724 .214 .894 .553l1.362 2.724 .039 .108c.009 .038 .014 .076 .014 .115v8.5c0 .552-.448 1-1 1h-11C1.448 14 1 13.552 1 13v-8.5c0-.078 .018-.154 .053-.224L2.415 1.553l.071-.121C2.671 1.164 2.977 1 3.309 1h8.383ZM2 13h11v-8h-11v8ZM9.5 7c.276 0 .5 .224 .5 .5C10 7.776 9.776 8 9.5 8h-4C5.224 8 5 7.776 5 7.5 5 7.224 5.224 7 5.5 7h4ZM2.309 4h4.691v-2h-3.691l-1 2ZM8 4h4.691l-1-2h-3.691v2Z"),
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
        return _archive!!
    }

private var _archive: ImageVector? = null
