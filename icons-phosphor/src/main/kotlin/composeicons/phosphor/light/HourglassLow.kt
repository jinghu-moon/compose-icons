package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HourglassLow: ImageVector
    get() {
        if (_hourglassLow != null) return _hourglassLow!!
        _hourglassLow = phosphorLightIcon(
            name = "HourglassLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198 75.64v-35.64c0-7.732-6.268-14-14-14h-112C64.268 26 58 32.268 58 40v36c.009 4.404 2.082 8.55 5.6 11.2L118 128 63.6 168.8C60.082 171.45 58.009 175.596 58 180v36c0 7.732 6.268 14 14 14h112c7.732 0 14-6.268 14-14v-35.64c-.012-4.386-2.068-8.516-5.56-11.17L138 128 192.49 86.81c3.473-2.664 5.51-6.793 5.51-11.17ZM184.2 178h-112.87L128 135.51ZM184 218h-112c-1.105 0-2-.895-2-2v-26h116v26c0 1.105-.895 2-2 2ZM186 75.64c.002 .628-.29 1.22-.79 1.6L128 120.49 70.8 77.6C70.296 77.222 70 76.63 70 76v-36c0-1.105 .895-2 2-2h112c1.105 0 2 .895 2 2Z"),
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
        return _hourglassLow!!
    }

private var _hourglassLow: ImageVector? = null
