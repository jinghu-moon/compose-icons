package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) return _numberSquareZero!!
        _numberSquareZero = phosphorBoldIcon(
            name = "NumberSquareZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 188.000 C 156.260 188.000 176.000 163.330 176.000 128.000 C 176.000 92.670 156.260 68.000 128.000 68.000 C 99.740 68.000 80.000 92.670 80.000 128.000 C 80.000 163.330 99.740 188.000 128.000 188.000 ZM 128.000 92.000 C 151.330 92.000 152.000 124.320 152.000 128.000 C 152.000 131.680 151.330 164.000 128.000 164.000 C 104.670 164.000 104.000 131.680 104.000 128.000 C 104.000 124.320 104.670 92.000 128.000 92.000 ZM 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 Z"),
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
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
