package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Presentation: ImageVector
    get() {
        if (_presentation != null) return _presentation!!
        _presentation = phosphorLightIcon(
            name = "Presentation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-82v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-82C32.268 42 26 48.268 26 56v120c0 7.732 6.268 14 14 14h43.52L59.31 220.25c-2.071 2.59-1.65 6.369 .94 8.44 2.59 2.071 6.369 1.65 8.44-.94L98.88 190h58.24l30.19 37.75c2.071 2.59 5.85 3.011 8.44 .94 2.59-2.071 3.011-5.85 .94-8.44L172.48 190h43.52c7.732 0 14-6.268 14-14v-120c0-7.732-6.268-14-14-14ZM218 176c0 1.105-.895 2-2 2h-176c-1.105 0-2-.895-2-2v-120c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2Z"),
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
        return _presentation!!
    }

private var _presentation: ImageVector? = null
