package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) return _airplaneTilt!!
        _airplaneTilt = phosphorLightIcon(
            name = "AirplaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M183 113.65 213.1 85.33l.13-.13c11.717-11.717 11.717-30.713 0-42.43-11.717-11.717-30.713-11.717-42.43 0l-.13 .13L142.35 73 58.05 42.35c-2.189-.797-4.641-.255-6.29 1.39L27.76 67.74c-1.281 1.271-1.922 3.051-1.745 4.846 .176 1.796 1.152 3.417 2.655 4.414l65.92 43.94L77.52 138h-21.52c-1.591 .001-3.116 .634-4.24 1.76l-24 24c-1.43 1.424-2.048 3.471-1.645 5.449 .403 1.977 1.772 3.62 3.645 4.371l37.62 15 15 37.56v.12c1.259 3.054 4.75 4.516 7.81 3.27 .782-.318 1.488-.798 2.07-1.41l23.91-23.91c1.144-1.105 1.802-2.62 1.83-4.21v-21.52l17.07-17.07L179 227.33c.998 1.493 2.612 2.461 4.4 2.637 1.787 .176 3.56-.458 4.83-1.727l24-24c1.645-1.649 2.187-4.101 1.39-6.29ZM184.94 214.58 141 148.66c-.997-1.494-2.612-2.463-4.4-2.64h-.59c-1.591 .001-3.116 .634-4.24 1.76l-24 24c-1.124 1.118-1.761 2.635-1.77 4.22v21.52L90.2 213.32 77.57 181.77c-.608-1.527-1.815-2.738-3.34-3.35L42.68 165.8 58.49 150h21.51c1.594 .001 3.123-.632 4.25-1.76l24-24c1.269-1.272 1.901-3.045 1.723-4.833-.178-1.787-1.148-3.401-2.643-4.397L41.42 71.06 57.54 54.93 142 85.63c2.253 .818 4.778 .217 6.42-1.53l31-32.9c7.127-6.388 18.005-6.082 24.762 .696 6.757 6.778 7.028 17.658 .618 24.764l-32.9 31c-1.747 1.642-2.348 4.167-1.53 6.42l30.7 84.41Z"),
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
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
