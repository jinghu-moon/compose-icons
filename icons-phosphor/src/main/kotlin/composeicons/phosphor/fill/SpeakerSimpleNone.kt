package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerSimpleNone: ImageVector
    get() {
        if (_speakerSimpleNone != null) return _speakerSimpleNone!!
        _speakerSimpleNone = phosphorFillIcon(
            name = "SpeakerSimpleNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M163.52 24.81c-2.747-1.342-6.019-1-8.43 .88L85.25 80h-45.25C31.163 80 24 87.163 24 96v64c0 8.837 7.163 16 16 16h45.25l69.84 54.31c1.401 1.098 3.13 1.693 4.91 1.69 4.418 0 8-3.582 8-8v-192c.002-3.056-1.736-5.846-4.48-7.19Z"),
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
        return _speakerSimpleNone!!
    }

private var _speakerSimpleNone: ImageVector? = null
