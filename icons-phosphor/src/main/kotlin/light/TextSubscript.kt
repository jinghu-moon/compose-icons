package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) return _textSubscript!!
        _textSubscript = phosphorLightIcon(
            name = "TextSubscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.000 208.000 C 246.000 211.314 243.314 214.000 240.000 214.000 L 192.000 214.000 C 189.727 214.000 187.650 212.716 186.633 210.683 C 185.617 208.651 185.836 206.218 187.200 204.400 L 230.370 146.840 C 234.599 141.173 235.118 133.554 231.697 127.365 C 228.275 121.177 221.547 117.565 214.498 118.133 C 207.450 118.701 201.387 123.343 199.000 130.000 C 198.324 132.070 196.578 133.612 194.440 134.027 C 192.302 134.442 190.106 133.665 188.705 131.998 C 187.303 130.331 186.914 128.035 187.690 126.000 C 191.684 114.929 201.782 107.217 213.514 106.277 C 225.245 105.337 236.443 111.344 242.148 121.637 C 247.854 131.930 247.014 144.609 240.000 154.060 L 204.000 202.000 L 240.000 202.000 C 243.314 202.000 246.000 204.686 246.000 208.000 ZM 147.930 51.470 C 145.428 49.301 141.641 49.570 139.470 52.070 L 92.000 106.840 L 44.530 52.070 C 43.148 50.374 40.952 49.565 38.800 49.958 C 36.648 50.351 34.881 51.885 34.188 53.960 C 33.495 56.035 33.986 58.322 35.470 59.930 L 84.060 116.000 L 35.470 172.070 C 33.986 173.678 33.495 175.965 34.188 178.040 C 34.881 180.115 36.648 181.649 38.800 182.042 C 40.952 182.435 43.148 181.626 44.530 179.930 L 92.000 125.160 L 139.470 179.930 C 141.669 182.312 145.362 182.517 147.811 180.392 C 150.259 178.268 150.578 174.583 148.530 172.070 L 99.940 116.000 L 148.530 59.930 C 150.699 57.428 150.430 53.641 147.930 51.470 Z"),
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
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
