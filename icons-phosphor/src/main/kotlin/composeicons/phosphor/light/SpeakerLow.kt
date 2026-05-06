package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) return _speakerLow!!
        _speakerLow = phosphorLightIcon(
            name = "SpeakerLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M154.64 26.61c-2.058-1.008-4.51-.756-6.32 .65L77.94 82h-45.94C24.268 82 18 88.268 18 96v64c0 7.732 6.268 14 14 14h45.94l70.38 54.74c1.809 1.405 4.261 1.657 6.319 .65 2.058-1.008 3.362-3.099 3.361-5.39v-192c.001-2.291-1.303-4.382-3.36-5.39ZM30 160v-64c0-1.105 .895-2 2-2h42v68h-42c-1.105 0-2-.895-2-2ZM146 211.73 86 165.07v-74.14L146 44.27ZM206 128c.007 9.258-3.372 18.2-9.5 25.14-2.193 2.485-5.985 2.723-8.47 .53-2.485-2.193-2.723-5.985-.53-8.47 8.652-9.823 8.652-24.547 0-34.37-2.077-2.496-1.791-6.193 .646-8.34 2.437-2.147 6.139-1.966 8.354 .41 6.114 6.933 9.492 15.856 9.5 25.1Z"),
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
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
