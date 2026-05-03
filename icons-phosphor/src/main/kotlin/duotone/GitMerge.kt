package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) return _gitMerge!!
        _gitMerge = phosphorDuotoneIcon(
            name = "GitMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 104.000 56.000 C 104.000 69.255 93.255 80.000 80.000 80.000 C 66.745 80.000 56.000 69.255 56.000 56.000 C 56.000 42.745 66.745 32.000 80.000 32.000 C 93.255 32.000 104.000 42.745 104.000 56.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 208.000 112.000 C 193.806 112.025 181.318 121.383 177.310 135.000 L 135.100 129.000 C 133.176 128.728 131.416 127.765 130.150 126.290 L 94.430 84.550 C 108.221 77.560 115.043 61.709 110.637 46.889 C 106.231 32.068 91.859 22.517 76.489 24.196 C 61.119 25.875 49.147 38.303 48.045 53.725 C 46.943 69.148 57.025 83.152 72.000 87.000 L 72.000 169.000 C 56.398 173.029 46.225 188.030 48.255 204.016 C 50.285 220.002 63.886 231.984 80.000 231.984 C 96.114 231.984 109.715 220.002 111.745 204.016 C 113.775 188.030 103.602 173.029 88.000 169.000 L 88.000 101.630 L 118.000 136.630 C 121.791 141.053 127.063 143.947 132.830 144.770 L 176.830 151.050 C 180.523 167.399 196.204 178.128 212.780 175.648 C 229.355 173.167 241.209 158.317 239.954 141.604 C 238.699 124.890 224.760 111.977 208.000 112.000 ZM 64.000 56.000 C 64.000 47.163 71.163 40.000 80.000 40.000 C 88.837 40.000 96.000 47.163 96.000 56.000 C 96.000 64.837 88.837 72.000 80.000 72.000 C 71.163 72.000 64.000 64.837 64.000 56.000 ZM 96.000 200.000 C 96.000 208.837 88.837 216.000 80.000 216.000 C 71.163 216.000 64.000 208.837 64.000 200.000 C 64.000 191.163 71.163 184.000 80.000 184.000 C 88.837 184.000 96.000 191.163 96.000 200.000 ZM 208.000 160.000 C 199.163 160.000 192.000 152.837 192.000 144.000 C 192.000 135.163 199.163 128.000 208.000 128.000 C 216.837 128.000 224.000 135.163 224.000 144.000 C 224.000 152.837 216.837 160.000 208.000 160.000 Z"),
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
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
