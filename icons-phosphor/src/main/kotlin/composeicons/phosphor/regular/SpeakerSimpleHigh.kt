package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpeakerSimpleHigh: ImageVector
    get() {
        if (_speakerSimpleHigh != null) return _speakerSimpleHigh!!
        _speakerSimpleHigh = phosphorRegularIcon(
            name = "SpeakerSimpleHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M163.51 24.81c-2.745-1.337-6.011-.996-8.42 .88L85.25 80h-45.25C31.163 80 24 87.163 24 96v64c0 8.837 7.163 16 16 16h45.25l69.84 54.31c2.411 1.874 5.679 2.213 8.423 .871 2.744-1.341 4.485-4.127 4.487-7.181v-192c0-3.058-1.742-5.848-4.49-7.19ZM152 207.64 92.91 161.69C91.509 160.592 89.78 159.997 88 160h-48v-64h48c1.78 .003 3.509-.592 4.91-1.69L152 48.36ZM208 104v48c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM240 88v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _speakerSimpleHigh!!
    }

private var _speakerSimpleHigh: ImageVector? = null
