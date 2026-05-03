package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) return _smileyAngry!!
        _smileyAngry = phosphorFillIcon(
            name = "SmileyAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 80.000 140.000 C 80.000 133.373 85.373 128.000 92.000 128.000 C 98.627 128.000 104.000 133.373 104.000 140.000 C 104.000 146.627 98.627 152.000 92.000 152.000 C 85.373 152.000 80.000 146.627 80.000 140.000 ZM 158.660 188.430 C 156.213 192.108 151.248 193.106 147.570 190.660 C 141.070 186.340 136.000 184.000 128.000 184.000 C 120.000 184.000 114.930 186.340 108.430 190.660 C 104.755 193.013 99.872 191.987 97.455 188.353 C 95.038 184.720 95.979 179.820 99.570 177.340 C 108.000 171.730 116.060 168.000 128.000 168.000 C 139.940 168.000 148.000 171.730 156.430 177.340 C 160.108 179.787 161.106 184.752 158.660 188.430 ZM 164.000 152.000 C 157.373 152.000 152.000 146.627 152.000 140.000 C 152.000 133.373 157.373 128.000 164.000 128.000 C 170.627 128.000 176.000 133.373 176.000 140.000 C 176.000 146.627 170.627 152.000 164.000 152.000 ZM 180.440 94.660 L 132.440 126.660 C 129.752 128.454 126.248 128.454 123.560 126.660 L 75.560 94.660 C 71.882 92.208 70.888 87.238 73.340 83.560 C 75.792 79.882 80.762 78.888 84.440 81.340 L 128.000 110.390 L 171.560 81.390 C 175.238 78.938 180.208 79.932 182.660 83.610 C 185.112 87.288 184.118 92.258 180.440 94.710 Z"),
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
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
