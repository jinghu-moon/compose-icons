package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = phosphorLightIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M249.92 113.4 182.47 45.49C145.709 8.821 86.197 8.848 49.47 45.55L35.68 59.78c-2.306 2.383-2.243 6.184 .14 8.49 2.383 2.306 6.184 2.243 8.49-.14L58 54C64.028 47.961 70.961 42.9 78.55 39l49 49L30.09 185.4c-2.629 2.626-4.106 6.189-4.106 9.905 0 3.716 1.477 7.279 4.106 9.905l20.69 20.69c2.626 2.626 6.187 4.101 9.9 4.101 3.713 0 7.274-1.475 9.9-4.101L168 128.46l33.42 33.42c2.626 2.626 6.187 4.101 9.9 4.101 3.713 0 7.274-1.475 9.9-4.101l28.68-28.69c5.467-5.461 5.476-14.318 .02-19.79ZM62.1 217.41c-.375 .376-.884 .587-1.415 .587-.531 0-1.04-.211-1.415-.587L38.58 196.72c-.376-.375-.587-.884-.587-1.415 0-.531 .211-1.04 .587-1.415L108 124.46 131.51 148ZM163.76 115.73 140 139.49 116.48 116 140.24 92.24c1.127-1.125 1.76-2.653 1.76-4.245 0-1.592-.633-3.12-1.76-4.245L90.54 34C119.907 24.431 152.16 32.159 174 54l45.62 45.93L188 131.49 172.24 115.73c-2.343-2.34-6.137-2.34-8.48 0ZM241.42 124.73l-28.69 28.7c-.375 .376-.884 .587-1.415 .587-.531 0-1.04-.211-1.415-.587L196.49 140l31.56-31.57 13.37 13.46c.769 .779 .769 2.031 0 2.81Z"),
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
