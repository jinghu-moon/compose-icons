package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) return _globeHemisphereEast!!
        _globeHemisphereEast = phosphorLightIcon(
            name = "GlobeHemisphereEast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 38c17.807-.019 35.216 5.274 50 15.2v20.8c.002 .48-.168 .945-.48 1.31L155.35 101c-.319 .372-.764 .614-1.25 .68L122.63 106c-.508 .069-1.024-.06-1.44-.36l-.24-.16L101.25 92.59C98.168 90.412 94.338 89.571 90.628 90.256c-3.711 .685-6.987 2.839-9.088 5.974l-21 31.3c-1.529 2.281-2.35 4.964-2.36 7.71L58 171.45c-.003 .669-.341 1.292-.9 1.66l-5 3.27C34.434 148.669 33.277 113.532 49.081 84.719 64.885 55.905 95.137 37.997 128 38ZM59.28 186.05l4.43-2.9c3.911-2.58 6.271-6.945 6.29-11.63l.21-36.23c.003-.391 .117-.772 .33-1.1l21-31.3c.302-.453 .775-.763 1.31-.86 .533-.094 1.082 .032 1.52 .35l.24 .16 19.7 12.89c2.9 2.06 6.477 2.933 10 2.44l31.47-4.26c3.392-.46 6.497-2.146 8.73-4.74L186.68 83.11C188.836 80.566 190.014 77.335 190 74v-11.18c25.871 24.566 34.771 62.105 22.68 95.67L194.28 141.67c-4.015-3.673-9.795-4.687-14.82-2.6L149 151.73c-4.53 1.905-7.743 6.031-8.48 10.89l-2.38 16.19c-1.039 7.059 3.398 13.77 10.3 15.58L169.9 200c.344 .096 .657 .279 .91 .53l4.18 4.18C137.113 227.961 87.928 220.029 59.28 186.05ZM184.9 197.68l-5.59-5.61c-1.758-1.76-3.953-3.02-6.36-3.65l-21.46-5.63c-.987-.259-1.621-1.22-1.47-2.23l2.39-16.19c.101-.697 .56-1.289 1.21-1.56l30.45-12.66c.718-.3 1.546-.155 2.12 .37l21.36 19.54c-5.647 10.616-13.346 20.004-22.65 27.62Z"),
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
        return _globeHemisphereEast!!
    }

private var _globeHemisphereEast: ImageVector? = null
