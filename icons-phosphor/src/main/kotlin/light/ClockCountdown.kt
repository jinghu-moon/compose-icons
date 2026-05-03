package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorLightIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 136.490 C 225.364 190.424 179.448 231.370 125.337 229.823 C 71.226 228.276 27.724 184.774 26.177 130.663 C 24.630 76.552 65.576 30.636 119.510 26.000 C 122.824 25.724 125.734 28.186 126.010 31.500 C 126.286 34.814 123.824 37.724 120.510 38.000 C 72.902 42.077 36.749 82.599 38.107 130.361 C 39.464 178.124 77.859 216.527 125.622 217.894 C 173.384 219.261 213.913 183.117 218.000 135.510 C 218.276 132.196 221.186 129.734 224.500 130.010 C 227.814 130.286 230.276 133.196 230.000 136.510 ZM 122.000 72.000 L 122.000 128.000 C 122.000 131.314 124.686 134.000 128.000 134.000 L 184.000 134.000 C 187.314 134.000 190.000 131.314 190.000 128.000 C 190.000 124.686 187.314 122.000 184.000 122.000 L 134.000 122.000 L 134.000 72.000 C 134.000 68.686 131.314 66.000 128.000 66.000 C 124.686 66.000 122.000 68.686 122.000 72.000 ZM 160.000 46.000 C 165.523 46.000 170.000 41.523 170.000 36.000 C 170.000 30.477 165.523 26.000 160.000 26.000 C 154.477 26.000 150.000 30.477 150.000 36.000 C 150.000 41.523 154.477 46.000 160.000 46.000 ZM 196.000 70.000 C 201.523 70.000 206.000 65.523 206.000 60.000 C 206.000 54.477 201.523 50.000 196.000 50.000 C 190.477 50.000 186.000 54.477 186.000 60.000 C 186.000 65.523 190.477 70.000 196.000 70.000 ZM 220.000 106.000 C 225.523 106.000 230.000 101.523 230.000 96.000 C 230.000 90.477 225.523 86.000 220.000 86.000 C 214.477 86.000 210.000 90.477 210.000 96.000 C 210.000 101.523 214.477 106.000 220.000 106.000 Z"),
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
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
