package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) return _cloudRain!!
        _cloudRain = phosphorThinIcon(
            name = "CloudRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M155.33 194.22l-32 48c-1.226 1.839-3.711 2.336-5.55 1.11-1.839-1.226-2.336-3.711-1.11-5.55l32-48c1.226-1.839 3.711-2.336 5.55-1.11 1.839 1.226 2.336 3.711 1.11 5.55ZM228 92c-.044 39.746-32.254 71.956-72 72h-25.86L99.33 210.22c-1.226 1.839-3.711 2.336-5.55 1.11-1.839-1.226-2.336-3.711-1.11-5.55L120.53 164h-44.53C57.47 163.984 40.604 153.303 32.668 136.558 24.731 119.813 27.142 99.996 38.862 85.642 50.581 71.289 69.516 64.963 87.51 69.39 98.646 35.839 132.471 15.315 167.373 20.932 202.275 26.549 227.953 56.649 228 92ZM220 92C219.921 57.412 192.399 29.133 157.826 28.114 123.253 27.096 94.115 53.707 92 88.23c-.127 2.209-2.021 3.897-4.23 3.77C85.561 91.873 83.873 89.979 84 87.77c.206-3.581 .681-7.141 1.42-10.65C70.428 73.496 54.687 78.814 44.966 90.789c-9.721 11.975-11.692 28.472-5.063 42.4C46.53 147.116 60.576 155.992 76 156h80c35.33-.039 63.961-28.67 64-64Z"),
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
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
