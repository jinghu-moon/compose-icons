package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareFour: ImageVector
    get() {
        if (_numberSquareFour != null) return _numberSquareFour!!
        _numberSquareFour = phosphorBoldIcon(
            name = "NumberSquareFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 88.000 164.000 L 132.000 164.000 L 132.000 176.000 C 132.000 182.627 137.373 188.000 144.000 188.000 C 150.627 188.000 156.000 182.627 156.000 176.000 L 156.000 164.000 L 160.000 164.000 C 166.627 164.000 172.000 158.627 172.000 152.000 C 172.000 145.373 166.627 140.000 160.000 140.000 L 156.000 140.000 L 156.000 80.000 C 156.000 74.874 152.744 70.314 147.896 68.650 C 143.048 66.986 137.678 68.585 134.530 72.630 L 78.530 144.630 C 75.715 148.247 75.206 153.153 77.220 157.271 C 79.233 161.389 83.416 164.000 88.000 164.000 ZM 132.000 115.000 L 132.000 140.000 L 112.540 140.000 Z"),
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
        return _numberSquareFour!!
    }

private var _numberSquareFour: ImageVector? = null
