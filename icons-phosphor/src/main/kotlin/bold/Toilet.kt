package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorBoldIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 68.000 C 128.000 74.627 122.627 80.000 116.000 80.000 L 100.000 80.000 C 93.373 80.000 88.000 74.627 88.000 68.000 C 88.000 61.373 93.373 56.000 100.000 56.000 L 116.000 56.000 C 122.627 56.000 128.000 61.373 128.000 68.000 ZM 176.150 195.620 L 179.800 221.170 C 180.620 226.910 178.909 232.724 175.110 237.104 C 171.311 241.484 165.798 244.000 160.000 244.000 L 96.000 244.000 C 90.202 244.000 84.689 241.484 80.890 237.104 C 77.091 232.724 75.380 226.910 76.200 221.170 L 79.850 195.620 C 47.892 178.043 28.026 144.473 28.000 108.000 C 28.000 101.373 33.373 96.000 40.000 96.000 L 52.000 96.000 L 52.000 40.000 C 52.000 28.954 60.954 20.000 72.000 20.000 L 184.000 20.000 C 195.046 20.000 204.000 28.954 204.000 40.000 L 204.000 96.000 L 216.000 96.000 C 222.627 96.000 228.000 101.373 228.000 108.000 C 227.974 144.473 208.108 178.043 176.150 195.620 ZM 76.000 96.000 L 180.000 96.000 L 180.000 44.000 L 76.000 44.000 ZM 153.210 204.780 C 136.678 209.073 119.322 209.073 102.790 204.780 L 100.610 220.000 L 155.390 220.000 ZM 203.050 120.000 L 53.000 120.000 C 58.887 156.882 90.701 184.021 128.050 184.021 C 165.399 184.021 197.213 156.882 203.100 120.000 Z"),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
