package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scooter: ImageVector
    get() {
        if (_scooter != null) return _scooter!!
        _scooter = phosphorLightIcon(
            name = "Scooter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 138c-1.637 .003-3.271 .124-4.89 .36L173.69 38.1C172.873 35.652 170.581 34.001 168 34h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h27.68l18.24 54.73L125.16 170h-47.22C76.898 152.429 62.617 138.558 45.022 138.029c-17.594-.529-32.683 12.457-34.781 29.934-2.097 17.477 9.491 33.664 26.711 37.313C54.173 208.923 71.33 198.826 76.5 182h51.5c1.798-.001 3.501-.808 4.64-2.2l53.76-65.62 9.33 28c-15.034 8.234-21.587 26.372-15.288 42.314 6.299 15.942 23.48 24.702 40.082 20.437 16.602-4.265 27.433-20.222 25.267-37.226C243.625 150.701 229.141 137.968 212 138ZM44 194C31.85 194 22 184.15 22 172c0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22ZM212 194c-12.15 0-22-9.85-22-22 0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22Z"),
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
        return _scooter!!
    }

private var _scooter: ImageVector? = null
