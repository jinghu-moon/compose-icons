package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SoundcloudLogo: ImageVector
    get() {
        if (_soundcloudLogo != null) return _soundcloudLogo!!
        _soundcloudLogo = phosphorLightIcon(
            name = "SoundcloudLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 120.000 L 22.000 168.000 C 22.000 171.314 19.314 174.000 16.000 174.000 C 12.686 174.000 10.000 171.314 10.000 168.000 L 10.000 120.000 C 10.000 116.686 12.686 114.000 16.000 114.000 C 19.314 114.000 22.000 116.686 22.000 120.000 ZM 48.000 90.000 C 44.686 90.000 42.000 92.686 42.000 96.000 L 42.000 192.000 C 42.000 195.314 44.686 198.000 48.000 198.000 C 51.314 198.000 54.000 195.314 54.000 192.000 L 54.000 96.000 C 54.000 92.686 51.314 90.000 48.000 90.000 ZM 80.000 82.000 C 76.686 82.000 74.000 84.686 74.000 88.000 L 74.000 192.000 C 74.000 195.314 76.686 198.000 80.000 198.000 C 83.314 198.000 86.000 195.314 86.000 192.000 L 86.000 88.000 C 86.000 84.686 83.314 82.000 80.000 82.000 ZM 112.000 50.000 C 108.686 50.000 106.000 52.686 106.000 56.000 L 106.000 192.000 C 106.000 195.314 108.686 198.000 112.000 198.000 C 115.314 198.000 118.000 195.314 118.000 192.000 L 118.000 56.000 C 118.000 52.686 115.314 50.000 112.000 50.000 ZM 221.060 107.880 C 215.093 69.945 182.402 41.996 144.000 42.000 C 140.686 42.000 138.000 44.686 138.000 48.000 C 138.000 51.314 140.686 54.000 144.000 54.000 C 177.916 53.879 206.359 79.576 209.670 113.330 C 209.935 115.966 211.899 118.117 214.500 118.620 C 231.708 121.952 243.563 137.819 241.880 155.265 C 240.197 172.711 225.527 186.019 208.000 186.000 L 144.000 186.000 C 140.686 186.000 138.000 188.686 138.000 192.000 C 138.000 195.314 140.686 198.000 144.000 198.000 L 208.000 198.000 C 230.873 198.022 250.288 181.234 253.568 158.597 C 256.849 135.961 242.998 114.352 221.060 107.880 Z"),
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
        return _soundcloudLogo!!
    }

private var _soundcloudLogo: ImageVector? = null
