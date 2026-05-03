package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorLightIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 110.000 C 151.196 110.000 170.000 91.196 170.000 68.000 C 170.000 44.804 151.196 26.000 128.000 26.000 C 104.804 26.000 86.000 44.804 86.000 68.000 C 86.000 91.196 104.804 110.000 128.000 110.000 ZM 128.000 38.000 C 144.569 38.000 158.000 51.431 158.000 68.000 C 158.000 84.569 144.569 98.000 128.000 98.000 C 111.431 98.000 98.000 84.569 98.000 68.000 C 98.000 51.431 111.431 38.000 128.000 38.000 ZM 206.000 224.000 C 206.000 227.314 203.314 230.000 200.000 230.000 L 56.000 230.000 C 53.499 230.013 51.252 228.473 50.362 226.136 C 49.471 223.799 50.124 221.154 52.000 219.500 L 152.580 130.750 C 133.967 123.266 112.960 124.653 95.493 134.521 C 78.027 144.388 65.996 161.665 62.800 181.470 C 62.334 184.374 59.832 186.513 56.890 186.520 C 56.555 186.524 56.221 186.500 55.890 186.450 C 54.313 186.204 52.899 185.340 51.960 184.049 C 51.022 182.758 50.637 181.146 50.890 179.570 C 54.812 155.103 70.126 133.955 92.148 122.594 C 114.170 111.234 140.279 111.013 162.490 122.000 L 188.000 99.500 C 190.485 97.307 194.277 97.545 196.470 100.030 C 198.663 102.515 198.425 106.307 195.940 108.500 L 71.870 218.000 L 200.000 218.000 C 203.314 218.000 206.000 220.686 206.000 224.000 ZM 192.080 147.520 C 201.172 160.568 206.032 176.097 206.000 192.000 C 206.000 195.314 203.314 198.000 200.000 198.000 C 196.686 198.000 194.000 195.314 194.000 192.000 C 194.027 178.547 189.918 165.410 182.230 154.370 C 180.417 151.651 181.113 147.981 183.796 146.115 C 186.479 144.249 190.162 144.874 192.080 147.520 Z"),
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
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
