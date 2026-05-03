package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NetworkSlash: ImageVector
    get() {
        if (_networkSlash != null) return _networkSlash!!
        _networkSlash = phosphorLightIcon(
            name = "NetworkSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 98.000 54.000 L 98.000 40.000 C 98.000 32.268 104.268 26.000 112.000 26.000 L 144.000 26.000 C 151.732 26.000 158.000 32.268 158.000 40.000 L 158.000 72.000 C 158.000 79.732 151.732 86.000 144.000 86.000 L 127.610 86.000 C 124.296 86.000 121.610 83.314 121.610 80.000 C 121.610 76.686 124.296 74.000 127.610 74.000 L 144.000 74.000 C 145.105 74.000 146.000 73.105 146.000 72.000 L 146.000 40.000 C 146.000 38.895 145.105 38.000 144.000 38.000 L 112.000 38.000 C 110.895 38.000 110.000 38.895 110.000 40.000 L 110.000 54.000 C 110.000 57.314 107.314 60.000 104.000 60.000 C 100.686 60.000 98.000 57.314 98.000 54.000 ZM 212.440 212.000 C 214.671 214.452 214.492 218.249 212.040 220.480 C 209.588 222.711 205.791 222.532 203.560 220.080 L 118.070 126.080 L 70.000 126.080 L 70.000 162.080 L 80.000 162.080 C 87.732 162.080 94.000 168.348 94.000 176.080 L 94.000 208.080 C 94.000 215.812 87.732 222.080 80.000 222.080 L 48.000 222.080 C 40.268 222.080 34.000 215.812 34.000 208.080 L 34.000 176.000 C 34.000 168.268 40.268 162.000 48.000 162.000 L 58.000 162.000 L 58.000 126.000 L 24.000 126.000 C 20.686 126.000 18.000 123.314 18.000 120.000 C 18.000 116.686 20.686 114.000 24.000 114.000 L 107.160 114.000 L 43.560 44.000 C 41.695 41.516 42.034 38.019 44.342 35.940 C 46.650 33.861 50.163 33.887 52.440 36.000 ZM 80.000 174.000 L 48.000 174.000 C 46.895 174.000 46.000 174.895 46.000 176.000 L 46.000 208.000 C 46.000 209.105 46.895 210.000 48.000 210.000 L 80.000 210.000 C 81.105 210.000 82.000 209.105 82.000 208.000 L 82.000 176.000 C 82.000 174.895 81.105 174.000 80.000 174.000 ZM 232.000 114.000 L 164.000 114.000 C 160.686 114.000 158.000 116.686 158.000 120.000 C 158.000 123.314 160.686 126.000 164.000 126.000 L 186.000 126.000 L 186.000 150.830 C 186.000 154.144 188.686 156.830 192.000 156.830 C 195.314 156.830 198.000 154.144 198.000 150.830 L 198.000 126.000 L 232.000 126.000 C 235.314 126.000 238.000 123.314 238.000 120.000 C 238.000 116.686 235.314 114.000 232.000 114.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _networkSlash!!
    }

private var _networkSlash: ImageVector? = null
