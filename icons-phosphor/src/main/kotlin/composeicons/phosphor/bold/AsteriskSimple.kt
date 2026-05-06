package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorBoldIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.45 107.14l-65.19 26.08 46.21 59.41c2.653 3.382 3.295 7.924 1.682 11.909-1.613 3.984-5.233 6.802-9.491 7.387-4.258 .585-8.504-1.153-11.131-4.556L128 147.55 81.47 207.37c-4.079 5.2-11.596 6.122-16.811 2.063-5.216-4.059-6.167-11.572-2.129-16.803l46.21-59.41L43.55 107.14c-4.062-1.534-6.978-5.144-7.626-9.437-.647-4.294 1.076-8.602 4.505-11.266 3.429-2.664 8.03-3.267 12.03-1.577L116 110.28v-70.28c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v70.28L203.54 84.86c4-1.69 8.601-1.087 12.03 1.577 3.429 2.664 5.152 6.972 4.505 11.266-.647 4.294-3.563 7.903-7.626 9.437Z"),
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
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
