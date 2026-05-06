package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Presentation: ImageVector
    get() {
        if (_presentation != null) return _presentation!!
        _presentation = phosphorFillIcon(
            name = "Presentation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-80v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-80C31.163 40 24 47.163 24 56v120c0 8.837 7.163 16 16 16h39.36L57.75 219c-2.761 3.452-2.202 8.489 1.25 11.25 3.452 2.761 8.489 2.202 11.25-1.25L99.84 192h56.32l29.59 37c2.761 3.452 7.798 4.011 11.25 1.25 3.452-2.761 4.011-7.798 1.25-11.25L176.64 192h39.36c8.837 0 16-7.163 16-16v-120c0-8.837-7.163-16-16-16Z"),
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
