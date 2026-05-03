package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorDuotoneIcon(
            name = "NumberThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 40.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 200.000 24.000 C 208.837 24.000 216.000 31.163 216.000 40.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 176.000 160.000 C 175.999 182.082 163.021 202.102 142.863 211.118 C 122.704 220.133 99.130 216.460 82.670 201.740 C 80.430 199.866 79.389 196.919 79.955 194.054 C 80.521 191.188 82.604 188.859 85.389 187.977 C 88.174 187.096 91.218 187.802 93.330 189.820 C 106.620 201.701 126.168 203.355 141.264 193.874 C 156.360 184.393 163.360 166.066 158.430 148.936 C 153.499 131.805 137.826 120.004 120.000 120.000 C 116.970 120.000 114.200 118.288 112.845 115.578 C 111.489 112.867 111.782 109.624 113.600 107.200 L 152.000 56.000 L 88.000 56.000 C 83.582 56.000 80.000 52.418 80.000 48.000 C 80.000 43.582 83.582 40.000 88.000 40.000 L 168.000 40.000 C 171.030 40.000 173.800 41.712 175.155 44.422 C 176.511 47.133 176.218 50.376 174.400 52.800 L 134.560 105.920 C 158.991 112.534 175.968 134.689 176.000 160.000 Z"),
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
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
