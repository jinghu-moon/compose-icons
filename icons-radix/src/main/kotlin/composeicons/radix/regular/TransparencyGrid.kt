package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TransparencyGrid: ImageVector
    get() {
        if (_transparencyGrid != null) return _transparencyGrid!!
        _transparencyGrid = radixIcon(
            name = "TransparencyGrid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 15h-3v-3h3v3ZM9 15h-3v-3h3v3ZM15 15h-3v-3h3v3ZM6 12h-3v-3h3v3ZM12 12h-3v-3h3v3ZM3 9h-3v-3h3v3ZM9 9h-3v-3h3v3ZM15 9h-3v-3h3v3ZM6 6h-3v-3h3v3ZM12 6h-3v-3h3v3ZM3 3h-3v-3h3v3ZM9 3h-3v-3h3v3ZM15 3h-3v-3h3v3Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.25f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _transparencyGrid!!
    }

private var _transparencyGrid: ImageVector? = null
