package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorFillIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 92.800 145.600 C 96.335 148.251 97.051 153.265 94.400 156.800 C 91.749 160.335 86.735 161.051 83.200 158.400 L 51.200 134.400 C 49.186 132.889 48.000 130.518 48.000 128.000 C 48.000 125.482 49.186 123.111 51.200 121.600 L 83.200 97.600 C 86.735 94.949 91.749 95.665 94.400 99.200 C 97.051 102.735 96.335 107.749 92.800 110.400 L 69.330 128.000 ZM 151.690 74.200 L 119.690 186.200 C 118.948 188.998 116.752 191.177 113.948 191.897 C 111.144 192.617 108.169 191.766 106.170 189.672 C 104.172 187.578 103.460 184.567 104.310 181.800 L 136.310 69.800 C 137.589 65.634 141.968 63.259 146.158 64.457 C 150.348 65.656 152.807 69.988 151.690 74.200 ZM 204.800 134.400 L 172.800 158.400 C 169.265 161.051 164.251 160.335 161.600 156.800 C 158.949 153.265 159.665 148.251 163.200 145.600 L 186.670 128.000 L 163.200 110.400 C 159.665 107.749 158.949 102.735 161.600 99.200 C 164.251 95.665 169.265 94.949 172.800 97.600 L 204.800 121.600 C 206.814 123.111 208.000 125.482 208.000 128.000 C 208.000 130.518 206.814 132.889 204.800 134.400 Z"),
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
        return _code!!
    }

private var _code: ImageVector? = null
