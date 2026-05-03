package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = phosphorBoldIcon(
            name = "Moped",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 124.000 C 210.780 124.000 209.570 124.060 208.380 124.160 L 175.240 35.790 C 173.484 31.104 169.005 27.999 164.000 28.000 L 132.000 28.000 C 125.373 28.000 120.000 33.373 120.000 40.000 C 120.000 46.627 125.373 52.000 132.000 52.000 L 155.680 52.000 L 185.910 132.600 C 179.217 137.538 174.049 144.261 171.000 152.000 L 141.800 152.000 L 119.240 91.790 C 117.484 87.104 113.005 83.999 108.000 84.000 L 28.000 84.000 C 21.373 84.000 16.000 89.373 16.000 96.000 C 16.000 102.627 21.373 108.000 28.000 108.000 L 32.000 108.000 L 32.000 110.920 C 12.335 121.331 0.026 141.749 0.000 164.000 C 0.000 170.627 5.373 176.000 12.000 176.000 L 16.740 176.000 C 20.612 196.845 38.799 211.964 60.000 211.964 C 81.201 211.964 99.388 196.845 103.260 176.000 L 168.740 176.000 C 172.969 198.873 194.271 214.503 217.359 211.673 C 240.447 208.844 257.344 188.533 255.925 165.316 C 254.506 142.098 235.261 123.997 212.000 124.000 ZM 48.000 130.050 C 52.797 128.354 56.003 123.818 56.000 118.730 L 56.000 108.000 L 99.680 108.000 L 116.180 152.000 L 26.060 152.000 C 29.682 141.745 37.746 133.677 48.000 130.050 ZM 60.000 188.000 C 52.051 187.996 44.859 183.285 41.680 176.000 L 78.320 176.000 C 75.141 183.285 67.949 187.996 60.000 188.000 ZM 212.000 188.000 C 200.954 188.000 192.000 179.046 192.000 168.000 C 192.000 156.954 200.954 148.000 212.000 148.000 C 223.046 148.000 232.000 156.954 232.000 168.000 C 232.000 179.046 223.046 188.000 212.000 188.000 Z"),
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
        return _moped!!
    }

private var _moped: ImageVector? = null
