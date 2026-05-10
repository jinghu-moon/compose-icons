package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerSimpleLow: ImageVector
    get() {
        if (_speakerSimpleLow != null) return _speakerSimpleLow!!
        _speakerSimpleLow = phosphorFillIcon(
            name = "SpeakerSimpleLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 32v192c-.002 3.054-1.743 5.84-4.487 7.181-2.744 1.341-6.012 1.003-8.423-.871L85.25 176h-45.25c-8.837 0-16-7.163-16-16v-64C24 87.163 31.163 80 40 80h45.25L155.09 25.69c2.411-1.874 5.679-2.213 8.423-.871 2.744 1.341 4.485 4.127 4.487 7.181ZM200 96c-4.418 0-8 3.582-8 8v48c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8Z"),
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
        return _speakerSimpleLow!!
    }

private var _speakerSimpleLow: ImageVector? = null
