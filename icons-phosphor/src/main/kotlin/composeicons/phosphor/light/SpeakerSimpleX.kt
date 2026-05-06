package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerSimpleX: ImageVector
    get() {
        if (_speakerSimpleX != null) return _speakerSimpleX!!
        _speakerSimpleX = phosphorLightIcon(
            name = "SpeakerSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M162.64 26.61c-2.058-1.008-4.51-.756-6.32 .65L85.94 82h-45.94C32.268 82 26 88.268 26 96v64c0 7.732 6.268 14 14 14h45.94l70.38 54.74c1.809 1.405 4.261 1.657 6.319 .65 2.058-1.008 3.362-3.099 3.361-5.39v-192c.001-2.291-1.303-4.382-3.36-5.39ZM154 211.73 91.68 163.26C90.627 162.443 89.333 162 88 162h-48c-1.105 0-2-.895-2-2v-64c0-1.105 .895-2 2-2h48c1.333 0 2.627-.443 3.68-1.26L154 44.27ZM252.24 147.73c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L224 136.48l-19.76 19.76c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L215.52 128 195.76 108.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L224 119.52 243.76 99.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333L232.48 128Z"),
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
        return _speakerSimpleX!!
    }

private var _speakerSimpleX: ImageVector? = null
