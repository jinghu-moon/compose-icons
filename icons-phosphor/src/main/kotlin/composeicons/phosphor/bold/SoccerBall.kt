package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) return _soccerBall!!
        _soccerBall = phosphorBoldIcon(
            name = "SoccerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM199.88 171.42h-24L166.1 158l11.3-32.94L193.15 120l18.6 14.26c-.964 13.151-5.032 25.886-11.87 37.16ZM44.25 134.21 62.85 120l15.75 5.11L89.9 158l-9.75 13.42h-24C49.294 160.133 45.215 147.38 44.25 134.21ZM111.85 148l-9.54-27.77L128 102.56l25.69 17.67L144.15 148ZM192.51 74.27l-6.78 22.85-15.81 5.14L140 81.69v-16.23L161.22 50.87c12.119 5.241 22.837 13.256 31.29 23.4ZM94.78 50.87 116 65.46v16.23L86.08 102.26 70.27 97.12 63.49 74.27C71.943 64.126 82.661 56.111 94.78 50.87ZM108.36 209.66 99.74 185.29 109.39 172h37.22l9.65 13.29-8.62 24.37c-12.907 3.12-26.373 3.12-39.28 0Z"),
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
