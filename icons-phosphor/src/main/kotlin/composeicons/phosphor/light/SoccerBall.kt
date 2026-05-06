package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) return _soccerBall!!
        _soccerBall = phosphorLightIcon(
            name = "SoccerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM205.67 173.42h-35.78L159.41 159l13.29-38.72 17-5.51 27.94 21.43c-1.194 13.138-5.282 25.849-11.97 37.22ZM86.11 173.42h-35.78C43.649 162.047 39.568 149.336 38.38 136.2L66.32 114.77l17 5.51L96.59 159ZM51 81.42l7.24 24.41-20 15.34C39.299 107.099 43.672 93.478 51 81.42ZM107.56 154 95.15 117.86 128 95.28l32.85 22.58L148.44 154ZM197.75 105.83 205 81.42c7.325 12.059 11.694 25.68 12.75 39.75ZM196.09 69.21 186 103.35l-17 5.53-35-24v-17.72L164.9 45.92c11.966 5.403 22.61 13.351 31.19 23.29ZM150.92 41 128 56.72 105.08 41c15.025-3.947 30.815-3.947 45.84 0ZM91.11 45.91 122 67.16v17.68l-35 24L70 103.31 59.91 69.21C68.494 59.269 79.141 51.318 91.11 45.91ZM58.75 185.42h26.18l9.19 26c-13.748-5.628-25.896-14.558-35.37-26ZM108.43 215.85 95.88 180.39 106.34 166h43.32l10.46 14.39-12.55 35.46c-12.889 2.867-26.251 2.867-39.14 0ZM161.88 211.37l9.19-26h26.18c-9.474 11.442-21.622 20.372-35.37 26Z"),
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
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
