package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = phosphorLightIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 196.2c-.361-4.096-2.504-7.825-5.86-10.2L192.21 157.48l18.62-18.62c8.958-8.868 12.885-21.63 10.46-34C216.739 82.463 204.46 62.379 186.6 48.12 168.494 33.519 145.858 25.698 122.6 26.01 69.628 26.913 26.903 69.638 26 122.61c-.289 23.254 7.529 45.883 22.11 64 14.253 17.858 34.33 30.137 56.72 34.69 12.37 2.425 25.132-1.502 34-10.46l18.62-18.62L186 232.14c2.375 3.356 6.104 5.499 10.2 5.86 .39 0 .78 .05 1.16 .05 3.71-.002 7.267-1.477 9.89-4.1l26.65-26.64c2.943-2.915 4.444-6.983 4.1-11.11ZM57.47 179.08C44.639 163.14 37.755 143.231 38 122.77 38.812 76.293 76.293 38.812 122.77 38c20.459-.24 40.365 6.639 56.31 19.46 7.958 6.414 14.727 14.175 20 22.93L80.4 199.12C71.64 193.838 63.878 187.054 57.47 179.08ZM225.41 198.77l-26.64 26.64c-.415 .401-.982 .604-1.557 .556-.575-.048-1.101-.342-1.443-.806L163.13 179.47c-1.039-1.438-2.661-2.342-4.43-2.47h-.49c-1.591 .001-3.116 .634-4.24 1.76l-23.63 23.62h0c-6.038 6.115-14.734 8.806-23.17 7.17-5.306-1.058-10.495-2.639-15.49-4.72L204.8 91.68c2.079 4.995 3.66 10.184 4.72 15.49 1.637 8.438-1.058 17.136-7.18 23.17L178.72 154c-1.246 1.246-1.881 2.977-1.736 4.734 .144 1.756 1.054 3.36 2.486 4.386l45.69 32.64c.464 .342 .758 .869 .806 1.443 .048 .575-.155 1.142-.556 1.557Z"),
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
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
