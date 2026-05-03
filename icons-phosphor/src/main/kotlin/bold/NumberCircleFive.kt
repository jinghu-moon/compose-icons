package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleFive: ImageVector
    get() {
        if (_numberCircleFive != null) return _numberCircleFive!!
        _numberCircleFive = phosphorBoldIcon(
            name = "NumberCircleFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 122.170 92.000 L 119.460 108.230 C 120.969 108.078 122.484 108.001 124.000 108.000 C 146.091 108.000 164.000 125.909 164.000 148.000 C 164.000 170.091 146.091 188.000 124.000 188.000 C 113.299 188.160 102.990 183.975 95.430 176.400 C 90.791 171.667 90.867 164.069 95.600 159.430 C 100.333 154.791 107.931 154.867 112.570 159.600 C 115.617 162.570 119.748 164.160 124.000 164.000 C 132.837 164.000 140.000 156.837 140.000 148.000 C 140.000 139.163 132.837 132.000 124.000 132.000 C 119.748 131.840 115.617 133.430 112.570 136.400 C 108.901 140.152 103.219 141.085 98.542 138.702 C 93.866 136.319 91.281 131.174 92.160 126.000 L 100.160 78.000 C 101.136 72.223 106.141 67.996 112.000 68.000 L 152.000 68.000 C 158.627 68.000 164.000 73.373 164.000 80.000 C 164.000 86.627 158.627 92.000 152.000 92.000 Z"),
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
        return _numberCircleFive!!
    }

private var _numberCircleFive: ImageVector? = null
