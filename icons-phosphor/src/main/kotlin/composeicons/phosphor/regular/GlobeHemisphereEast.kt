package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) return _globeHemisphereEast!!
        _globeHemisphereEast = phosphorRegularIcon(
            name = "GlobeHemisphereEast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 40c17.05-.018 33.733 4.945 48 14.28v19.72L153.83 99.74 122.36 104l-.31-.22L102.38 90.92C98.857 88.438 94.482 87.483 90.245 88.269c-4.237 .787-7.977 3.249-10.375 6.831L58.93 126.4c-1.744 2.608-2.683 5.672-2.7 8.81L56 171.44l-3.27 2.15C36.271 146.416 35.737 112.481 51.332 84.802 66.927 57.124 96.23 40 128 40ZM62.29 186.47l2.52-1.65c4.469-2.948 7.168-7.936 7.19-13.29l.21-36.23L93.17 104c.103 .079 .209 .152 .32 .22l19.67 12.87c3.296 2.327 7.352 3.316 11.35 2.77L156 115.59c3.883-.518 7.441-2.443 10-5.41L188.17 84.42C190.649 81.515 192.008 77.819 192 74v-6.33c22.04 23.317 29.618 56.794 19.77 87.33L195.63 140.24c-4.581-4.205-11.183-5.375-16.93-3l-30.46 12.65c-5.18 2.174-8.85 6.894-9.68 12.45l-2.39 16.19c-1.189 8.069 3.881 15.741 11.77 17.81L169.4 202l2.36 2.37C135.638 225.095 89.929 217.621 62.29 186.47ZM185 195l-4.3-4.31c-2.006-2.013-4.512-3.456-7.26-4.18L152 180.85l2.39-16.19L184.84 152 205 170.48c-5.138 9.309-11.913 17.616-20 24.52Z"),
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
