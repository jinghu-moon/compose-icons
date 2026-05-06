package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Paragraph: ImageVector
    get() {
        if (_paragraph != null) return _paragraph!!
        _paragraph = phosphorLightIcon(
            name = "Paragraph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 42h-112C61.758 42 34 69.758 34 104c0 34.242 27.758 62 62 62h42v42c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-154h28v154c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-154h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM138 154h-42C68.386 154 46 131.614 46 104 46 76.386 68.386 54 96 54h42Z"),
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
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
