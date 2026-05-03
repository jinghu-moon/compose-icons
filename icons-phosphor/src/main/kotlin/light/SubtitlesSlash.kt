package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SubtitlesSlash: ImageVector
    get() {
        if (_subtitlesSlash != null) return _subtitlesSlash!!
        _subtitlesSlash = phosphorLightIcon(
            name = "SubtitlesSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 49.000 50.000 L 32.000 50.000 C 24.268 50.000 18.000 56.268 18.000 64.000 L 18.000 192.000 C 18.000 199.732 24.268 206.000 32.000 206.000 L 190.800 206.000 L 203.560 220.000 C 205.791 222.452 209.588 222.631 212.040 220.400 C 214.492 218.169 214.671 214.372 212.440 211.920 ZM 32.000 194.000 C 30.895 194.000 30.000 193.105 30.000 192.000 L 30.000 64.000 C 30.000 62.895 30.895 62.000 32.000 62.000 L 59.890 62.000 L 121.710 130.000 L 104.000 130.000 C 100.686 130.000 98.000 132.686 98.000 136.000 C 98.000 139.314 100.686 142.000 104.000 142.000 L 132.620 142.000 L 150.800 162.000 L 56.000 162.000 C 52.686 162.000 50.000 164.686 50.000 168.000 C 50.000 171.314 52.686 174.000 56.000 174.000 L 161.710 174.000 L 179.890 194.000 ZM 50.000 136.000 C 50.000 132.686 52.686 130.000 56.000 130.000 L 72.000 130.000 C 75.314 130.000 78.000 132.686 78.000 136.000 C 78.000 139.314 75.314 142.000 72.000 142.000 L 56.000 142.000 C 52.686 142.000 50.000 139.314 50.000 136.000 ZM 238.000 64.000 L 238.000 194.830 C 238.000 198.144 235.314 200.830 232.000 200.830 C 228.686 200.830 226.000 198.144 226.000 194.830 L 226.000 64.000 C 226.000 62.895 225.105 62.000 224.000 62.000 L 105.790 62.000 C 102.476 62.000 99.790 59.314 99.790 56.000 C 99.790 52.686 102.476 50.000 105.790 50.000 L 224.000 50.000 C 231.732 50.000 238.000 56.268 238.000 64.000 ZM 178.520 142.000 C 175.206 142.000 172.520 139.314 172.520 136.000 C 172.520 132.686 175.206 130.000 178.520 130.000 L 200.000 130.000 C 203.314 130.000 206.000 132.686 206.000 136.000 C 206.000 139.314 203.314 142.000 200.000 142.000 Z"),
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
        return _subtitlesSlash!!
    }

private var _subtitlesSlash: ImageVector? = null
