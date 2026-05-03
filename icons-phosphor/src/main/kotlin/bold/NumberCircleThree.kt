package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) return _numberCircleThree!!
        _numberCircleThree = phosphorBoldIcon(
            name = "NumberCircleThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 164.000 152.000 C 164.002 168.253 154.169 182.892 139.122 189.036 C 124.074 195.180 106.805 191.609 95.430 180.000 C 92.311 176.962 91.082 172.472 92.220 168.269 C 93.357 164.066 96.682 160.809 100.908 159.759 C 105.134 158.708 109.597 160.029 112.570 163.210 C 117.655 168.389 125.589 169.496 131.898 165.907 C 138.207 162.318 141.309 154.932 139.456 147.915 C 137.603 140.897 131.258 136.006 124.000 136.000 C 119.526 135.999 115.424 133.510 113.358 129.542 C 111.292 125.574 111.605 120.786 114.170 117.120 L 129.000 96.000 L 104.000 96.000 C 97.373 96.000 92.000 90.627 92.000 84.000 C 92.000 77.373 97.373 72.000 104.000 72.000 L 152.000 72.000 C 156.474 72.001 160.576 74.490 162.642 78.458 C 164.708 82.426 164.395 87.214 161.830 90.880 L 143.490 117.080 C 156.149 124.143 163.996 137.503 164.000 152.000 Z"),
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
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
