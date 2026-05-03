package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Umbrella: ImageVector
    get() {
        if (_umbrella != null) return _umbrella!!
        _umbrella = phosphorDuotoneIcon(
            name = "Umbrella",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 32.000 C 128.000 32.000 88.000 64.000 88.000 136.000 L 32.000 136.000 C 29.749 136.009 27.599 135.069 26.077 133.412 C 24.554 131.754 23.800 129.532 24.000 127.290 C 28.636 73.327 73.838 31.910 128.000 32.000 ZM 232.000 127.290 C 227.364 73.327 182.162 31.910 128.000 32.000 C 128.000 32.000 168.000 64.000 168.000 136.000 L 224.000 136.000 C 226.251 136.009 228.401 135.069 229.923 133.412 C 231.446 131.754 232.200 129.532 232.000 127.290 Z"),
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
        pathData = parseSvgPathData("M 240.000 126.630 C 236.274 83.908 208.571 47.026 168.580 31.543 C 128.588 16.061 83.272 24.674 51.750 53.750 C 31.123 72.700 18.379 98.716 16.050 126.630 C 15.666 131.097 17.174 135.520 20.206 138.822 C 23.238 142.124 27.517 144.002 32.000 144.000 L 120.000 144.000 L 120.000 200.000 C 120.000 217.673 134.327 232.000 152.000 232.000 C 169.673 232.000 184.000 217.673 184.000 200.000 C 184.000 195.582 180.418 192.000 176.000 192.000 C 171.582 192.000 168.000 195.582 168.000 200.000 C 168.000 208.837 160.837 216.000 152.000 216.000 C 143.163 216.000 136.000 208.837 136.000 200.000 L 136.000 144.000 L 224.000 144.000 C 228.492 144.016 232.784 142.144 235.827 138.840 C 238.870 135.536 240.385 131.105 240.000 126.630 ZM 32.000 128.000 L 32.000 128.000 C 35.641 85.682 66.617 50.767 108.200 42.110 C 96.480 58.000 81.850 86.110 80.170 128.000 ZM 96.150 128.000 C 97.540 97.230 106.680 75.190 114.450 61.760 C 118.281 55.089 122.824 48.852 128.000 43.160 C 133.166 48.853 137.699 55.089 141.520 61.760 C 154.800 84.700 159.000 109.280 159.820 128.000 ZM 175.800 128.000 C 174.120 86.110 159.490 58.000 147.800 42.060 C 189.413 50.698 220.406 85.652 224.000 128.000 Z"),
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
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
