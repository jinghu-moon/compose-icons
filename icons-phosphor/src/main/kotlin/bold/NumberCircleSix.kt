package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleSix: ImageVector
    get() {
        if (_numberCircleSix != null) return _numberCircleSix!!
        _numberCircleSix = phosphorBoldIcon(
            name = "NumberCircleSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 133.060 108.330 L 146.300 86.150 C 148.626 82.465 148.770 77.808 146.679 73.985 C 144.587 70.163 140.587 67.774 136.229 67.746 C 131.872 67.718 127.841 70.055 125.700 73.850 L 93.460 127.850 C 84.568 143.098 86.722 162.372 98.760 175.281 C 110.799 188.190 129.876 191.682 145.706 183.875 C 161.537 176.067 170.379 158.806 167.465 141.397 C 164.551 123.988 150.570 110.547 133.060 108.320 ZM 128.000 164.000 C 119.163 164.000 112.000 156.837 112.000 148.000 C 112.000 139.163 119.163 132.000 128.000 132.000 C 136.837 132.000 144.000 139.163 144.000 148.000 C 144.000 156.837 136.837 164.000 128.000 164.000 Z"),
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
        return _numberCircleSix!!
    }

private var _numberCircleSix: ImageVector? = null
