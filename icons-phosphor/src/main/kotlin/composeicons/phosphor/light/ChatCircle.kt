package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) return _chatCircle!!
        _chatCircle = phosphorLightIcon(
            name = "ChatCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C92.028 25.992 58.711 44.934 40.319 75.849 21.927 106.764 21.179 145.081 38.35 176.69L26.73 211.56c-1.678 5.031-.369 10.578 3.381 14.329 3.75 3.75 9.297 5.059 14.329 3.381L79.31 217.65c37.396 20.294 83.46 15.243 115.57-12.671 32.11-27.914 43.521-72.827 28.628-112.683C208.615 52.441 170.547 26.016 128 26ZM128 218c-15.821 .004-31.363-4.163-45.06-12.08-.913-.525-1.947-.804-3-.81-.646 .004-1.287 .108-1.9 .31L40.65 217.88c-.719 .24-1.511 .053-2.047-.483-.536-.536-.723-1.328-.483-2.047L50.58 178c.545-1.633 .363-3.421-.5-4.91C29.669 137.83 35.489 93.257 64.27 64.421 93.051 35.585 137.614 29.68 172.912 50.024c35.298 20.344 52.527 61.864 42.004 101.223C204.393 190.606 168.741 217.987 128 218Z"),
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
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null
