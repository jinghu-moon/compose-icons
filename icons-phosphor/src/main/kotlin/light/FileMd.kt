package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileMd: ImageVector
    get() {
        if (_fileMd != null) return _fileMd!!
        _fileMd = phosphorLightIcon(
            name = "FileMd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 112.000 C 42.000 115.314 44.686 118.000 48.000 118.000 C 51.314 118.000 54.000 115.314 54.000 112.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 146.000 38.000 L 146.000 88.000 C 146.000 91.314 148.686 94.000 152.000 94.000 L 202.000 94.000 L 202.000 224.000 C 202.000 227.314 204.686 230.000 208.000 230.000 C 211.314 230.000 214.000 227.314 214.000 224.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 ZM 158.000 46.480 L 193.520 82.000 L 158.000 82.000 ZM 144.000 146.000 L 128.000 146.000 C 124.686 146.000 122.000 148.686 122.000 152.000 L 122.000 208.000 C 122.000 211.314 124.686 214.000 128.000 214.000 L 144.000 214.000 C 162.778 214.000 178.000 198.778 178.000 180.000 C 178.000 161.222 162.778 146.000 144.000 146.000 ZM 144.000 202.000 L 134.000 202.000 L 134.000 158.000 L 144.000 158.000 C 156.150 158.000 166.000 167.850 166.000 180.000 C 166.000 192.150 156.150 202.000 144.000 202.000 ZM 102.000 152.000 L 102.000 208.000 C 102.000 211.314 99.314 214.000 96.000 214.000 C 92.686 214.000 90.000 211.314 90.000 208.000 L 90.000 171.000 L 72.920 195.440 C 71.798 197.048 69.961 198.006 68.000 198.006 C 66.039 198.006 64.202 197.048 63.080 195.440 L 46.000 171.000 L 46.000 208.000 C 46.000 211.314 43.314 214.000 40.000 214.000 C 36.686 214.000 34.000 211.314 34.000 208.000 L 34.000 152.000 C 33.997 149.379 35.697 147.059 38.197 146.271 C 40.697 145.484 43.420 146.410 44.920 148.560 L 68.000 181.560 L 91.080 148.560 C 92.580 146.410 95.303 145.484 97.803 146.271 C 100.303 147.059 102.003 149.379 102.000 152.000 Z"),
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
        return _fileMd!!
    }

private var _fileMd: ImageVector? = null
