package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Factory: ImageVector
    get() {
        if (_factory != null) return _factory!!
        _factory = phosphorBoldIcon(
            name = "Factory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 176.000 C 120.000 182.627 114.627 188.000 108.000 188.000 L 80.000 188.000 C 73.373 188.000 68.000 182.627 68.000 176.000 C 68.000 169.373 73.373 164.000 80.000 164.000 L 108.000 164.000 C 114.627 164.000 120.000 169.373 120.000 176.000 ZM 176.000 164.000 L 148.000 164.000 C 141.373 164.000 136.000 169.373 136.000 176.000 C 136.000 182.627 141.373 188.000 148.000 188.000 L 176.000 188.000 C 182.627 188.000 188.000 182.627 188.000 176.000 C 188.000 169.373 182.627 164.000 176.000 164.000 ZM 244.000 216.000 C 244.000 222.627 238.627 228.000 232.000 228.000 L 24.000 228.000 C 17.373 228.000 12.000 222.627 12.000 216.000 C 12.000 209.373 17.373 204.000 24.000 204.000 L 28.000 204.000 L 28.000 88.000 C 28.000 83.455 30.568 79.300 34.633 77.267 C 38.699 75.234 43.564 75.673 47.200 78.400 L 92.000 112.000 L 92.000 88.000 C 92.000 83.455 94.568 79.300 98.633 77.267 C 102.699 75.234 107.564 75.673 111.200 78.400 L 144.530 103.400 L 155.140 29.170 C 156.588 19.339 165.003 12.042 174.940 12.000 L 193.060 12.000 C 202.997 12.042 211.412 19.339 212.860 29.170 L 227.860 134.300 C 227.860 134.400 227.980 135.640 227.980 136.000 L 227.980 204.000 L 231.980 204.000 C 235.166 203.995 238.223 205.257 240.478 207.508 C 242.733 209.759 244.000 212.814 244.000 216.000 ZM 166.430 119.830 L 172.000 124.000 L 202.160 124.000 L 189.590 36.000 L 178.410 36.000 ZM 52.000 204.000 L 204.000 204.000 L 204.000 148.000 L 168.000 148.000 C 165.404 148.000 162.877 147.158 160.800 145.600 L 146.420 134.820 L 146.360 134.820 L 116.000 112.000 L 116.000 136.000 C 116.000 140.545 113.432 144.700 109.367 146.733 C 105.301 148.766 100.436 148.327 96.800 145.600 L 52.000 112.000 Z"),
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
        return _factory!!
    }

private var _factory: ImageVector? = null
