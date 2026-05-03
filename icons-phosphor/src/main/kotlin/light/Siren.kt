package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Siren: ImageVector
    get() {
        if (_siren != null) return _siren!!
        _siren = phosphorLightIcon(
            name = "Siren",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 122.000 16.000 L 122.000 8.000 C 122.000 4.686 124.686 2.000 128.000 2.000 C 131.314 2.000 134.000 4.686 134.000 8.000 L 134.000 16.000 C 134.000 19.314 131.314 22.000 128.000 22.000 C 124.686 22.000 122.000 19.314 122.000 16.000 ZM 200.000 46.000 C 201.591 45.999 203.116 45.366 204.240 44.240 L 212.240 36.240 C 213.845 34.744 214.506 32.492 213.963 30.366 C 213.420 28.240 211.760 26.580 209.634 26.037 C 207.508 25.494 205.256 26.155 203.760 27.760 L 195.760 35.760 C 194.046 37.476 193.534 40.055 194.462 42.295 C 195.389 44.536 197.575 45.998 200.000 46.000 ZM 51.760 44.240 C 54.124 46.443 57.808 46.378 60.093 44.093 C 62.378 41.808 62.443 38.124 60.240 35.760 L 52.240 27.760 C 49.876 25.557 46.192 25.622 43.907 27.907 C 41.622 30.192 41.557 33.876 43.760 36.240 ZM 137.000 74.080 C 133.730 73.528 130.632 75.730 130.080 79.000 C 129.528 82.270 131.730 85.368 135.000 85.920 C 155.000 89.260 170.000 107.360 170.000 128.000 C 170.000 131.314 172.686 134.000 176.000 134.000 C 179.314 134.000 182.000 131.314 182.000 128.000 C 182.000 101.570 162.650 78.390 137.000 74.080 ZM 230.000 176.000 L 230.000 200.000 C 230.000 207.732 223.732 214.000 216.000 214.000 L 40.000 214.000 C 32.268 214.000 26.000 207.732 26.000 200.000 L 26.000 176.000 C 26.000 168.268 32.268 162.000 40.000 162.000 L 42.000 162.000 L 42.000 128.000 C 42.000 80.504 80.504 42.000 128.000 42.000 L 128.650 42.000 C 175.710 42.350 214.000 81.380 214.000 129.000 L 214.000 162.000 L 216.000 162.000 C 223.732 162.000 230.000 168.268 230.000 176.000 ZM 54.000 162.000 L 202.000 162.000 L 202.000 129.000 C 202.000 88.000 169.060 54.300 128.560 54.000 L 128.000 54.000 C 87.131 54.000 54.000 87.131 54.000 128.000 ZM 218.000 176.000 C 218.000 174.895 217.105 174.000 216.000 174.000 L 40.000 174.000 C 38.895 174.000 38.000 174.895 38.000 176.000 L 38.000 200.000 C 38.000 201.105 38.895 202.000 40.000 202.000 L 216.000 202.000 C 217.105 202.000 218.000 201.105 218.000 200.000 Z"),
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
        return _siren!!
    }

private var _siren: ImageVector? = null
