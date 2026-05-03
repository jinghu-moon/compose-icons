package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorRegularIcon(
            name = "NumberThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 160.000 C 175.999 182.082 163.021 202.102 142.863 211.118 C 122.704 220.133 99.130 216.460 82.670 201.740 C 80.430 199.866 79.389 196.919 79.955 194.054 C 80.521 191.188 82.604 188.859 85.389 187.977 C 88.174 187.096 91.218 187.802 93.330 189.820 C 106.620 201.701 126.168 203.355 141.264 193.874 C 156.360 184.393 163.360 166.066 158.430 148.936 C 153.499 131.805 137.826 120.004 120.000 120.000 C 116.970 120.000 114.200 118.288 112.845 115.578 C 111.489 112.867 111.782 109.624 113.600 107.200 L 152.000 56.000 L 88.000 56.000 C 83.582 56.000 80.000 52.418 80.000 48.000 C 80.000 43.582 83.582 40.000 88.000 40.000 L 168.000 40.000 C 171.030 40.000 173.800 41.712 175.155 44.422 C 176.511 47.133 176.218 50.376 174.400 52.800 L 134.560 105.920 C 158.991 112.534 175.968 134.689 176.000 160.000 Z"),
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
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
