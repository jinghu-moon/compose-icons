package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) return _globeHemisphereEast!!
        _globeHemisphereEast = phosphorDuotoneIcon(
            name = "GlobeHemisphereEast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215 168.71c-6.9 14.709-17.405 27.437-30.54 37l-9.36-9.37c-1.003-1.007-2.256-1.728-3.63-2.09L150 188.59c-3.94-1.036-6.472-4.869-5.88-8.9l2.38-16.2c.409-2.779 2.246-5.14 4.84-6.22l30.46-12.66c2.873-1.192 6.176-.611 8.47 1.49ZM159.89 105 182.06 79.2C183.306 77.754 183.995 75.909 184 74v-24C145.68 22.439 93.011 26.825 59.776 60.343 26.542 93.861 22.605 146.566 50.49 184.65l9.92-6.52c2.231-1.474 3.578-3.966 3.59-6.64l.21-36.23c.011-1.57 .48-3.103 1.35-4.41L86.5 99.55c1.213-1.801 3.107-3.031 5.245-3.408 2.139-.377 4.339 .131 6.095 1.408l19.81 13c1.668 1.201 3.732 1.72 5.77 1.45l31.46-4.26c1.95-.266 3.734-1.241 5.01-2.74Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
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
